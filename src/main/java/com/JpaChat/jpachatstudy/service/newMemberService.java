package com.JpaChat.jpachatstudy.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.JpaChat.jpachatstudy.model.member;
import com.JpaChat.jpachatstudy.model.membersaveRequest;
import com.JpaChat.jpachatstudy.repository.memberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class newMemberService {

    final memberRepository memberrepository;

    @Transactional
    public void saveMember(membersaveRequest membersaveRequest) {
        member newmember = new member(membersaveRequest.getid(), membersaveRequest.getnickname(),
                membersaveRequest.getpwd(),
                LocalDateTime.now());
        memberrepository.save(newmember);
    }

}
