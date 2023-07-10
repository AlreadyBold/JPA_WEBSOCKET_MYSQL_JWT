package com.JpaChat.jpachatstudy.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.JpaChat.jpachatstudy.exception.NoUserException;
import com.JpaChat.jpachatstudy.model.User;
import com.JpaChat.jpachatstudy.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class getUserService {

    // JPA REPOSITORY FINAL 필수 .. . .
    final UserRepository userrepository;

    public User getUser(String email) {
        Optional<User> userOpt = userrepository.findById(email);
        return userOpt.orElseThrow(() -> new NoUserException());
    }
}
