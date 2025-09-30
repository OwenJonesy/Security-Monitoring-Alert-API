package com.jones.security_alert_api.auth;

public record AuthRequest(String email, String password) {
    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

}
