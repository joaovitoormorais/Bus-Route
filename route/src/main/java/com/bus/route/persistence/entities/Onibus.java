package com.bus.route.persistence.entities;

import com.bus.route.enums.StatusOnibus;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_onibus")
public class Onibus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String placa;
    private String modelo;
    private String marca;
    private Integer anoFabricacao;
    private Integer capacidade;
    private StatusOnibus statusOnibus;

    public StatusOnibus getStatusOnibus() {
        return statusOnibus;
    }

    public void setStatusOnibus(StatusOnibus statusOnibus) {
        this.statusOnibus = statusOnibus;
    }

    public Onibus(StatusOnibus statusOnibus) {
        this.statusOnibus = statusOnibus;
    }

    public Onibus() {

    }

    public Onibus(Long id, String placa, String modelo, String marca, Integer anoFabricacao, Integer capacidade) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

}
