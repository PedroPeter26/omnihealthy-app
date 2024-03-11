package com.example.healthyapp.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthyapp.Model.Alimento;
import com.example.healthyapp.Model.Atributo;
import com.example.healthyapp.Model.DietFirstModel;
import com.example.healthyapp.Model.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class DietFirstViewModel extends ViewModel {
    DietFirstModel model = new DietFirstModel();
    private MutableLiveData<List<Ingrediente>> ingredientes = new MutableLiveData<>(new ArrayList<>());
    public LiveData<List<Ingrediente>> getIngredientes() {
        return ingredientes;
    }

    public void anadirIngALista() {
        Ingrediente i = new Ingrediente(new Alimento("Apple",new Atributo(200.0)),new Atributo(30.0),new Atributo(20.0),new Atributo(5.0));
        List<Ingrediente> ing = ingredientes.getValue();

        assert ing != null;
        ing.add(i);
        ingredientes.setValue(ing);

    }
}
