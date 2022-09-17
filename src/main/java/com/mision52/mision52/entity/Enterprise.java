package com.mision52.mision52.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Enterprise {

    @Id
    private long id;

    @OneToMany
    private Employee employee;
}
