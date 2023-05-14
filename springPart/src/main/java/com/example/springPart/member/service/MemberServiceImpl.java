package com.example.springPart.member.service;

import com.example.springPart.member.controller.form.MemberRequestForm;
import com.example.springPart.member.entity.Member;
import com.example.springPart.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    final private MemberRepository memberRepository;
    @Override
    public Member register(MemberRequestForm requestForm) {
        //가입한 회원이면?
        final Optional<Member> maybeMember = memberRepository.findByEmail(requestForm.getEmail());
        if(maybeMember.isPresent()) {
            log.debug("이미 등록된 회원이라 가입할 수 없습니다.");
            return null;
        }

        return memberRepository.save(requestForm.toMember());
    }
}
