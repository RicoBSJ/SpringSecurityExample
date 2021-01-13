package com.aubrun.eric.spring.security.demo.repositories;

import com.aubrun.eric.spring.security.demo.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    UserAccount findByUsername(String username);
}
