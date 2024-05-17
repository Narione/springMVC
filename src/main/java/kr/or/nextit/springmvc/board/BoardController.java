package kr.or.nextit.springmvc.board;

import kr.or.nextit.springmvc.common.PaginationInfo;
import kr.or.nextit.springmvc.common.SearchVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/board/")
public class BoardController {
    private final BoardService service;
    public BoardController(BoardService service) {
        this.service = service;
    }
    @GetMapping("list")
    public String boardList(SearchVO vo, @RequestParam(value = "currentPageNo", defaultValue = "1") int currentPageNo, Model model) {
        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCurrentPageNo(currentPageNo);
        paginationInfo.setRecordCountPerPage(3);
        paginationInfo.setPageSize(5);

        int totalCount = service.getBoardListCount(vo);
        paginationInfo.setTotalRecordCount(totalCount);
        // 페이징된 게시글 목록을 가져오기 위해
        vo.setFirstRecordIndex(paginationInfo.getFirstRecordIndex());
        vo.setLastRecordIndex(paginationInfo.getLastRecordIndex());
        List<BoardVO> list = service.getBoardList(vo);
        model.addAttribute("boards", list);
        model.addAttribute("pagination", paginationInfo);
        return "board/list";

    }
    @GetMapping("update")
    public String boardUpdateView(@RequestParam("no") int searchNo, Model model) {
        BoardVO vo = service.getBoard(searchNo);
        model.addAttribute("board", vo);
        return "board/update";
    }

    @PostMapping("update")
    public String boardUpdate(BoardVO vo, Model model) {
        int updated = service.updateBoard(vo);
        if (updated > 0) {
            // 등록 성공
        return "redirect:/board/list";
        } else {
            // 등록 실패
            model.addAttribute("msg", "수정 실패");
            return "board/update";
        }
    }

    @GetMapping("view")
    public String boardView(@RequestParam("no") int searchNo, Model model){
        BoardVO vo = service.getBoard(searchNo);
        model.addAttribute("board", vo);
        return "board/view";
    }

    @GetMapping("delete")
    public String boardDelete(@RequestParam("no") int deleteNo, Model model){
        int deleted = service.deleteBoard(deleteNo);
        if (deleted > 0) {
            return "redirect:/board/list";
        } else {
//            ??
            model.addAttribute("msg", "삭제 실패");
            return "redirect:/board/view";
        }
    }

    @GetMapping("add")
    public String boardAddView(Model model){
        return "board/add";
    }

    @PostMapping("add")
    public String boardAdd(BoardVO vo, Model model){


//        // 모든 input 태그들은 multipart/form-data로 전송시 part에 담긴다.
//        // 이 때 파일을 제외한 나머지는 request.getParameter()로 가져오는 게 편하고
//        // 첨부파일만 getPart()를 통해 가져온다.
//        Part part = request.getPart("uploadFile");
//        // 업로드된 첨부파일의 파일 크기를 알고 싶으면
//        long fileSize = part.getSize();
//        // 업로드된 첨부파일의 이름을 알고 싶으면
//        String fileName=part.getSubmittedFileName();
//        System.out.println("file size: "+fileSize);
//        System.out.println("file name: "+ fileName);
//        //파일쓰기
//        part.write("c:\\temp\\" + fileName);
//        part.delete();

        int inserted = service.insertBoard(vo);
        if (inserted > 0) {
            // 등록 성공
            return "redirect:/board/list";
        } else {
            // 등록 실패
            model.addAttribute("msg", "등록 실패");
            return "board/add";
        }
    }
}
