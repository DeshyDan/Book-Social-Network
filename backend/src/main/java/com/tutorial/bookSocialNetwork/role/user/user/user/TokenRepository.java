package com.tutorial.bookSocialNetwork.role.user.user.user;

import com.tutorial.bookSocialNetwork.role.user.user.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {
    Optional<Token> findByToken(String token);
}
