package com.aubrun.eric.spring.security.demo.domain;

import com.aubrun.eric.spring.security.demo.security.CustomSecurityUser;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authorities implements GrantedAuthority {

    private Long id;
    private String authority;
    private CustomSecurityUser customSecurityUser;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public CustomSecurityUser getCustomSecurityUser() {
        return customSecurityUser;
    }

    public void setCustomSecurityUser(CustomSecurityUser customSecurityUser) {
        this.customSecurityUser = customSecurityUser;
    }
}
