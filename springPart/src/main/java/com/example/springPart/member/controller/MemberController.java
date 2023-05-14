package com.example.springPart.member.controller;

import com.example.springPart.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {
    final private MemberService memberService;
}