package com.aubrun.eric.spring.security.demo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="\"User\"")
public class User {
    private Long id;
    private String username;
    private String password;
    private Set<Authorities> authorities = new HashSet<>();

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="user")
    public Set<Authorities> getAuthorities() {
        return authorities;
    }
    public void setAuthorities(Set<Authorities> authorities) {
        this.authorities = authorities;
    }
}