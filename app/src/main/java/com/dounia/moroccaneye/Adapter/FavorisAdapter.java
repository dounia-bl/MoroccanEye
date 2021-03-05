package com.dounia.moroccaneye.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dounia.moroccaneye.R;
import com.dounia.moroccaneye.model.FavorisData;
import com.dounia.moroccaneye.model.TopPlacesData;

import java.util.List;

public class FavorisAdapter extends RecyclerView.Adapter<FavorisAdapter.FavorisViewHolder> {
    Context context;
    List<FavorisData> favorisDataList;

    public FavorisAdapter(Context context, List<FavorisData> favorisDataList) {
        this.context = context;
        this.favorisDataList = favorisDataList;
    }

    @NonNull
    @Override
    public FavorisAdapter.FavorisViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.favoris_row_item, parent, false);

        // here we create a recyclerview row item layout file
        return new FavorisAdapter.FavorisViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavorisAdapter.FavorisViewHolder holder, int position) {

        holder.countryName.setText(favorisDataList.get(position).getCountryName());
        holder.placeName.setText(favorisDataList.get(position).getPlaceName());
        holder.price.setText(favorisDataList.get(position).getPrice());
        holder.placeImage.setImageResource(favorisDataList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return favorisDataList.size();
    }

    public static final class FavorisViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView placeName, countryName, price;

        public FavorisViewHolder (@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            countryName = itemView.findViewById(R.id.country_name);
            price = itemView.findViewById(R.id.price);

        }
    }
}
