package com.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {
    // 회원가입 페이지 get요청
    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping ("/member/save")
    public String save(@RequestParam("memberEmail") String memberEmail,
                       @RequestParam("memberPassword") String memberPassword,
                       @RequestParam("memberName") String memberName) {
        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
        return "index";
    }

    // 로그인 페이지 get요청
    @GetMapping("/member/login")
    public String login() {
        return "login";
    }
}