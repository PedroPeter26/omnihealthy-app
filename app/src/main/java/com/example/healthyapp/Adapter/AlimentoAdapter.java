package com.example.healthyapp.Adapter;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthyapp.Model.Alimento;
import com.example.healthyapp.Model.Ingrediente;
import com.example.healthyapp.R;

import java.util.List;

public class AlimentoAdapter extends RecyclerView.Adapter<AlimentoAdapter.ViewHolder> {

    private List<Alimento> milista;
    public AlimentoAdapter(List<Alimento> milista){
        this.milista=milista;
    }
    @NonNull
    @Override
    public AlimentoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate( R.layout.diet_food,parent,false);


        return new AlimentoAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AlimentoAdapter.ViewHolder holder, int position) {

        Alimento alimento=milista.get(position);
        holder.setData(alimento);
    }
    @Override
    public int getItemCount() {
        return milista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView nombre;
        Button cuadro;
        Alimento a;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre);
            cuadro=itemView.findViewById(R.id.cuadro);
            cuadro.setOnClickListener(this);

        }

        @SuppressLint("SetTextI18n")
        public void setData(Alimento alimento) {
            a=alimento;
            nombre.setText(alimento.getNombre());
        }

        @Override
        public void onClick(View view) {

        }
    }
}
