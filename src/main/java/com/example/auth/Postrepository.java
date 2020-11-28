package com.example.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Postrepository extends JpaRepository<Post, String>{
	Post findByAuthorId(String authorId);

}
