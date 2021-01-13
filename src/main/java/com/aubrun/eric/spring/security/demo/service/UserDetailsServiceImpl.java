package com.aubrun.eric.spring.security.demo.service;

import com.aubrun.eric.spring.security.demo.domain.UserAccount;
import com.aubrun.eric.spring.security.demo.repositories.UserAccountRepository;
import com.aubrun.eric.spring.security.demo.security.CustomSecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserAccount userAccount = userAccountRepository.findByUsername(username);

        if (userAccount == null){
            throw new UsernameNotFoundException("Username and or password was incorrect !");
        }
        return new CustomSecurityUser();
    }
}
