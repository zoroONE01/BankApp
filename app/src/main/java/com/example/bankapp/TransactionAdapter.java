package com.example.bankapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionViewHolder> {

    private Transaction[] transactionList;

    public TransactionAdapter(Transaction[] transactionList) {
        this.transactionList = transactionList;
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View transactionView = inflater.inflate(R.layout.item_transaction, parent, false);
        TransactionViewHolder transactionViewHolder = new TransactionViewHolder(transactionView);

        return transactionViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        Transaction transaction = transactionList[position];
        TextView tvSender = holder.tvSender;
        TextView tvReciever = holder.tvReciever;
        TextView tvDate = holder.tvDate;
        TextView tvValue = holder.tvValue;
        TextView tvStatus = holder.tvStatus;
        tvSender.setText(transaction.getSender());
        tvDate.setText(R.string.date);
        tvValue.setText(R.string.so_du);
        tvStatus.setText(R.string.hoan_tat);
        tvReciever.setText(transaction.getReciever());
    }

    @Override
    public int getItemCount() {
        return this.transactionList.length;
    }
}
