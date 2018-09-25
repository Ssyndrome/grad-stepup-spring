package com.thoughtworks.serverproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telephoneNumber;
    private String password;

    private int role_id;

    @OneToOne
    private Role role;

}
