package com.geeks.aizhan_kanybekova_hw_3_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.aizhan_kanybekova_hw_3_3.R;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<String> fruits;
    private Context context;

    public FruitAdapter(Context context, List<String> fruits) {
        this.context = context;
        this.fruits = fruits;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_fruit, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String fruit = fruits.get(position);
        holder.fruitTextView.setText(fruit);
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView fruitTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitTextView = itemView.findViewById(R.id.fruit_text_view);
        }
    }
}