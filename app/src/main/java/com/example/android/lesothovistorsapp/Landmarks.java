package com.example.android.lesothovistorsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Landmarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        //Create list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.katseDam, R.string.thabaTseka));
        attractions.add(new Attraction(R.string.morija, R.string.maseru));
        attractions.add(new Attraction(R.string.saniPub, R.string.mokhotlong));
        attractions.add(new Attraction(R.string.afriSki, R.string.mokhotlong, R.drawable.afriski));
        attractions.add(new Attraction(R.string.casino, R.string.maseru, R.drawable.casino));
        attractions.add(new Attraction(R.string.thabaBosiu, R.string.maseru));
        attractions.add(new Attraction(R.string.haKome, R.string.ty));
        attractions.add(new Attraction(R.string.caves, R.string.buthaButhe));
        attractions.add(new Attraction(R.string.falls, R.string.maseru));
        attractions.add(new Attraction(R.string.sNationalPark, R.string.quachasNek));
        attractions.add(new Attraction(R.string.tNationalPark, R.string.buthaButhe));

        // Create an {@link AttractionAdaptor}, whose data source is a list of {@link Attractions}.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_landmarks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
