package com.example.android.lesothovistorsapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link LanguageAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Language} objects.
 */

public class LanguageAdapter extends ArrayAdapter<Language> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceID;

    /**
     * Create a new {@link LanguageAdapter} object.
     */
    public LanguageAdapter(Context context, ArrayList<Language> attraction, int colorResourceID) {
        super(context, 0, attraction);
        mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check is an exisiting view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_language, parent, false);
        }

        //Get the {@link Attraction} object located at this position in the list
        Language currentLanguage = getItem(position);

        //Find the TextView in the list_item_language.xml layout with the ID
        // english_word_text_view
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word_text_view);
        //Get english word from currentLanguage object and set Text
        englishTextView.setText(currentLanguage.getEnglishWord());

        //Find the TextView in the list_item_language.xml layout with the ID
        // sesotho_word_text_view
        TextView sesothoTextView = (TextView) listItemView.findViewById(R.id.sesotho_word_text_view);
        //Get english word from currentLanguage object and set Text
        sesothoTextView.setText(currentLanguage.getSesothoWord());

        //Find the TextView in the list_item_language.xml layout with the ID
        // pronunciation_text_view
        TextView pronunciationTextView = (TextView) listItemView.findViewById(R.id.pronunciation_text_view);
        //Get english word from currentLanguage object and set Text
        pronunciationTextView.setText(currentLanguage.getPronunciation());

        // Find Linear Layout that holds words
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
