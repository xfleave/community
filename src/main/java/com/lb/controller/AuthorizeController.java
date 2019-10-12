package com.lb.controller;

import com.lb.dto.AccessTokenDto;
import com.lb.dto.GitHubUser;
import com.lb.mapper.UserMapper;
import com.lb.model.User;
import com.lb.provide.GitHubProvide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author 李彪(libiao)
 * 2019/10/11   16:04
 */
@Controller
public class AuthorizeController {
    @Autowired
    private GitHubProvide gitHubProvide;
    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("${github.redirect.uri}")
    private String redirectUri;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletResponse response) {
        AccessTokenDto accessTokenDto = new AccessTokenDto();
        accessTokenDto.setCode(code);
        accessTokenDto.setClient_id(clientId);
        accessTokenDto.setClient_secret(clientSecret);
        accessTokenDto.setRedirect_uri(redirectUri);
        accessTokenDto.setState(state);
        String accessToken = gitHubProvide.getAccessToken(accessTokenDto);
        GitHubUser gitHubUser = gitHubProvide.getUser(accessToken);
        if (gitHubUser != null) {
            //登录成功
            User user=new User();
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setName(gitHubUser.getName());
            user.setAccountId(String.valueOf(gitHubUser.getId()));
            user.setCreateTime(System.currentTimeMillis());
            user.setGetModifie(user.getCreateTime());
            userMapper.insert(user);
            response.addCookie(new Cookie("token",token));
            return "redirect:/";
        } else {
            //登录失败
            return "redirect:/";

        }
    }
}
