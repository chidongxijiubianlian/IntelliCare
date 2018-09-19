package com.andon.intellihouse.IntelliCare.entity.base;

/**
 * @author by yangzhi
 * @date 2018.09.10 10:52
 * @Moode o_O
 **/
public class LoginBase {
    protected String UN;
    protected String AccessToken;

    public String getUN() {
        return UN;
    }

    public void setUN(String UN) {
        this.UN = UN;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }
}
