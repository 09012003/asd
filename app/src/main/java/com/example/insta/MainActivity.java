package com.example.insta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.insta.ui.NatificationFragment;
import com.example.insta.ui.chat.ChatFragment;
import com.example.insta.ui.home.HomeFragment;
import com.example.insta.ui.menuFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();
        initViews();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment =null;
                switch (item.getItemId()){
                    case R.id.ichome:
                        fragment = new HomeFragment();
                        break;
                    case R.id.icchat:
                        fragment = new ChatFragment();
                        break;
                    case R.id.icmenu:
                        fragment = new menuFragment();
                        break;
                    case R.id.icnotifications:
                        fragment = new NatificationFragment();
                        break;

                }

                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                }


                return true;
            }
        });

    }

    private void initViews() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
    }

}