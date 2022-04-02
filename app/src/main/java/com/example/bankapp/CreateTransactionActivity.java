package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class CreateTransactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_transaction);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tbToolbar);

        // using toolbar as ActionBar
        setSupportActionBar(toolbar);
    }
}