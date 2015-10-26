package com.example.kiran.saarang.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kiran.saarang.Adapters.ProshowsAdapter;
import com.example.kiran.saarang.R;

/**
 * Created by kiran on 24/10/15.
 */
public class ProshowsFragment extends Fragment {

    View rootview;
    RecyclerView rvProshows;
    LinearLayoutManager layoutManager;
    ProshowsAdapter proshowsAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.proshowslayout,container,false);
        rvProshows=(RecyclerView)rootview.findViewById(R.id.rvEvents);
        layoutManager=new LinearLayoutManager(getActivity());
        rvProshows.setLayoutManager(layoutManager);
        proshowsAdapter=new ProshowsAdapter();
        rvProshows.setAdapter(proshowsAdapter);
        return rootview;
    }
}
