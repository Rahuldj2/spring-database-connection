package com.sqldb.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skills {
    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "skill_name")
    private String skill_name;
}
