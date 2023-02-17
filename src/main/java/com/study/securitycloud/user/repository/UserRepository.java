package com.study.securitycloud.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.securitycloud.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
