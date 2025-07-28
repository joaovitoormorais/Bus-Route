package com.bus.route.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_routes", schema = "public")
public class RouteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String origin;
    private String destiny;
    private LocalDateTime leavingTime;
    private LocalDateTime arrivalTime;
    private String frequency;
    private Double distanceKm;

    public RouteEntity() {

    }

    public RouteEntity(Long id, String origin, String destiny, LocalDateTime leavingTime, LocalDateTime arrivalTime, String frequency, Double distanceKm) {
        this.id = id;
        this.origin = origin;
        this.destiny = destiny;
        this.leavingTime = leavingTime;
        this.arrivalTime = arrivalTime;
        this.frequency = frequency;
        this.distanceKm = distanceKm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public LocalDateTime getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(LocalDateTime leavingTime) {
        this.leavingTime = leavingTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(Double distanceKm) {
        this.distanceKm = distanceKm;
    }
}
