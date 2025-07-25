package com.bus.route.persistence.entities;

import com.bus.route.enums.StatusBus;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String plate;
    private String model;
    private String brand;
    private Integer fabricationYear;
    private Integer capacity;
    private StatusBus statusBus;

    public StatusBus getStatusBus() {
        return statusBus;
    }

    public void setStatusBus(StatusBus statusBus) {
        this.statusBus = statusBus;
    }

    public Bus(StatusBus statusBus) {
        this.statusBus = statusBus;
    }

    public Bus() {

    }

    public Bus(Long id, String plate, String model, String brand, Integer fabricationYear, Integer capacity) {
        this.id = id;
        this.plate = plate;
        this.model = model;
        this.brand = brand;
        this.fabricationYear = fabricationYear;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(Integer fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
