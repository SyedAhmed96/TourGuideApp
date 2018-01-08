package com.example.ahmed.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 7/23/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    private ArrayList<Content> contents;
    public CustomAdapter(@NonNull Context context, ArrayList<Content> contents) {
        super(context, 0,contents);
        this.contents = contents;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }else{
            view = convertView;
        }
        Content content = contents.get(position);

        TextView nameTxt = (TextView) view.findViewById(R.id.name);
        TextView ageTxt = (TextView) view.findViewById(R.id.age);

        //For Description
        TextView descriptionTxt = (TextView) view.findViewById(R.id.description);
        ImageView profileImage = (ImageView) view.findViewById(R.id.profileImage);

        nameTxt.setText(content.getName());
        ageTxt.setText(String.valueOf(content.getAge()));
        descriptionTxt.setText(content.getDescribtion());
        profileImage.setImageResource(content.getImage());

        return view;
    }
}
