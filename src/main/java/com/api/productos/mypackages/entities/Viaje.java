package com.api.productos.mypackages.entities;

import javax.persistence.*;
import java.util.Calendar;

@Table(name="viaje")
@Entity
public class Viaje {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "usuarioid")
    private int usuarioid;
    @Column(name = "carroid")
    private int carroid;
    @Column(name = "dataretirada")
    @Temporal(TemporalType.DATE)
    private Calendar dataretirada;
    @Column(name = "dataentrega")
    @Temporal(TemporalType.DATE)
    private Calendar dataentrega;

    public Viaje(int id, int usuarioid, int carroid, Calendar dataretirada, Calendar dataentrega) {
        this.id = id;
        this.usuarioid = usuarioid;
        this.carroid = carroid;
        this.dataretirada = dataretirada;
        this.dataentrega = dataentrega;
    }

    public Viaje(int usuarioid, int carroid, Calendar dataretirada, Calendar dataentrega) {
        this.usuarioid = usuarioid;
        this.carroid = carroid;
        this.dataretirada = dataretirada;
        this.dataentrega = dataentrega;
    }

    public Viaje() {
    }

    @Override
    public String toString() {
        return "Viaje [id=" + id + ", usuarioid=" + usuarioid + ", carroid=" + carroid + ", dataretirada=" + dataretirada +", dataentrega=" + dataentrega + "]";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public void setCarroid(int carroid) {
        this.carroid = carroid;
    }

    public void setDataretirada(Calendar dataretirada) {
        this.dataretirada = dataretirada;
    }

    public void setDataentrega(Calendar dataentrega) {
        this.dataentrega = dataentrega;
    }

    public int getId() {
        return id;
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public int getCarroid() {
        return carroid;
    }

    public Calendar getDataretirada() {
        return dataretirada;
    }

    public Calendar getDataentrega() {
        return dataentrega;
    }
}
