package com.example.manrique_matus.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.manrique_matus.recyclerview.Adapter.MyAdapter;
import com.example.manrique_matus.recyclerview.Class.Serie;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    MyAdapter adapter;
    List<Serie> series;
    Serie serie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        series=serie.crearArreglo();
        rv=(RecyclerView)findViewById(R.id.recycler);
        adapter=new MyAdapter(series);
        rv.setAdapter(adapter);
    }
}
