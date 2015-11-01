package com.example.kiran.saarang.Fragments;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kiran.saarang.Adapters.MenuAdapter;
import com.example.kiran.saarang.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by kiran on 24/10/15.
 */




public class MenuFragment extends DialogFragment {

    String[] menuList = {"Reach Saarang" , "Event Schedule", "See Map", "Contact us", "Hospitality", "Credits"};


    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout

        View v = inflater.inflate(R.layout.menulayout, null);
        builder.setView(v);

        RecyclerView rv_menu = (RecyclerView)v.findViewById(R.id.rv_menu);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        rv_menu.setLayoutManager(layoutManager);

        MenuAdapter adapter = new MenuAdapter(getActivity(), menuList);


        rv_menu.setAdapter(adapter);

        TextView tv_name = (TextView) v.findViewById(R.id.tv_name);
        Typeface face = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/gearedslab.ttf");
        tv_name.setTypeface(face);

        TextView tv_back = (TextView)v.findViewById(R.id.tv_back);
        tv_back.setTypeface(face);

        final AlertDialog dialog = builder.create();

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


        return dialog;
    }
}
