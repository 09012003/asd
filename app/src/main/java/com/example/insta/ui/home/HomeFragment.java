package com.example.insta.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.insta.R;
import com.example.insta.adapter.FriendAdapter;
import com.example.insta.adapter.PostAdapter;
import com.example.insta.adapter.StoryAdabter;
import com.example.insta.models.PostModel;
import com.example.insta.models.StoryModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    RecyclerView storyRec,friendRecy, postRecy;
    StoryAdabter storyAdabter;
    PostAdapter postAdapter;
    FriendAdapter friendAdapter;
    List<StoryModel> storyModelList,friendModelList;
    public static List<PostModel> postModelList;


    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        setList();
        storyAdabter = new StoryAdabter(storyModelList);
        friendAdapter= new FriendAdapter(friendModelList);
        postAdapter = new PostAdapter(postModelList);
        friendRecy.setAdapter(friendAdapter);
        storyRec.setAdapter(storyAdabter);
        postRecy.setAdapter(postAdapter);

    }

    private void setList() {
        storyModelList = new ArrayList<>();
        storyModelList.add(new StoryModel(R.drawable.mmmm,"Adrien"));
        storyModelList.add(new StoryModel(R.drawable.aaaaaa,"Jakob"));
        storyModelList.add(new StoryModel(R.drawable.rrrrrrrrr,"Carolina"));
        storyModelList.add(new StoryModel(R.drawable.uuuuuuu,"Richard"));
        storyModelList.add(new StoryModel(R.drawable.xxxxx,"Adrien"));
        storyModelList.add(new StoryModel(R.drawable.shshshshs,"Jakob"));
        storyModelList.add(new StoryModel(R.drawable.mmmm,"Carolina"));
        storyModelList.add(new StoryModel(R.drawable.aaaaaa,"Richard"));

        friendModelList = new ArrayList<>();
        friendModelList.add(new StoryModel(R.drawable.cat1,"Marcus"));
        friendModelList.add(new StoryModel(R.drawable.cat2,"Adelina"));
        friendModelList.add(new StoryModel(R.drawable.cat3,"Richard"));
        friendModelList.add(new StoryModel(R.drawable.cat4,"Jams"));
        friendModelList.add(new StoryModel(R.drawable.cat5,"Johns"));
        friendModelList.add(new StoryModel(R.drawable.cat6,"Isabella"));
        friendModelList.add(new StoryModel(R.drawable.cat7,"Chaelotta"));

        postModelList =  new ArrayList<>();
        postModelList .add(new PostModel(R.drawable.cat2,R.drawable.rasm1,"Brady Singleton "));
        postModelList .add(new PostModel(R.drawable.cat5,R.drawable.rasm2,"Sophia Loren "));
        postModelList .add(new PostModel(R.drawable.cat3,R.drawable.rasm3,"Isabella Rosellina "));
        postModelList .add(new PostModel(R.drawable.cat4,R.drawable.rasm4,"Amelia Earhart"));
        postModelList .add(new PostModel(R.drawable.cat1,R.drawable.rasm5,"Mia Forrow"));
        postModelList .add(new PostModel(R.drawable.cat6,R.drawable.rasm6,"Harper Lee "));
        postModelList .add(new PostModel(R.drawable.cat7,R.drawable.rasm7,"Abigail Adams"));
        postModelList .add(new PostModel(R.drawable.cat1,R.drawable.rasm4,"Oliwia Wida "));










    }

    private void initViews(View view) {
        storyRec = view.findViewById(R.id.storyRec);
        friendRecy = view.findViewById(R.id.friendRecy);
        postRecy = view.findViewById(R.id.postRecy);
    }
}