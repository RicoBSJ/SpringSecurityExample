package com.aubrun.eric.spring.security.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@SequenceGenerator(name = "user_account_id_generator", sequenceName = "user_account_id_seq", allocationSize = 1)
@Table(name = "USER_ACCOUNT")
public class UserAccount {

    private Long id;
    private String username;
    private String password;
    private Set<Authorities> authorities = new HashSet<>();

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_account_id_generator")
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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "UserAccount")
    public Set<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authorities> authorities) {
        this.authorities = authorities;
    }
}
