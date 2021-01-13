package com.aubrun.eric.spring.security.demo.security;

import com.aubrun.eric.spring.security.demo.domain.UserAccount;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomSecurityUser extends UserAccount implements UserDetails {

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
