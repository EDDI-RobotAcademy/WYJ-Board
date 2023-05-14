package com.example.springPart.member.controller;


import com.example.springPart.member.form.MemberLoginRequestForm;
import com.example.springPart.member.form.MemberLoginResponseForm;
import com.example.springPart.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class MemberController {
    private MemberService memberService;

    @PostMapping("/login")
    public MemberLoginResponseForm isLogin(@RequestBody MemberLoginRequestForm loginRequestForm){
        MemberLoginResponseForm memberLoginResponseForm =
                memberService.login(loginRequestForm);
        return memberLoginResponseForm;
    }
}
