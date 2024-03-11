package com.example.healthyapp.Model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class DietFirstModel {

    Ingrediente ingrediente;


    public void asignarAlimento(){

    }


    public Ingrediente getIngrediente(){

        ingrediente = new Ingrediente(new Alimento("Apple",new Atributo(200.0)),new Atributo(30.0),new Atributo(20.0),new Atributo(5.0));
        return ingrediente;
    }

}
