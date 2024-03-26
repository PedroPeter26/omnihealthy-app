package com.example.healthyapp.Model;

public class Atributo {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private Double valor;

    public Atributo(Double valor) {
        this.valor = valor;
    }


    public Atributo(String nombre,String unidad,Double valor,Double porcentaje) {
        this.unidad = unidad;
        this.nombre = nombre;
        this.valor = valor;
        this.porcentaje = porcentaje;
    }

    private Double porcentaje;

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
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
