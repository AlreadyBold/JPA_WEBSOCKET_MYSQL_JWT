package com.JpaChat.jpachatstudy.service;

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

public class updateUserService {

    final UserRepository userrepository;

    @Transactional
    public void updateUser(SaveRequest SaveRequest) throws Exception {
        Optional<User> userOpt = userrepository.findById(SaveRequest.getEmail());
        if (userOpt.isPresent()) {
            userrepository.update(SaveRequest.getEmail(), "nativeQuery");
        } else {
            throw new DupException();
        }

    }
}
