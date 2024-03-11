package com.example.healthyapp.Model;

public class Alimento {
    private String nombre;
    private Atributo peso;

    public Alimento(String nombre, Atributo peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Alimento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Atributo getPeso() {
        return peso;
    }

    public void setPeso(Atributo peso) {
        peso.setUnidad("g");
        this.peso = peso;
    }
}
