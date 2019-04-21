package com.mohmedhassan.otleb;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SearchRestruantActivity extends AppCompatActivity {

    Context context;
    private ArrayList<SearchRestruantModel> searchRestruantModels = new ArrayList<>();
    private RecyclerView recyclerView;
    private SearchRestruantAdapter searchRestruantAdapter;

    private String Restruant_Name[] = {String.valueOf(R.string.matam_100lavad), String.valueOf(R.string.matam_to_eat),
            String.valueOf(R.string.matam_2m_express), String.valueOf(R.string.matam_ali_khafef), String.valueOf(R.string.matam_ala_elnasea),
            String.valueOf(R.string.matam_4pices), String.valueOf(R.string.matam_for_seasons_crepe), String.valueOf(R.string.matam_for_u),
            String.valueOf(R.string.matam_7days_crepe), String.valueOf(R.string.matam7_two), String.valueOf(R.string.matam7_geeks),
            String.valueOf(R.string.matam90s_berger), String.valueOf(R.string.matam_abo_ali), String.valueOf(R.string.matam_abo_amr),
            String.valueOf(R.string.matam_abo_mazen), String.valueOf(R.string.matam_asmak_abo_ail), String.valueOf(R.string.matam_ahel_elshame),
            String.valueOf(R.string.matam_hassouna), String.valueOf(R.string.matam_anwar_elshame), String.valueOf(R.string.matam_crepe_zone),
            String.valueOf(R.string.matam_city_crepe), String.valueOf(R.string.matam_nagef), String.valueOf(R.string.matam_konoz),
            String.valueOf(R.string.matma_waseem_elsory), String.valueOf(R.string.matma_ba7ri), String.valueOf(R.string.matma_bab_abdo)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_restruant);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        searchRestruantModels = new ArrayList<>();
        for (int i = 0; i < Restruant_Name.length; i++) {
            SearchRestruantModel
                    roomDetailsListData = new SearchRestruantModel();
            roomDetailsListData.setRestruant_photo(R.drawable.image);
            roomDetailsListData.setRestruant_Name(Restruant_Name[i]);
            searchRestruantModels.add(roomDetailsListData);


            searchRestruantAdapter = new SearchRestruantAdapter(context, searchRestruantModels);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(searchRestruantAdapter);


        }

    }
}
