package com.example.healthyapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.healthyapp.Constants.constants.CALORIAS_GLOBALES;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.healthyapp.Adapter.IngredienteAdapter;
import com.example.healthyapp.Model.Ingrediente;
import com.example.healthyapp.R;
import com.example.healthyapp.ViewModel.DietFirstViewModel;

import java.util.List;

public class DietFirstView extends AppCompatActivity implements View.OnClickListener {

    DietFirstViewModel viewModel;
    EditText calorias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_view);

        findViewById(R.id.nuevo_ingrediente).setOnClickListener(this);

        calorias = findViewById(R.id.caloriasEdit);
        calorias.setText(CALORIAS_GLOBALES.toString());

        RecyclerView recyclerView=findViewById(R.id.alimentos);
        viewModel = new ViewModelProvider(this).get(DietFirstViewModel.class);
        viewModel.getIngredientes().observe(this, new Observer<List<Ingrediente>>() {
            @Override
            public void onChanged(List<Ingrediente> lista) {
                if(lista.size()>0){

                    IngredienteAdapter adaptador = new IngredienteAdapter(lista);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(adaptador);

                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        viewModel.anadirIngALista();
    }
}