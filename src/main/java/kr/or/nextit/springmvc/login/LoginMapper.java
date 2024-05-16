package kr.or.nextit.springmvc.login;

import kr.or.nextit.springmvc.member.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    Member findMember(LoginRequest login);
}
