package com.idn.farras.animalcrossing.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.idn.farras.animalcrossing.Main.Model.AmiiboItem;
import com.idn.farras.animalcrossing.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    Context context;
    List<AmiiboItem> amiiboItems;

    public MainAdapter(Context context, List<AmiiboItem> data) {
        this.context = context;
        this.amiiboItems = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.rc_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        final AmiiboItem amiibo = amiiboItems.get(i);
        myViewHolder.txtSeries.setText("Series: " + amiibo.getAmiiboSeries());
        myViewHolder.txtGame.setText("Name: " +amiibo.getName());
        myViewHolder.txtType.setText("Type:" + amiibo.getType());
//        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                context.startActivity(new Intent(context, DetailActivity.class).putExtra("WEB_URL", resep.getSourceUrl()));
//            }
//        });
        try {
            Glide.with(context)
                    .load(amiibo.getImage())
                    .into(myViewHolder.imgMario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return amiiboItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_mario)
        ImageView imgMario;
        @BindView(R.id.txt_series)
        TextView txtSeries;
        @BindView(R.id.txt_game)
        TextView txtGame;
        @BindView(R.id.txt_type)
        TextView txtType;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
