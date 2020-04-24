package com.example.android.myapplication;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyCustomViewHolder> {

    private String[] dataSet;

    public static class MyCustomViewHolder extends RecyclerView.ViewHolder {

        public TextView textView1;
        public TextView textView2;
        public MyCustomViewHolder(View view, TextView text1, TextView text2) {

            super(view);
            textView1 = text1;
            textView2 = text2;
        }

    }

    public RecyclerViewAdapter(String[] data) {

        dataSet = data;
    }

    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_item, viewGroup, false);

        TextView textViewOne = view.findViewById(R.id.text1);
        TextView textViewTwo = view.findViewById(R.id.text2);
        MyCustomViewHolder myCustomViewHolder = new MyCustomViewHolder(view, textViewOne, textViewTwo);

        return myCustomViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder myCustomViewHolder, int i) {

        myCustomViewHolder.textView1.setText(dataSet[i]);
        myCustomViewHolder.textView2.setText("Great!");
    }

    @Override
    public int getItemCount() {

        if (dataSet.length == 0) {

            return 0;
        } else {

            return dataSet.length;
        }

    }

}
