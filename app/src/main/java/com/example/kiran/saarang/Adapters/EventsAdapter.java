package com.example.kiran.saarang.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kiran.saarang.R;

/**
 * Created by kiran on 25/10/15.
 */
public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {



    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView text;
        public ViewHolder(View itemView) {
            super(itemView);

           // text=(TextView)itemView.findViewById(R.id.event);

        }
    }

    @Override
    public EventsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_events, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventsAdapter.ViewHolder holder, int position) {

       // holder.text.setText("hey");
    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
