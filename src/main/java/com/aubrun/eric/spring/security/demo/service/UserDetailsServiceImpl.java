package com.aubrun.eric.spring.security.demo.service;

import com.aubrun.eric.spring.security.demo.domain.User;
import com.aubrun.eric.spring.security.demo.repositories.UserRepository;
import com.aubrun.eric.spring.security.demo.security.CustomSecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("Username and or password was incorrect !");
        }
        return new CustomSecurityUser(user);
    }
}
