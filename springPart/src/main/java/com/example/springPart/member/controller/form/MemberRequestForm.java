package com.example.springPart.member.controller.form;

import com.example.springPart.member.entity.Member;
import com.example.springPart.member.entity.RoleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberRequestForm {

    final private String email;
    final private String password;
    @JsonProperty("roleType")
    final private RoleType roleType;

    public Member toMember() {
        return new Member(email, password);
    }
}
