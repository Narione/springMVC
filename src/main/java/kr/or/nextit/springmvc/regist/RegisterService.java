package kr.or.nextit.springmvc.regist;

import kr.or.nextit.springmvc.member.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    private RegisterMapper mapper;
    public RegisterService(RegisterMapper mapper) {
        this.mapper = mapper;
    }
    public List<Member> selectAll() {
        return mapper.selectAll();
    }
}
