package kr.or.nextit.springmvc.file;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class FileVO {
    private int id;
    private int boardNo;
    private String filePath;
    private String fileName;
    private String originalName;
    private long fileSize;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;
}
