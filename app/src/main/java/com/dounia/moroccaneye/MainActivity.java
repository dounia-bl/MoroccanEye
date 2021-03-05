package com.dounia.moroccaneye;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.dounia.moroccaneye.Adapter.RecentsAdapter;
import com.dounia.moroccaneye.Adapter.TopPlacesAdapter;
import com.dounia.moroccaneye.model.RecentsData;
import com.dounia.moroccaneye.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Menara","Marrakech","free",R.drawable.bg));
        recentsDataList.add(new RecentsData("Kasbah oudaya","Rabat","Free",R.drawable.oudaya));
        recentsDataList.add(new RecentsData("Grottes d'Hercule","Tanger","from $100",R.drawable.hercule));
        recentsDataList.add(new RecentsData("Chefchaoun","Chefchaoun","From $50",R.drawable.chefchaoun));
        recentsDataList.add(new RecentsData("Jamaâ Elfna","Marrakech","Free",R.drawable.lfena));
        recentsDataList.add(new RecentsData("Kasbah ait ben heddou","Ouarzazate","Free",R.drawable.kasbahait));

        setRecentRecycler(recentsDataList);
    }
    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasbah oudaya","Rabat","Free",R.drawable.oudaya));
        topPlacesDataList.add(new TopPlacesData("Grottes Hercule","Tanger","free",R.drawable.hercule));
        topPlacesDataList.add(new TopPlacesData("Chefchaoun","Chefchaoun","From $50",R.drawable.chefchaoun));
        topPlacesDataList.add(new TopPlacesData("Grottesd'Hercule","Tanger","free",R.drawable.hercule));
        topPlacesDataList.add(new TopPlacesData("Kasbah oudaya","Rabat","Free",R.drawable.oudaya));

        setTopPlacesRecycler(topPlacesDataList);

    }
    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}