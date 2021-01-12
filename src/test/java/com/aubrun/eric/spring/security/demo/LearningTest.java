package com.aubrun.eric.spring.security.demo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class LearningTest {

    @Test
    public void encrypt_password(){

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String encodePassword = passwordEncoder.encode("password123");

        System.out.println(encodePassword);
    }
}
