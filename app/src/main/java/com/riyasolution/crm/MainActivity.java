package com.riyasolution.crm;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvStatus = findViewById(R.id.tvStatus);
        tvStatus.setText("Aplicación funcionando correctamente");

        RecyclerView rvProposals = findViewById(R.id.rvProposals);
        rvProposals.setLayoutManager(new LinearLayoutManager(this));
    }
}