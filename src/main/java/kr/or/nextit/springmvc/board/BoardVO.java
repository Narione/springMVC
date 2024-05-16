package kr.or.nextit.springmvc.board;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
public class BoardVO {
	private int no;
	private String writer;
	private String title;
	private String content;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate createDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate modifyDate;
	private int hits;

//	public void setCreateDate(String createDate) {
//		this.createDate = LocalDate.parse(createDate);
//	}

}
