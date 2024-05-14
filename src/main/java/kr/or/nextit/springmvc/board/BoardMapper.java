package kr.or.nextit.springmvc.board;

import java.util.List;

import kr.or.nextit.springmvc.common.SearchVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	int getBoardListCount(SearchVO vo);
	List<BoardVO> getBoardList(SearchVO vo);
	BoardVO getBoard(int searchNo);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(int deleteNo);
}
