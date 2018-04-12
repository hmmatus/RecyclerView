package com.example.manrique_matus.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;

import com.example.manrique_matus.recyclerview.Adapter.MyAdapter;
import com.example.manrique_matus.recyclerview.Class.Serie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    MyAdapter adapter;
    ArrayList<Serie> series;
    Serie serie;
    private String TAG = "Mensaje";
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //series=serie.crearArreglo();
        series=new ArrayList<>();

        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        layoutManager=new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        prepareSeries();

        adapter=new MyAdapter(series);
        rv.setAdapter(adapter);


    }

    public void prepareSeries(){
        series=new ArrayList<>();
        series.add(new Serie("The Walking Dead","13", R.drawable.twd,"TV show created by Robert Kirgman"));
        series.add(new Serie("Game of Thrones","13",R.drawable.got,"TV show created by George R. Martin"));
        series.add(new Serie("Breaking bad","13",R.drawable.bbad,"TV show created by Vince Gilligan"));
        rv=(RecyclerView)findViewById(R.id.recycler);

        Log.d(TAG, "onCreate:"+series.get(0).getName());
        Log.d(TAG, "onCreate:"+series.get(1).getName());
        Log.d(TAG, "onCreate:"+series.get(2).getName());
    }


}
