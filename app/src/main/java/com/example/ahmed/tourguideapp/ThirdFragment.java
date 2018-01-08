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
public class ThirdFragment extends BaseFragment {

    private ArrayList<Content> contents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        //Custom Adapter
        contents = new ArrayList<>();
        contents.add(new Content("PAF Museum","Address: PAF Faisal Air Base، شاہراہ فیصل، Karachi","PAF Museum, Karachi is an Air Force museum and park situated near Karsaz Flyover on Shahrah-e-Faisal.",R.drawable.paf));
        contents.add(new Content("National Museum of Pakistan","Address: Shahrah e Kamel Ataturk, Burns Garden، Karachi 75500","Established in 1949, A Journey through History of Ancient Civilizations.",R.drawable.nationalmuseam));
        contents.add(new Content("Mohatta Palace","Address: Hatim Alvi Road، Karachi","The Mohatta Palace Museum is located in Karachi, Sindh, Pakistan. It was built in the posh seaside locale of Clifton.",R.drawable.mohattapalace));
        contents.add(new Content("Pakistan Maritime Museum","Address: Karsaz Rd, Karachi","Pakistan Maritime Museum is a naval museum and park situated near PNS Karsaz on Habib Ebrahim Rehmatoola Road.",R.drawable.maritimemuseam));
        contents.add(new Content("Quaid-e-Azam House","Address: Fatima Jinnah Rd, Karachi","The Quaid-e-Azam House, also known as \"Flagstaff House\", is a museum dedicated to the personal life of Quaid-i-Azam.",R.drawable.quaideazamhouse));
        contents.add(new Content("State Bank Museum & Art Gallery","Address: I.I Chundrigar Rd, Karachi","The sprawling brown stone building of the State Bank Museum stands tall and lonely.",R.drawable.statebankmuseam));


        ListView listView = (ListView) v.findViewById(R.id.customList);
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getBaseContext(),contents);
        listView.setAdapter(customAdapter);

        return v;
    }

}
