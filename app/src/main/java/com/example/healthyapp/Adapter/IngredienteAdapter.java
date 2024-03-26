package com.example.healthyapp.Adapter;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthyapp.Model.Ingrediente;
import com.example.healthyapp.R;

import java.util.List;

public class IngredienteAdapter extends RecyclerView.Adapter<IngredienteAdapter.ViewHolder> {

    private List<Ingrediente> milista;
    public IngredienteAdapter(List<Ingrediente> milista){
        this.milista=milista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate( R.layout.diet_food_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Ingrediente ingrediente=milista.get(position);
        holder.setData(ingrediente);
    }

    @SuppressLint("NotifyDataSetChanged")
    public void eliminar(View view, int pos) {
        milista.remove(pos);
        this.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return milista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView nombre,proteinas,sodio,calorias,peso;
        ImageButton btn;
        Ingrediente i;
        View cuadro;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre);
            proteinas=itemView.findViewById(R.id.proteina);
            calorias=itemView.findViewById(R.id.calorias);
            sodio=itemView.findViewById(R.id.sodio);
            peso=itemView.findViewById(R.id.peso);
            btn=itemView.findViewById(R.id.eliminar);
            btn.setOnClickListener(this);
            cuadro=itemView;

        }

        @SuppressLint("SetTextI18n")
        public void setData(Ingrediente ingrediente) {
            i=ingrediente;
            peso.setText(ingrediente.getComida().getPeso().getValor()+" "+ingrediente.getComida().getPeso().getUnidad());
            sodio.setText(ingrediente.getSodio().getValor()+" "+ingrediente.getSodio().getUnidad());
            calorias.setText(ingrediente.getCalorias().getValor()+" "+ingrediente.getCalorias().getUnidad());
            proteinas.setText(ingrediente.getProteinas().getValor()+" "+ingrediente.getProteinas().getUnidad());
            nombre.setText(ingrediente.getComida().getNombre());
        }

        @Override
        public void onClick(View view) {
            eliminar(view,getLayoutPosition());
        }
    }
}
