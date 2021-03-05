package com.dounia.moroccaneye;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.dounia.moroccaneye.Adapter.FavorisAdapter;
import com.dounia.moroccaneye.Adapter.RecentsAdapter;
import com.dounia.moroccaneye.Adapter.TopPlacesAdapter;
import com.dounia.moroccaneye.model.FavorisData;
import com.dounia.moroccaneye.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class favoris extends AppCompatActivity {
    RecyclerView FavorisRecycler;
    FavorisAdapter favorisAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoris);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        List<FavorisData> favorisDataList = new ArrayList<>();
        favorisDataList.add(new FavorisData("Kasbah oudaya","Rabat","Free",R.drawable.oudaya));
        favorisDataList.add(new FavorisData("Grottes Hercule","Tanger","free",R.drawable.hercule));
        favorisDataList.add(new FavorisData("Chefchaoun","Chefchaoun","From $50",R.drawable.chefchaoun));
        favorisDataList.add(new FavorisData("Grottesd'Hercule","Tanger","free",R.drawable.hercule));
        favorisDataList.add(new FavorisData("Kasbah oudaya","Rabat","Free",R.drawable.oudaya));

        setTopPlacesRecycler(favorisDataList);

    }
    private  void setTopPlacesRecycler(List<FavorisData> favorisDataList){

        FavorisRecycler = findViewById(R.id.favoris_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        FavorisRecycler.setLayoutManager(layoutManager);
        favorisAdapter = new FavorisAdapter(this, favorisDataList);
        FavorisRecycler.setAdapter(favorisAdapter);

    }


}