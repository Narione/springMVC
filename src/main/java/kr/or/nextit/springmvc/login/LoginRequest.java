package kr.or.nextit.springmvc.login;

import lombok.Data;

@Data
public class LoginRequest {
    private String id;
    private String password;
}
