package com.api.productos.mypackages.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Table(name="carro")
@Entity
public class Carro implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "dataFabricacao")
    @Temporal(TemporalType.DATE)
    private Calendar dataFabricacao;
    //private Date dataFabricacao;

    public Carro() {

    }

    public Carro(String modelo, String marca, Calendar dataFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
    }

    public Carro(int id, String modelo, String marca, Calendar dataFabricacao) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
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

    @Override
    public String toString() {
        return "Carro [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", dataFabricacao=" + dataFabricacao + "]";
    }


}
