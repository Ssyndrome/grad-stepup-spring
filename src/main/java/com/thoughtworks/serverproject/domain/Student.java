package com.thoughtworks.serverproject.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "t_student")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private int height;

    @ManyToOne
    private Classroom classroom;
}
