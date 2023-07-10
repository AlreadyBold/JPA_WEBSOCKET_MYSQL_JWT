package com.JpaChat.jpachatstudy.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.JpaChat.jpachatstudy.exception.NoUserException;
import com.JpaChat.jpachatstudy.model.User;
import com.JpaChat.jpachatstudy.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class deleteUserService {
    final UserRepository userrepository;

    @Transactional
    public void deleteUser(String email) {
        Optional<User> userOpt = userrepository.findById(email);
        User user = userOpt.orElseThrow(() -> new NoUserException());
        userrepository.delete(user);
    }
}
