package kr.or.nextit.springmvc.regist;

import lombok.Data;

@Data
public class RegisterRequest {
    private String id;
    private String email;
    private String name;
    private String password;
    private String confirmPassword;

}
