package com.example.safeskybeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telacadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastro);

        Button btncad = findViewById(R.id.btcad);
        Button btbacklogin = findViewById(R.id.btbacklogin);

        btbacklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it1 = new Intent(Telacadastro.this , LoginActivity.class);
                startActivity(it1);
            }
        });
        btncad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Telacadastro.this , Menu.class);
                startActivity(it);
            }
        });
    }
}