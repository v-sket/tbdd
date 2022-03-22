package com.example.lap05;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DonutAdapter extends BaseAdapter {
    private Context context;
    private List<Donut> listDonut;
    private int layout;
    private int vitri =-1;

    public DonutAdapter(Context context, List<Donut> listDonut, int layout) {
        this.context = context;
        this.listDonut = listDonut;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listDonut.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtDescription = (TextView) view.findViewById(R.id.txtDescription);
        TextView txtPrice = (TextView) view.findViewById(R.id.txtPrice);
        ImageView imgView = (ImageView) view.findViewById(R.id.imgDonut);
        ImageButton imgBtnPlus = (ImageButton) view.findViewById(R.id.imgBtnAdd);

        Donut donut = listDonut.get(i);
        txtName.setText(donut.getName());
        txtDescription.setText(donut.getDescription());
        txtPrice.setText(donut.getPrice());
        imgView.setImageResource(donut.getImg());

        imgBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chuyenmanhinh = new Intent(context, MainActivity_2.class);
                context.startActivities(new Intent[]{chuyenmanhinh});
            }
        });


        return view;
    }
}
