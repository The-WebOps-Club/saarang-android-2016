package com.example.kiran.saarang.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kiran.saarang.Adapters.EventsAdapter;
import com.example.kiran.saarang.R;

/**
 * Created by kiran on 24/10/15.
 */
public class EventsFragment extends Fragment {

    View rootview;
    RecyclerView rvEvents;
    LinearLayoutManager layoutManager;
    EventsAdapter eventsAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.eventslayout,container,false);
        rvEvents=(RecyclerView)rootview.findViewById(R.id.rvEvents);
        layoutManager=new GridLayoutManager(getActivity(),3);
        rvEvents.setLayoutManager(layoutManager);
        eventsAdapter=new EventsAdapter();
        rvEvents.setAdapter(eventsAdapter);
        return rootview;
    }
}
