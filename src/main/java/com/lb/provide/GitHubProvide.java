package com.lb.provide;

import com.alibaba.fastjson.JSON;
import com.lb.dto.AccessTokenDto;
import com.lb.dto.GitHubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;


/**
 * @author 李彪(libiao)
 * 2019/10/11   16:13
 */
//仅仅把初始化到spring的上下文
@Component
public class GitHubProvide extends GitHubUser {
    private String url = "https://github.com/login/oauth/access_token";

    public String getAccessToken(AccessTokenDto accessTokenDto) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDto));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token=string.split("&")[0].split("=")[1];
            System.out.println(token);
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
