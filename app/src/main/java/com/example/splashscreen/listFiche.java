package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listFiche extends AppCompatActivity {
    ListView lstView;
    ArrayList<Fiche> lesFiches=new ArrayList<Fiche>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lstview_fiche);

        Intent intent=getIntent();
        String id=intent.getStringExtra("id");

        FicheSqlHelper ficheSqlHelper=new FicheSqlHelper(listFiche.this);
        lesFiches=ficheSqlHelper.getLesSeries(id);

        lstView=findViewById(R.id.lstView);

        FicheCustomAdapter mAdapter = new FicheCustomAdapter(listFiche.this, lesFiches);

        //ArrayAdapter<String> adapter= new ArrayAdapter<String>(listFiche.this,android.R.layout.simple_list_item_1);
        lstView.setAdapter(mAdapter);

    }
}
