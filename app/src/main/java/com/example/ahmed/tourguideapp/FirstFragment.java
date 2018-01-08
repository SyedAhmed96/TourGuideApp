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
public class FirstFragment extends BaseFragment {
    private ArrayList<Content> contents;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        //Custom Adapter
        contents = new ArrayList<>();
        contents.add(new Content("Chatkharay","Address: 27C, Stadium (Khadda Market), Phase 5، Lane 2، Karachi","Chatkharay came into being in 1995, our motto is to provide you with home cooked meals.",R.drawable.chatkharey));
        contents.add(new Content("Okra","Address: 12- C, 10th Zamzama Street، Karachi","Okra opened its doors in 1999 on Zamzama in Karachi and redefined what fine dining was all about. ",R.drawable.okara));
        contents.add(new Content("Cafe Flo","Address: D82/1, Block 4, Clifton، Karachi 75500"," Café Flo - The prestigious and - respected restaurant of Karachi Café Flo offers tasteful Mediterranean cuisine.",R.drawable.cafeflo));
        contents.add(new Content("Kolachi Restaurant","Address: Ocean Towers، Khayaban-e-Iqbal، Karachi","Kolachi Restaurant - The Spirit of Karachi is Kolachi Restaurant which is situated at a heartwarming view of Do Darya.",R.drawable.kolachi));
        contents.add(new Content("Xander's","Address: c 32، E St, Clifton Block 4، Karachi","Xander's is a modern gourmet café – the concept is all about simple, fresh ingredients & light meals.",R.drawable.xanders));
        contents.add(new Content("Chop Chop Wok","Address: Badr Main Khayaban-e-Badr, D.H.A.، Lane 6، Karachi","The new and healthy eatery, gaining major popularity is Chop Chop Wok; the new go-to Chinese restaurant.",R.drawable.chopchopwok));


        ListView listView = (ListView) v.findViewById(R.id.customList);
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getBaseContext(),contents);
        listView.setAdapter(customAdapter);

        return v;
    }

}
