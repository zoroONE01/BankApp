package com.example.bankapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        RecyclerView rvHistory = findViewById(R.id.rvHistory);
//        TransactionAdapter adapter = new TransactionAdapter(Transaction.transactionList);
//        rvHistory.setAdapter(adapter);
//        rvHistory.setLayoutManager(new LinearLayoutManager(this));
    }
}