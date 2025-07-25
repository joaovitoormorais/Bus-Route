package com.bus.route.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String origin;
    private String destiny;
    private String leavingTime;
    private String arrivalTime;
    private String frequency;
    private Double distanceKm;

    public Route() {

    }

    public Route(Integer id, String origin, String destiny, String leavingTime, String arrivalTime, String frequency, Double distanceKm) {
        this.id = id;
        this.origin = origin;
        this.destiny = destiny;
        this.leavingTime = leavingTime;
        this.arrivalTime = arrivalTime;
        this.frequency = frequency;
        this.distanceKm = distanceKm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(String leavingTime) {
        this.leavingTime = leavingTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
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
        this.distanceKm = this.distanceKm;
    }
}

