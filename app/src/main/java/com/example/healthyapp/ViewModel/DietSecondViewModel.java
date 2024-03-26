package com.example.healthyapp.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthyapp.Model.Alimento;
import com.example.healthyapp.Model.Atributo;
import com.example.healthyapp.Model.DietFirstModel;
import com.example.healthyapp.Model.DietSecondModel;
import com.example.healthyapp.Model.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class DietSecondViewModel extends ViewModel {
    private MutableLiveData<List<Alimento>> alimentos = new MutableLiveData<>(new ArrayList<>());
    public LiveData<List<Alimento>> getAlimentos() {
        return alimentos;
    }
    private MutableLiveData<Double> peso = new MutableLiveData<>();
    public LiveData<Double> getPeso() {
        return peso;
    }

    public void actualizarLista(int pos) {

        List<Alimento> ali = alimentos.getValue();

        alimentos.setValue(ali);

    }

}
