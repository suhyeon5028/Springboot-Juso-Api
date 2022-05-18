package site.metacoding.springbootjusoapi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // 메인페이지
    @GetMapping("/")
    public String main() {
        return "main";
    }
    
    // 회원가입 페이지
    @GetMapping("/joinForm")
    public String join() {
        return "joinForm";
    }

    // 로그인 페이지
    @GetMapping("/loginForm")
    public String login() {
        return "loginForm";
    }
}
