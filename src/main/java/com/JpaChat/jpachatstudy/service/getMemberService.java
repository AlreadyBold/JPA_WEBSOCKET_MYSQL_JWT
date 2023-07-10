package com.JpaChat.jpachatstudy.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.JpaChat.jpachatstudy.exception.NoUserException;
import com.JpaChat.jpachatstudy.model.member;
import com.JpaChat.jpachatstudy.repository.memberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class getMemberService {

    final memberRepository memberrepository;

    public member getUser(String email) {
        Optional<member> memberOpt = memberrepository.findById(email);
        return memberOpt.orElseThrow(() -> new NoUserException());
    }
}
