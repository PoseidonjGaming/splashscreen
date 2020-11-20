package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Connexion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);
    }


    public void BTN_SignInClick(View view) {
        startActivity(new Intent(Connexion.this, listFiche.class));
    }
}
