package com.example.book.member.controller;


import com.example.book.member.form.MemberForm;
import com.example.book.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String login(){
        return "/member/login";
    }
    @GetMapping("/join")
    public String showJoin(){
        return "/member/join";
    }

    @PostMapping("/join")
    public String join(@Valid MemberForm memberForm){
        memberService.join(memberForm.getUsername(),memberForm.getPassword(),memberForm.getEmail(),memberForm.getNickname());

        return "redirect:/member/login";
    }


}