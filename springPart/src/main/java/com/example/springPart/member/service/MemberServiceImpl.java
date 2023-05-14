package com.example.springPart.member.service;

import com.example.springPart.member.entity.Member;
import com.example.springPart.member.form.MemberLoginRequestForm;
import com.example.springPart.member.form.MemberLoginResponseForm;
import com.example.springPart.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    final private MemberRepository memberRepository;

    @Override
    public MemberLoginResponseForm login(MemberLoginRequestForm requestForm) {
        Optional<Member> correctedMember=
                memberRepository.findByEmail(requestForm.getEmail());
        if(correctedMember.isEmpty()){
            log.info("로그인 실패");
            return new MemberLoginResponseForm(null);
        }
        Member member=correctedMember.get();
        if(member.getPassword().equals(requestForm.getPassword())){
            log.info("로그인 성공");
            return new MemberLoginResponseForm(UUID.randomUUID());
        }
        return new MemberLoginResponseForm(null);
    }
}
