package com.example.headline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.headline.databinding.ActivityNewsBinding;

public class NewsActivity extends AppCompatActivity {

    ActivityNewsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String link = intent.getStringExtra("link");
        binding.newsWeb.loadUrl(link);
        binding.newsWeb.setWebViewClient(new WebViewController());


    }
}