package com.example.springPart.member.service;


import com.example.springPart.member.form.MemberLoginRequestForm;
import com.example.springPart.member.form.MemberLoginResponseForm;

public interface MemberService {
    MemberLoginResponseForm login(MemberLoginRequestForm requestForm);
}
