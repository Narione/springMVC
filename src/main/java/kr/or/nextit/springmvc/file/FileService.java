package kr.or.nextit.springmvc.file;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FileService {
    private final FileMapper mapper;

    public void saveFiles(int boardNo, List<FileVO> files){
        if(files.isEmpty()){
            return;
        }
        for(FileVO file : files){
            file.setBoardNo(boardNo);
        }

        mapper.saveFiles(files);
    }

}
