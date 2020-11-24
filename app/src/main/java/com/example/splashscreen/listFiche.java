package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class listFiche extends AppCompatActivity {
    ListView lstView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lstview_fiche);

        Intent intent=getIntent();
        String id=intent.getStringExtra("id");

        FicheSqlHelper ficheSqlHelper=new FicheSqlHelper(listFiche.this);
        Fiche lesFiches=ficheSqlHelper.getFiche(id);

        lstView=findViewById(R.id.lstView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(listFiche.this,android.R.layout.simple_list_item_1);
        lstView.setAdapter(adapter);

    }
}
