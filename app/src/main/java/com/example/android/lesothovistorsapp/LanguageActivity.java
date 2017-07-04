package com.example.android.lesothovistorsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        //Create list of Language
        final ArrayList<Language> language = new ArrayList<Language>();
        language.add(new Language("Hello", "Lumela", "Du-me-la"));
        language.add(new Language("How are you?", "Oa Phela joang?", "Du-me-la"));

        // Create an {@link LanguageAdapter}, whose data source is a list of {@link Lanauge}.
        // The adapter knows how to create list items for each item in the list.
        LanguageAdapter adapter = new LanguageAdapter(this, language, R.color.category_language);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
