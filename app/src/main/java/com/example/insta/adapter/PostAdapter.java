package com.example.insta.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insta.R;
import com.example.insta.models.PostModel;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    List<PostModel> list;
    public PostAdapter(List<PostModel> list) {
        this.list = list;
    }



    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false);
        return new  PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.title.setText(list.get(position).getName());
        holder.imageView.setImageResource(list.get(position).getPic());
        holder.avatar.setImageResource(list.get(position).getAvatar());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        CircleImageView avatar;
        ShapeableImageView imageView;
        TextView title;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar= itemView.findViewById(R.id.circleImageView);
            imageView=itemView.findViewById(R.id.shapeableImageView);
            title = itemView.findViewById(R.id.txtTitle);
        }
    }
}
