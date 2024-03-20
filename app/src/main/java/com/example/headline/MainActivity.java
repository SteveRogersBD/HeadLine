package com.example.headline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.headline.Adapters.NewsPaperAdapter;
import com.example.headline.Models.NewsPapers;
import com.example.headline.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<NewsPapers>list = new ArrayList<>();
        list.add(new NewsPapers(R.drawable.bbc,"BBC",""));
        list.add(new NewsPapers(R.drawable.fox_new,"Fox News",""));
        list.add(new NewsPapers(R.drawable.times_of_india,"Times of India",""));
        list.add(new NewsPapers(R.drawable.the_daily_star,"The Daily Star",""));
        list.add(new NewsPapers(R.drawable.cnn,"CNN",""));
        list.add(new NewsPapers(R.drawable.usa_today,"USA Today",""));
        list.add(new NewsPapers(R.drawable.the_ny_times,"The New York Times",""));

        NewsPaperAdapter adapter = new NewsPaperAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        GridLayoutManager lm= new GridLayoutManager(this,2);
        binding.recyclerView.setLayoutManager(lm);
    }
}