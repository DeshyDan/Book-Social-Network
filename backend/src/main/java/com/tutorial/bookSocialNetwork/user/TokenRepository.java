package com.tutorial.bookSocialNetwork.user;

import java.util.Optional;

public interface TokenRepository {//extends JpaRepository<Token, Integer> {

    Optional<Token> findByToken(String token);
}
