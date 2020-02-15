package com.example.camilomtz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterBibliotecas extends RecyclerView.Adapter<AdapterBibliotecas.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ModelBibliotecas> dataModelArrayList;

    public  AdapterBibliotecas(Context ctx, ArrayList<ModelBibliotecas> dataModelArrayList){
        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
    }

    @NonNull
    @Override
    public AdapterBibliotecas.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.view_bibliotecas, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBibliotecas.MyViewHolder holder, int position) {
        String content = "";
        content += "Departamento: "+ dataModelArrayList.get(position).getDepartamento()+ "\n";
        content += "Municipio: "+ dataModelArrayList.get(position).getMunicipio()+ "\n";
        content += "Nombre: "+ dataModelArrayList.get(position).getNombre()+ "\n";
        content += "Direccion: "+ dataModelArrayList.get(position).getDireccion()+ "\n";
        content += "Barrio: "+ dataModelArrayList.get(position).getBarrio()+ "\n";
        content += "Telefonos: "+ dataModelArrayList.get(position).getTelefono()+ "\n\n";
        holder.info.setText(content);
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView info;
        public MyViewHolder(View itemView) {
            super(itemView);
            info = (TextView) itemView.findViewById(R.id.info);
        }
    }
}
