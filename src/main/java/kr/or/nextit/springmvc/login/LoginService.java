package kr.or.nextit.springmvc.login;

import kr.or.nextit.springmvc.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final LoginMapper mapper;

    public Member findMember(LoginRequest login) {
        return mapper.findMember(login);
    }


}
