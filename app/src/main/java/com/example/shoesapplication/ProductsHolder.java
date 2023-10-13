package com.example.shoesapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductsHolder extends RecyclerView.ViewHolder {
    TextView txtName;
    public ProductsHolder(@NonNull View itemView) {
        super(itemView);
        txtName= itemView.findViewById(R.id.text_name);
    }

}
