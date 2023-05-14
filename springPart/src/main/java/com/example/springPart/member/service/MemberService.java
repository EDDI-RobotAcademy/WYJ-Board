package com.example.springPart.member.service;

import com.example.springPart.member.controller.form.MemberRequestForm;
import com.example.springPart.member.entity.Member;

public interface MemberService {
    Member register(MemberRequestForm requestForm);
}
