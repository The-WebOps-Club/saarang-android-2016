package com.example.kiran.saarang.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kiran.saarang.Fragments.EventsFragment;
import com.example.kiran.saarang.Fragments.MenuFragment;
import com.example.kiran.saarang.Fragments.ProshowsFragment;
import com.example.kiran.saarang.Fragments.ScheduleFragment;

/**
 * Created by kiran on 24/10/15.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int pos)
    {
        switch (pos){
            case 0: return new EventsFragment();
            case 1: return new ScheduleFragment();
            case 2: return new ProshowsFragment();
            case 3: return new MenuFragment();
            default:return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
