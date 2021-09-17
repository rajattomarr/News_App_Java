package com.example.android.cartelnews.Model;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.cartelnews.Fragments.EntertainmentFragment;
import com.example.android.cartelnews.Fragments.HealthFragment;
import com.example.android.cartelnews.Fragments.HomeFragment;
import com.example.android.cartelnews.Fragments.ScienceFragment;
import com.example.android.cartelnews.Fragments.SportsFragment;
import com.example.android.cartelnews.Fragments.TechnologyFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position)
       {
           case 0:
               return new HomeFragment();

           case 1:
               return new SportsFragment();

           case 2:
               return new HealthFragment();

           case 3:
               return new ScienceFragment();

           case 4:
               return new EntertainmentFragment();

           case 5:
               return new TechnologyFragment();

           default:
               return null;
       }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
