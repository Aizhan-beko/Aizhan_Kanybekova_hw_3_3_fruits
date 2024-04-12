package com.geeks.aizhan_kanybekova_hw_3_3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FruitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Elderberry");
        fruits.add("Peach");
        fruits.add("Apricot");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Melon");
        fruits.add("Pear");
        fruits.add("Pineapple");
        fruits.add("Plum");













        adapter = new FruitAdapter(this, fruits);
        recyclerView.setAdapter(adapter);
    }
}
