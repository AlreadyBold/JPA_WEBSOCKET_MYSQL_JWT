package com.JpaChat.jpachatstudy.repository;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.JpaChat.jpachatstudy.model.member;

public interface memberRepository extends Repository<member, String> {

    Optional<member> findById(String id);

    void save(member member);

}
