package com.sisyphus.auth.app.jwt;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhecheng.zhao
 * @date Created in 08/06/2021 17:43
 */
public class IJwtTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        Map<String, Object> info = new HashMap<>();
//        info.put("company", "imooc");
        // 设置附加信息
        ((DefaultOAuth2AccessToken)accessToken).setAdditionalInformation(info);

        return accessToken;
    }
}
