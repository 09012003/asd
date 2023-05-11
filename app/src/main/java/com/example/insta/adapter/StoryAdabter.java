package com.example.insta.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insta.R;
import com.example.insta.models.StoryModel;
import com.example.insta.ui.StoryActivity;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class StoryAdabter extends RecyclerView.Adapter<StoryAdabter.MyViewHolder>{
    public StoryAdabter(List<StoryModel> list) {
        this.list = list;
    }

    List<StoryModel> list;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bg,parent,false) ;
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     if (position ==0){
         holder.all_story.setVisibility(View.GONE);
         holder.add_story.setVisibility(View.VISIBLE);
     }else {
         holder.all_story.setVisibility(View.VISIBLE);
         holder.add_story.setVisibility(View.GONE);
         holder.pic.setImageResource(list.get(position-1).getPic());
         holder.name.setText(list.get(position-1).getName());
     }
     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(holder.itemView.getContext(), StoryActivity.class);
             intent.putExtra("img",list.get(holder.getAdapterPosition()-1).getPic());
             holder.itemView.getContext().startActivity(intent);
         }
     });
    }

    @Override
    public int getItemCount() {
        return list.size() + 1;
    }

    public static class  MyViewHolder extends  RecyclerView.ViewHolder {
        LinearLayout add_story,all_story;
        TextView name;
        CircleImageView pic;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            add_story = itemView.findViewById(R.id.liner_add_story);
            all_story = itemView.findViewById(R.id.liner_all_story);
            pic = itemView.findViewById(R.id.pic);
            name = itemView.findViewById(R.id.txtNameStory);
        }

    }
}

