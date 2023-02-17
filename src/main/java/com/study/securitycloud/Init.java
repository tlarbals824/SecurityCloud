package com.study.securitycloud;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.securitycloud.user.domain.User;
import com.study.securitycloud.user.repository.UserRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Init {
	private final UserRepository userRepository;

	@PostConstruct
	public void init(){
		User user = User.builder().username("test").build();
		userRepository.save(user);
	}
}
