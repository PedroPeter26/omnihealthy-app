package com.example.healthyapp.Model;

public class Ingrediente {
    private Alimento comida;
    private Atributo proteinas;
    private Atributo calorias;
    private Atributo sodio;

    public Alimento getComida() {
        return comida;
    }

    public void setComida(Alimento comida) {
        this.comida = comida;
    }

    public Atributo getProteinas() {
        return proteinas;
    }

    public void setProteinas(Atributo proteina) {
        proteina.setUnidad("g Prot.");
        this.proteinas = proteina;
    }

    public Atributo getCalorias() {
        return calorias;
    }

    public Ingrediente() {
    }

    public void setCalorias(Atributo calorias) {
        calorias.setUnidad("Cal.");
        this.calorias = calorias;
    }

    public Atributo getSodio() {
        return sodio;
    }

    public Ingrediente(Alimento comida, Atributo proteinas, Atributo calorias, Atributo sodio) {
        this.comida = comida;
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.sodio = sodio;
    }

    public void setSodio(Atributo sodio) {
        sodio.setUnidad("mg Na");
        this.sodio = sodio;
    }
}
