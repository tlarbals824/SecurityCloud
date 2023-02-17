package com.study.securitycloud.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "USERS")
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	@Builder
	public User(Long id, String username) {
		this.id = id;
		this.username = username;
	}
}
