package kr.or.nextit.springmvc.regist;

import kr.or.nextit.springmvc.member.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegisterMapper {
    List<Member> selectAll();
    Member selectByEmail(String email);
    Member selectById(String id);
    void insert(RegisterRequest request);
}
