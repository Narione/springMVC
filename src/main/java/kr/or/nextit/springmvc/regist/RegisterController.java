package kr.or.nextit.springmvc.regist;

import kr.or.nextit.springmvc.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/register/")
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterService service;
//    public RegisterController(RegisterService service) {
//        this.service = service;
//    }
    @GetMapping("step1")
    public String step1(){
        return "register/step1";
    }
    @PostMapping("step2")
    public String step2(boolean agree){
        System.out.println("agree:"+agree);
        if(agree){
        return "register/step2";
        }
        return "redirect:/register/step1";
    }
    @PostMapping("step3")
    public String step3(RegisterRequest register){
        System.out.println("이메일: "+register.getEmail());
        System.out.println("이름: "+register.getName());
        System.out.println("패스워드: "+register.getPassword());
        System.out.println("패스워드확인: "+register.getConfirmPassword());

        return "register/step3";
    }
    @GetMapping("list")
    public String selectAll(Model model) {
        List<Member> members = service.selectAll();
        model.addAttribute("members", members);
        return "register/list";
    }
}
