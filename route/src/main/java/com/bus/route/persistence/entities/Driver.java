package com.bus.route.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String cpf;
    private String cnh;
    private String categoryCnh;
    private LocalDateTime dateofBirth;
    private String phoneNumber;
    private String status;

    public Driver() {

    }

    public Driver(long id, String name, String cpf, String cnh, String categoryCnh, LocalDateTime dateofBirth, String phoneNumber, String status) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.cnh = cnh;
        this.categoryCnh = categoryCnh;
        this.dateofBirth= dateofBirth;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoryCnh() {
        return categoryCnh;
    }

    public void setCategoryCnh(String categoryCnh) {
        this.categoryCnh = categoryCnh;
    }

    public LocalDateTime getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDateTime dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
