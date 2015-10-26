package com.example.kiran.saarang.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kiran.saarang.R;

/**
 * Created by kiran on 24/10/15.
 */
public class ScheduleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.schedulelayout,container,false);
        return v;
    }
}
