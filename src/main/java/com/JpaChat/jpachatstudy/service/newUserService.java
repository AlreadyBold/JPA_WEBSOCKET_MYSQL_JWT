package com.JpaChat.jpachatstudy.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.JpaChat.jpachatstudy.exception.DupException;
import com.JpaChat.jpachatstudy.model.SaveRequest;
import com.JpaChat.jpachatstudy.model.User;
import com.JpaChat.jpachatstudy.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class newUserService {

    final UserRepository userrepository;

    @Transactional
    public void saveUser(SaveRequest SaveRequest) {
        Optional<User> userOpt = userrepository.findById(SaveRequest.getEmail());
        if (userOpt.isPresent())
            throw new DupException();
        User newUser = new User(SaveRequest.getEmail(), SaveRequest.getName(), LocalDateTime.now());
        userrepository.save(newUser);
    }
}
