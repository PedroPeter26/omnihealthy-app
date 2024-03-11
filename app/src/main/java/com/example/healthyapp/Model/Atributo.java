package com.example.healthyapp.Model;

public class Atributo {

    private Double valor;

    public Atributo(Double valor) {
        this.valor = valor;
    }

    private String unidad;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
