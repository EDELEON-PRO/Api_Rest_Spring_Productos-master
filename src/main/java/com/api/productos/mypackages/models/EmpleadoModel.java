package com.api.productos.mypackages.models;
import com.api.productos.mypackages.entities.Empleado;
public class EmpleadoModel {
    private int id;
    private String nome;
    private int matricula;

    public EmpleadoModel() {

    }

    public EmpleadoModel(String nome, int matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
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

    public EmpleadoModel(Empleado objetoEmpleado) {
        this.id = objetoEmpleado.getId();
        this.nome = objetoEmpleado.getNome();
        this.matricula = objetoEmpleado.getMatricula();
    }
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nome=" + nome + ", matricula=" + matricula +  "]";
    }
}
