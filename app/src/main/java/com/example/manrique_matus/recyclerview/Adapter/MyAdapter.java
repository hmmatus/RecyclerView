package com.example.manrique_matus.recyclerview.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.manrique_matus.recyclerview.Class.Serie;
import com.example.manrique_matus.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manrique_Matus on 008/8/4/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.SeriesViewHolder> {
    private String TAG="Text";
    ArrayList<Serie> series;

    public static class SeriesViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView name,caps,desc;
        ImageView img;


        public SeriesViewHolder(View itemView) {
            super(itemView);
            card=(CardView)itemView.findViewById(R.id.card_view);
            name=(TextView)itemView.findViewById(R.id.name);
            caps=(TextView)itemView.findViewById(R.id.chapters);
            desc=(TextView)itemView.findViewById(R.id.desc);
            img=(ImageView)itemView.findViewById(R.id.img);
        }
    }


    public MyAdapter(ArrayList<Serie> series){
        this.series=series;
    }

    @Override
    public SeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        SeriesViewHolder sv=new SeriesViewHolder(v);
        return sv;
    }

    @Override
    public void onBindViewHolder(SeriesViewHolder holder, int position) {
        holder.name.setText(series.get(position).getName());
        holder.caps.setText(String.valueOf(series.get(position).getCaps()));
        holder.desc.setText(series.get(position).getDesc());
        holder.img.setImageResource(series.get(position).getImg());
        Log.d(TAG, "onBindViewHolder: "+series.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return series.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
