package kr.or.nextit.springmvc.member;

import kr.or.nextit.springmvc.exception.WrongIdPasswordException;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Member {
    private String id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    public void changePassword(String oldPassword, String newPassword){
        if(!password.equals(oldPassword))
            throw new WrongIdPasswordException();
        this.password=newPassword;
    }
}
