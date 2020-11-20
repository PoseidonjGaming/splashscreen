package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuFiche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mune_fiche);
    }

    public void BTN_AjoutFiche(View view) {
        startActivity(new Intent(MenuFiche.this, AjoutFiche.class));
    }

    public void BTNListFiche_Click(View view) {
        startActivity(new Intent(MenuFiche.this, listFiche.class));
    }
}
