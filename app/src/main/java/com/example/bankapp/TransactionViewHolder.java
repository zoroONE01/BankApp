package com.example.bankapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TransactionViewHolder extends RecyclerView.ViewHolder {

    public TextView tvSender, tvReciever, tvDate, tvStatus, tvValue;

    public TransactionViewHolder(@NonNull View itemView) {
        super(itemView);
        tvDate = itemView.findViewById(R.id.tvDate);
        tvReciever = itemView.findViewById(R.id.tvReciever);
        tvSender = itemView.findViewById(R.id.tvSender);
        tvStatus = itemView.findViewById(R.id.tvStatus);
        tvValue = itemView.findViewById(R.id.tvValue);
    }
}
