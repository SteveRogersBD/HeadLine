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
        list.add(new NewsPapers(R.drawable.bbc,"BBC","https://www.bbc.com/news"));
        list.add(new NewsPapers(R.drawable.fox_new,"Fox News","https://www.foxnews.com/"));
        list.add(new NewsPapers(R.drawable.times_of_india,"Times of India","https://timesofindia.indiatimes.com/topic/indiatimes"));
        list.add(new NewsPapers(R.drawable.the_daily_star,"The Daily Star","https://www.thedailystar.net/"));
        list.add(new NewsPapers(R.drawable.cnn,"CNN","https://www.cnn.com/"));
        list.add(new NewsPapers(R.drawable.usa_today,"USA Today","https://www.usatoday.com/"));
        list.add(new NewsPapers(R.drawable.the_ny_times,"The New York Times","https://www.nytimes.com/"));

        GridLayoutManager lm= new GridLayoutManager(this,2);
        binding.recyclerView.setLayoutManager(lm);

        NewsPaperAdapter adapter = new NewsPaperAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);
    }
}