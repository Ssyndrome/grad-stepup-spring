package com.thoughtworks.serverproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_privilege")
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String name;

    @ManyToMany
    @JoinTable(name = "t_role_privilege",
            joinColumns =
                    @JoinColumn(name = "privilege_code", referencedColumnName = "code"),
            inverseJoinColumns =
                    @JoinColumn(name = "role_code", referencedColumnName = "code")
    )
    private List<Role> roles;
}
