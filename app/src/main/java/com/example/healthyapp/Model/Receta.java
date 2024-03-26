package com.example.healthyapp.Model;

import java.util.List;

public class Receta {

    private List<Atributo> atributos;
    private List<Ingrediente> ingredientes;

    public Receta(List<Atributo> atributos, List<Ingrediente> ingredientes) {
        this.atributos = atributos;
        this.ingredientes = ingredientes;
    }

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
