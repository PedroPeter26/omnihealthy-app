package com.example.healthyapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.healthyapp.Adapter.AlimentoAdapter;
import com.example.healthyapp.Adapter.IngredienteAdapter;
import com.example.healthyapp.Model.Alimento;
import com.example.healthyapp.Model.Ingrediente;
import com.example.healthyapp.R;
import com.example.healthyapp.ViewModel.DietFirstViewModel;
import com.example.healthyapp.ViewModel.DietSecondViewModel;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class DietSecondView extends AppCompatActivity implements View.OnClickListener,TabLayout.OnTabSelectedListener{

    DietSecondViewModel viewModel;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_second_view);

        tabLayout = findViewById(R.id.tab);


        RecyclerView recyclerView=findViewById(R.id.alimentos);
        viewModel = new ViewModelProvider(this).get(DietSecondViewModel.class);
        viewModel.getAlimentos().observe(this, new Observer<List<Alimento>>() {
            @Override
            public void onChanged(List<Alimento> lista) {
                if(lista.size()>0){

                    AlimentoAdapter adaptador = new AlimentoAdapter(lista);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(adaptador);

                }
            }
        });
        tabLayout.addOnTabSelectedListener(this);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewModel.actualizarLista(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}