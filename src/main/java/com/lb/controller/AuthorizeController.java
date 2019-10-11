package com.lb.controller;

import com.lb.dto.AccessTokenDto;
import com.lb.dto.GitHubUser;
import com.lb.provide.GitHubProvide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenDto accessTokenDto = new AccessTokenDto();
        accessTokenDto.setCode(code);
        accessTokenDto.setClient_id(clientId);
        accessTokenDto.setClient_secret(clientSecret);
        accessTokenDto.setRedirect_uri(redirectUri);
        accessTokenDto.setState(state);
        String accessToken=gitHubProvide.getAccessToken(accessTokenDto);
        GitHubUser gitHubUser=gitHubProvide.getUser(accessToken);
        System.out.println(gitHubUser.getId()+gitHubUser.getLogin());
        return "index";
    }
}
