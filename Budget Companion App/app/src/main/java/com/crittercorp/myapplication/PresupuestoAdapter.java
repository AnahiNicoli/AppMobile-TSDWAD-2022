package com.crittercorp.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PresupuestoAdapter extends RecyclerView.Adapter<PresupuestoAdapter.PresupuestoViewHolder> {

    private List<Presupuesto> presupuestos;

    public PresupuestoAdapter(List<Presupuesto> presupuestos) {
        this.presupuestos = presupuestos;
    }

    @NonNull
    @Override
    public PresupuestoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_presupuesto, parent, false);
        return new PresupuestoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresupuestoViewHolder holder, int position) {
        Presupuesto presupuesto = presupuestos.get(position);
        holder.bind(presupuesto);
    }

    @Override
    public int getItemCount() {
        return presupuestos.size();
    }

    public static class PresupuestoViewHolder extends RecyclerView.ViewHolder {

        private TextView nombreClienteTextView;
        private TextView fechaTextView;
        private ImageView borrarIconImageView;
        private TextView precioTextView;

        public PresupuestoViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreClienteTextView = itemView.findViewById(R.id.nombreClienteTextView);
            fechaTextView = itemView.findViewById(R.id.fechaTextView);
            borrarIconImageView = itemView.findViewById(R.id.borrarIconImageView);
            precioTextView = itemView.findViewById(R.id.precioTextView);

            // Asegurar que borrarIconImageView no sea null
            if (borrarIconImageView != null) {
                borrarIconImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Lógica para borrar el presupuesto aquí
                    }
                });
            }
        }

        public void bind(final Presupuesto presupuesto) {
            nombreClienteTextView.setText(presupuesto.getCliente());
            fechaTextView.setText(presupuesto.getFecha());
            precioTextView.setText(presupuesto.getPrecio());
        }
    }

}



