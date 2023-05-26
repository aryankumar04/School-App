package com.example.practice;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Activity_Home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_home) {
                    laodFrag(new FragmentHome(), true);
                } else if (id == R.id.nav_chat) {
                    laodFrag(new FragmentChat(), false);
                } else if (id == R.id.nav_shop) {
                    laodFrag(new FragmentShop(), false);
                } else if (id == R.id.nav_quiz) {
                    laodFrag(new FragmentQuiz(), false);
                } else if (id == R.id.nav_profile) {
                    laodFrag(new FragmentProfile(), false);
                }
                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.nav_home);

    }

    public void laodFrag(Fragment fragment, boolean flag) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        if (flag) {
            fragmentTransaction.add(R.id.frameLayout, fragment);
        } else {
            fragmentTransaction.replace(R.id.frameLayout, fragment);
        }
        fragmentTransaction.commit();
    }
}