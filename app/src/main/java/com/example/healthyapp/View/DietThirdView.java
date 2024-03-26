package com.example.healthyapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.healthyapp.Adapter.AlimentoAdapter;
import com.example.healthyapp.Adapter.AtributoAdapter;
import com.example.healthyapp.Model.Atributo;
import com.example.healthyapp.Model.Estado;
import com.example.healthyapp.Model.Receta;
import com.example.healthyapp.R;
import com.example.healthyapp.ViewModel.DietSecondViewModel;
import com.example.healthyapp.ViewModel.DietThirdViewModel;

import java.util.ArrayList;
import java.util.List;


public class DietThirdView extends AppCompatActivity {

    DietThirdViewModel viewModel;
    TextView calorias, message,title;
    ConstraintLayout estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_third_view);

        calorias = findViewById(R.id.CaloriasTotales);

        viewModel = new ViewModelProvider(this).get(DietThirdViewModel.class);

        RecyclerView recyclerView=findViewById(R.id.atributos);

        List<Atributo> ats= new ArrayList<>();
        ats.add(new Atributo("Grasas totales","g",20.0,20.0));
        ats.add(new Atributo("Grasas saturadas","g",20.0,20.0));
        ats.add(new Atributo("Grasas trans","g",20.0,20.0));
        ats.add(new Atributo("Colesterol","mg",20.0,20.0));
        ats.add(new Atributo("Sodio","mg",20.0,20.0));
        ats.add(new Atributo("Carbohidratos totales","g",20.0,20.0));
        ats.add(new Atributo("Fibra dietetica","g",20.0,20.0));
        ats.add(new Atributo("Azucar total","g",20.0,20.0));
        ats.add(new Atributo("Azucar añadidos","g",20.0,20.0));
        ats.add(new Atributo("Proteina","µg",20.0,20.0));
        ats.add(new Atributo("Calcio","mg",20.0,20.0));
        ats.add(new Atributo("Hierro","mg",20.0,20.0));
        ats.add(new Atributo("Potasio","mg",20.0,20.0));

        Receta receta = new Receta(ats,new ArrayList<>());

        Integer cal = 2300;

        viewModel.setMensaje(cal);
        calorias.setText("Calorias totales: "+cal+" cal");

        AtributoAdapter adaptador = new AtributoAdapter(receta.getAtributos());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adaptador);

        message = findViewById(R.id.mensaje);
        title = findViewById(R.id.title);
        estado=findViewById(R.id.estado);

        viewModel.getEstado().observe(this, new Observer<Estado>() {
            @Override
            public void onChanged(Estado resultado) {
                title.setText(resultado.getTitulo());
                message.setText(resultado.getTexto());
                estado.setBackgroundColor(resultado.getColor());
            }
        });
    }
}