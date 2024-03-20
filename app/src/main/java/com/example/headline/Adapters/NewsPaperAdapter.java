package com.example.headline.Adapters;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.headline.MainActivity;
import com.example.headline.Models.NewsPapers;
import com.example.headline.NewsActivity;
import com.example.headline.R;

import java.util.ArrayList;

public class NewsPaperAdapter extends RecyclerView.Adapter<NewsPaperAdapter.ViewHolder>{

    ArrayList<NewsPapers>list;
    Context context;

    public NewsPaperAdapter(ArrayList<NewsPapers> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        NewsPapers newsPaper = list.get(position);
        holder.imageView.setImageResource(newsPaper.getImage());
        holder.textView.setText(newsPaper.getName());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 2:
                    case 6:
                    case 4:
                    case 5:
                    case 3:
                    case 0:
                    case 1:
                        sendIntent(newsPaper);
                        break;

                }
            }
        });
        
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_news);
            textView = itemView.findViewById(R.id.news_name);
        }


    }
    public void sendIntent(NewsPapers a){
        Intent intent = new Intent(context, NewsActivity.class);

        intent.putExtra("link",a.getLink());
        context.startActivity(intent);

    }
}
