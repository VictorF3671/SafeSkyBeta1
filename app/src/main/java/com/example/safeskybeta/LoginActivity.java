package com.example.safeskybeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    Button btLogin = findViewById(R.id.btnlogin);
    Button btngocad = findViewById(R.id.btbackcad);

 btngocad.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent it1 = new Intent(LoginActivity.this , Telacadastro.class);
         startActivity(it1);
     }
 });


    btLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent it = new Intent(LoginActivity.this , Menu.class);
            startActivity(it);
        }
    });

    }
}