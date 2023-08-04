package com.api.productos.mypackages.entities;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="empleado")
@Entity
public class Empleado implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private int id;
    @Column(name="nome")
    private String nome;
    @Column(name="matricula")
    private int matricula;

    public Empleado() {
    }

    public Empleado(String nome, int matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
    }

    public Empleado(int id, String nome, int matricula) {
        super();
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nome=" + nome + ", matricula=" + matricula +  "]";
    }
}
