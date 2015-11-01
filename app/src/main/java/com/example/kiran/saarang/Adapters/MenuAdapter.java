package com.example.kiran.saarang.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kiran.saarang.R;

/**
 * Created by Seetharaman on 01-11-2015.
 */
public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {


    Context mContext;
    String[] mList;

    public MenuAdapter(Context context, String[] list){
        mContext = context;
        mList = list;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_menuItem;

        public ViewHolder(View itemView){
            super(itemView);

            tv_menuItem = (TextView)itemView.findViewById(R.id.tv_menuItem);

        }
    }


    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuAdapter.ViewHolder holder, int position) {

        holder.tv_menuItem.setText(mList[position]);
        Typeface face = Typeface.createFromAsset(mContext.getAssets(),
                "fonts/gearedslab.ttf");
        holder.tv_menuItem.setTypeface(face);
    }

    @Override
    public int getItemCount() {
        return mList.length;
    }


}
