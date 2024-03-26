package com.example.healthyapp.ViewModel;

import android.graphics.Color;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthyapp.Model.DietThirdModel;
import com.example.healthyapp.Model.Estado;

public class DietThirdViewModel extends ViewModel {

    private MutableLiveData<Estado> estado = new MutableLiveData<>(new Estado(Color.rgb(0,0,0)," ",0," "));
    public LiveData<Estado> getEstado() {
        return estado;
    }
    public void setMensaje(Integer cal){
        estado.setValue(DietThirdModel.CrearMensaje(cal));
    }
}
