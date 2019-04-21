package com.mohmedhassan.otleb;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchRestruantActivity extends AppCompatActivity {

    Context context;
    private ArrayList<SearchRestruantModel> searchRestruantModels = new ArrayList<>();
    private RecyclerView recyclerViewRestruant;
    private SearchRestruantAdapter searchRestruantAdapter;

    private String Restruant_Name[] = {"100 Lava","2 eat","2M Express","علي خفيف","علي الناصية","4 pices Food","فور سيزون كريب",
            " فور يو","7 Days Crepe","7 Two", "7 جيكز","90`S BurGer","ابو علي","Abo ابو عمرو","ابو مازن السوري","اسماك ابو علي ",
            "اهل الشام", "حسونة","انوار الشام","Crepe Zone","City Crepe","نجف", "كنوز","وسام السوري","بحري","باب عبده"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_restruant);

        recyclerViewRestruant = (RecyclerView) findViewById(R.id.recyclerview);

        searchRestruantModels = new ArrayList<>();
        for (int i = 0; i < Restruant_Name.length; i++) {
            SearchRestruantModel
                    roomDetailsListData = new SearchRestruantModel();
            roomDetailsListData.setRestruant_photo(R.drawable.image);
            roomDetailsListData.setRestruant_Name(Restruant_Name[i]);
            searchRestruantModels.add(roomDetailsListData);


            searchRestruantAdapter = new SearchRestruantAdapter(SearchRestruantActivity.this, searchRestruantModels);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerViewRestruant.setLayoutManager(mLayoutManager);
            recyclerViewRestruant.setItemAnimator(new DefaultItemAnimator());
            recyclerViewRestruant.setAdapter(searchRestruantAdapter);


        }

        recyclerViewRestruant.addOnItemTouchListener(new RecyclerTouchListener(context, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(android.view.View view, int position) {

               //  Toast.makeText(SearchRestruantActivity.this, searchRestruantModel.getRestruant_Name() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(android.view.View view, int position) {

            }

        }, recyclerViewRestruant));


    }
}
