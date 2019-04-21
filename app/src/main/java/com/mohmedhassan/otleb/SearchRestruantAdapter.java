package com.mohmedhassan.otleb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchRestruantAdapter extends RecyclerView.Adapter<SearchRestruantAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<SearchRestruantModel> searchRestruantModels;


    public SearchRestruantAdapter(Context context, ArrayList<SearchRestruantModel> searchRestruantModels) {
        this.context = context;
        this.searchRestruantModels = searchRestruantModels;
    }



    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_restruant_item, viewGroup, false);
        return new SearchRestruantAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder myViewHolder, int position) {

        SearchRestruantModel searchRestruantModel = searchRestruantModels.get(position);
        myViewHolder.Restruant_Name.setText(searchRestruantModel.getRestruant_Name());
        myViewHolder.Restruant_Image.setImageResource(searchRestruantModel.getRestruant_photo());
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView Restruant_Name;
        ImageView Restruant_Image;

        public CustomViewHolder(View view) {
            super(view);
            Restruant_Name = (TextView) view.findViewById(R.id.restruant_name);
            Restruant_Image = (ImageView) view.findViewById(R.id.restruant_image);

        }
    }

    @Override
    public int getItemCount() {

        return searchRestruantModels.size();
    }
}
