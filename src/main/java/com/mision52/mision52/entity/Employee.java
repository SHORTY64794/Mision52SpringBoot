package com.mision52.mision52.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee") //se crea una tabla llamada 'employee'
public class Employee {


    @Id // se crea una columna id
    @GeneratedValue(strategy = GenerationType.AUTO) // el id se va a generar de forma automática
    private long id;

    @Column (name="email", unique = true) //se crea otra columna llamada 'email' y va a ser única
    private String email;

    @ManyToOne
    private Enterprise enterprise;

    private Date updateAt;
    private Date createdAt;

    public Employee(){ // constructor vacío

    }

    // constructor con parámetros
    public Employee(long id, String email, Enterprise enterprise, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.enterprise = enterprise;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
