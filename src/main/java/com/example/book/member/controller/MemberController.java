package com.example.book.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/login")
    @ResponseBody
    public String login(){
        return "로그인페이지입니다,";
    }
    @GetMapping("/join")
    @ResponseBody
    public String join(){
        return "회원가입페이지입니다,";
    }


}