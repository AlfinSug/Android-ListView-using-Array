package com.developer.alfin.catalogapps;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class DaftarAdapter extends BaseAdapter {
    Activity action;
    String[] name_cafe1;
    Integer[] img_cafe1;
    String[] address_cafe1;


    public DaftarAdapter(MainActivity mainActivity, Integer[] img_cafe, String[] name_cafe, String[] address_cafe) {

        action = mainActivity;
        img_cafe1 = img_cafe;
        name_cafe1 = name_cafe;
        address_cafe1 = address_cafe;

    }

    @Override
    public int getCount() {

        return img_cafe1.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int j, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)action.getSystemService(action.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.list_item, null);

        ImageView img = view1.findViewById(R.id.img_cafe);
        TextView txt = view1.findViewById(R.id.name_cafe);
        TextView txt1 = view1.findViewById(R.id.addres_cafe);

        txt.setText(name_cafe1[j]);
        txt1.setText(address_cafe1[j]);
        img.setImageResource(img_cafe1[j]);


        return view1;
    }



}
