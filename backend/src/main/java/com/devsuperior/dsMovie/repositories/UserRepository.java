package com.devsuperior.dsMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsMovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
