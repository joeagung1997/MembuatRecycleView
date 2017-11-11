package com.example.agung.sabtu1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataSayur> isiDatanya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =findViewById(R.id.recycler);
        isiDatanya= new ArrayList<>();
        isiDatanya.add(new DataSayur("Selada" , "15.000","30" ));
        isiDatanya.add(new DataSayur("Bayam" , "13.000","20" ));
        isiDatanya.add(new DataSayur("Kangkung" , "11.000","10" ));
        isiDatanya.add(new DataSayur("Sawi" , "2.000","5" ));

        recyclerView.setLayoutManager(new LinearLayoutManager( this));

        DataRecylerAdapter adapter = new DataRecylerAdapter(isiDatanya , getApplicationContext());

        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
