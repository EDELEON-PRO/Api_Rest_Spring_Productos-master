package com.api.productos.mypackages.models;

import com.api.productos.mypackages.entities.Carro;

import java.util.Calendar;

public class CarroModel {
    private int id;
    private String modelo;
    private String marca;
    private Calendar dataFabricacao;

    public CarroModel() {
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Calendar getDataFabricacao() {
        return dataFabricacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDataFabricacao(Calendar dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public CarroModel(String modelo, String marca, Calendar dataFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
    }

    public CarroModel(int id, String modelo, String marca, Calendar dataFabricacao) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
    }
    public CarroModel(Carro objetoCarro) {
        this.id = objetoCarro.getId();
        this.modelo = objetoCarro.getModelo();
        this.marca = objetoCarro.getMarca();
        this.dataFabricacao=objetoCarro.getDataFabricacao();
    }
    @Override
    public String toString() {
        return "Carro [id=" + id + ", modelo=" + modelo + ", marca=" + marca +", dataFabricacao=" + dataFabricacao +  "]";
    }
}
