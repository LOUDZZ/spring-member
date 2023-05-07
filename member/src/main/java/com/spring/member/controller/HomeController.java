package com.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본페이지 요청 메소드
    // "/"로 get요청이 오면 index() 메소드가 호출 - spring이 지원하는 기능.
    @GetMapping("/")
    public String index() {
        return "index"; // => templates 폴더의 index.html을 찾아감(spring의 view resolver가 설정해준 경로)
    }
}
