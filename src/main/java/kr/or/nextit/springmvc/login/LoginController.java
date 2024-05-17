package kr.or.nextit.springmvc.login;

import kr.or.nextit.springmvc.member.Member;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartResolver;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LoginController {
    private final LoginService service;
    @GetMapping("/login")
    public String loginView(String location, Model model) {
        model.addAttribute("location", location);
        return "common/login";
    }

    @PostMapping("/login")
    public String login(LoginRequest login, HttpSession session, Model model) {
        Member member = service.findMember(login);
        if(member != null) {
            session.setAttribute("member", member);
            return "redirect:/index";
        }
        model.addAttribute("msg", "로그인 실패");
        return "common/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        //세션의 모든 데이터 지우기
        session.invalidate();
        return "redirect:/index";
    }

    @PostMapping("/ajaxLogin")
    @ResponseBody
    public Map<String, String> ajaxLogin(LoginRequest login, @RequestParam(required = false) String location, HttpSession session) {

        // 성공할 경우 {"msg" : "success"}
        // 실패할 경우 {"msg" : "failed"}
        log.debug("location: {}", location);
        HashMap<String, String> map = new HashMap<>();
        Member member = service.findMember(login);
        if(member != null) {
        map.put("msg", location);
        session.setAttribute("member", member);
        }else{
            map.put("msg", "failure");
        }
        return map;
    }
}
