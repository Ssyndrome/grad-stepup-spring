package com.thoughtworks.serverproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String name;

    @OneToOne
    private User user;

    @ManyToMany
    @JoinTable(name = "t_role_privilege",
            joinColumns =
                    @JoinColumn(name = "role_code", referencedColumnName = "code"),
            inverseJoinColumns =
                    @JoinColumn(name="privilege_code", referencedColumnName="code")
    )
    private List<Privilege> privileges;
}
