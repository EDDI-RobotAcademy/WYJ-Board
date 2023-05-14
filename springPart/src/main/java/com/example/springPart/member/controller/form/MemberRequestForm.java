package com.example.springPart.member.controller.form;

import com.example.springPart.member.entity.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberRequestForm {

    final private String email;
    final private String password;

    public Member toMember() {
        return new Member(email, password);
    }
}
