package com.example.liz.viewpagertablayoutdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.liz.viewpagertablayoutdemo.fragment.FirstFragment;
import com.example.liz.viewpagertablayoutdemo.fragment.SecondFragment;
import com.example.liz.viewpagertablayoutdemo.fragment.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new FirstFragment();
                break;
            case 1:
                fragment = new SecondFragment();
                break;
            case 2:
                fragment = new ThirdFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String TITLE = "";
        switch (position){
            case 0:
                TITLE = "FIRST";
                break;
            case 1:
                TITLE = "SECOND";
                break;
            case 2:
                TITLE = "THIRD";
                break;
        }
        return TITLE;
    }

}
