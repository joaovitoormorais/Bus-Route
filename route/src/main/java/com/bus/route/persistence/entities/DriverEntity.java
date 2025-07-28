package com.bus.route.persistence.entities;

import com.bus.route.enums.StatusDriver;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_drivers", schema = "public")
public class DriverEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String cpf;
    private String cnh;
    private String cnhCategory;
    private LocalDateTime yearofBirth;
    private String phoneNumber;
    private String status;
    private StatusDriver statusDriver;

    public StatusDriver getStatusDriver() {
        return statusDriver;
    }

    public void setStatusDriver(StatusDriver statusDriver) {
        this.statusDriver = statusDriver;
    }

    public DriverEntity(StatusDriver statusDriver) {
        this.statusDriver = statusDriver;
    }

    public DriverEntity() {

    }

    public DriverEntity(Long id, String name, String cpf, String cnh, String cnhCategory, LocalDateTime yearofBirth, String phoneNumber, String status) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.cnh = cnh;
        this.cnhCategory = cnhCategory;
        this.yearofBirth = yearofBirth;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCnhCategory() {
        return cnhCategory;
    }

    public void setCnhCategory(String cnhCategory) {
        this.cnhCategory = cnhCategory;
    }

    public LocalDateTime getYearofBirth() {
        return yearofBirth;
    }

    public void setYearofBirth(LocalDateTime yearofBirth) {
        this.yearofBirth = yearofBirth;
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
