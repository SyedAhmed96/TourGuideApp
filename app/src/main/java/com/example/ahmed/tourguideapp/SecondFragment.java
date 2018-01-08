package com.example.ahmed.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends BaseFragment {
    private ArrayList<Content> contents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_first, container, false);

        //Custom Adapter
        contents = new ArrayList<>();
        contents.add(new Content("Mazar-e-Quaid","Address: Mausoleum of Quaid-e-Azam","Mazar-e-Quaid, also known as the Jinnah Mausoleum or the National Mausoleum, is the final resting place of Quaid-e-Azam.",R.drawable.mazarequaid));
        contents.add(new Content("Clifton Beach, Karachi","Address: Cilifton، Karachi","Clifton Beach or Seaview is a beach in Karachi, Sindh, Pakistan located on the Arabian Sea.",R.drawable.ciliftonbeach));
        contents.add(new Content("Karachi Safari Park","Address: University Rd, Karachi","Karachi Safari Park, opened in 1970, is a public funded 'family-only' safari park covering an area of 148 acres.",R.drawable.safaripark));
        contents.add(new Content("Frere Hall","Address: Fatima Jinnah Rd, Karachi","Frere Hall is a building in Karachi, Pakistan that dates from the early British colonial-era in Sindh.",R.drawable.ferehall));
        contents.add(new Content("Port Grand","Address: Road Opposite PNSC buliding، Port Grand Food Street، Karachi","Port Grand Food and drink and Entertainment Complex is a Recreational Area.",R.drawable.portgrand));
        contents.add(new Content("Masjid e Tooba","Address: Old Korangi Road,Phase-II,Karachi 74000,Sindh","Masjid e Tooba or Tooba Mosque is locally known as the Gol Masjid.",R.drawable.masjidetooba));


        ListView listView = (ListView) v.findViewById(R.id.customList);
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getBaseContext(),contents);
        listView.setAdapter(customAdapter);

        return v;
         }

}
