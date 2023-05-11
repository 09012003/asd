package com.example.insta.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.example.insta.MainActivity;
import com.example.insta.R;
import com.example.insta.adapter.StoryShowAdapter;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public class StoryActivity extends AppCompatActivity {

    StoryShowAdapter adapter;
    ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        viewPager2 = findViewById(R.id.viewpager);
        adapter = new StoryShowAdapter();
        viewPager2.setAdapter(adapter);





    }
}