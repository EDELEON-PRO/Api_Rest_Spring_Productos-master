package com.api.productos.mypackages.models;

import com.api.productos.mypackages.entities.Viaje;

import java.util.Calendar;

public class ViajesModel  {
    private int id;
    private Calendar dataretirada;
    private Calendar dataentrega;
    private int usuarioid;
    private int carroid;
    public ViajesModel(){};

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public int getCarroid() {
        return carroid;
    }

    public void setCarroid(int carroid) {
        this.carroid = carroid;
    }

    public ViajesModel(Viaje objetoCarro) {
        this.dataentrega=objetoCarro.getDataentrega() ;
        this.dataretirada=objetoCarro.getDataretirada();
        this.carroid=objetoCarro.getCarroid();
        this.usuarioid=objetoCarro.getUsuarioid();
        this.id=objetoCarro.getId();
    }

    public Calendar getDataretirada() {
        return dataretirada;
    }

    public int getId() {
        return id;
    }

    public ViajesModel(Calendar dataretirada, Calendar dataentrega, int usuarioid, int carroid) {
        this.dataretirada = dataretirada;
        this.dataentrega = dataentrega;
        this.usuarioid = usuarioid;
        this.carroid = carroid;
    }

    public ViajesModel(int id, Calendar dataretirada, Calendar dataentrega, int usuarioid, int carroid) {
        this.id = id;
        this.dataretirada = dataretirada;
        this.dataentrega = dataentrega;
        this.usuarioid = usuarioid;
        this.carroid = carroid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataentrega() {
        return dataentrega;
    }

    public void setDataretirada(Calendar dataretirada) {
        this.dataretirada = dataretirada;
    }

    public void setDataentrega(Calendar dataentrega) {
        this.dataentrega = dataentrega;
    }



}
