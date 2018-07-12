package com.example.liz.viewpagertablayoutdemo;

import android.annotation.SuppressLint;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mViewPager = findViewById(R.id.view_pager);
        mViewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        TabLayout mTabLayout = findViewById(R.id.tab_layout);

        mTabLayout.setupWithViewPager(mViewPager);

        Objects.requireNonNull(mTabLayout.getTabAt(0)).setIcon(R.drawable.android);
        Objects.requireNonNull(mTabLayout.getTabAt(1)).setIcon(R.drawable.android);
        Objects.requireNonNull(mTabLayout.getTabAt(2)).setIcon(R.drawable.android);

    }
}
