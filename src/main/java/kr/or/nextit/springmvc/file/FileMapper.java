package kr.or.nextit.springmvc.file;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {
    void saveFiles(List<FileVO> files);
    // 한 게시글의 파일 목록을 가져오기
    List<FileVO> selectFileList(int boardNo);
    // 한개의 파일을 다운로드할 때 파일 정보 가져오기
    FileVO selectFile(int id);
}
