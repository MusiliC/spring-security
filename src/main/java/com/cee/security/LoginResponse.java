package com.cee.security;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class LoginResponse {
    private String jwtToken;
    private String username;
    private List<String> roles;

    public LoginResponse( String username, List<String> roles,  String jwtToken) {
        this.username = username;
        this.roles = roles;
        this.jwtToken = jwtToken;

    }
}
