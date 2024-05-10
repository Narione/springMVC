package kr.or.nextit.springmvc.regist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register/")
public class RegisterController {
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

        return "register/step2";
    }
}
