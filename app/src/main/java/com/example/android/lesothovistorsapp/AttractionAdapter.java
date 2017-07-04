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
 * {@link AttractionAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Attraction} objects.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceID;

    /**
     * Create a new {@link AttractionAdapter} object.
     */
    public AttractionAdapter(Context context, ArrayList<Attraction> attraction, int colorResourceID) {
        super(context, 0, attraction);
        mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check is an exisiting view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_attraction, parent, false);
        }

        //Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        //Find the TextView in the list_item_attraction.xmlraction.xml layout with the ID attraction_name_text_view
        TextView attractionTextView = (TextView) listItemView.findViewById(R.id.attraction_name_text_view);
        //Get attraction name from currentAttraction object and set Text
        attractionTextView.setText(currentAttraction.getAttractionName());

        //Find the TextView in the list_item_attraction_attraction.xml layout with the ID district_text_view
        TextView districtTextView = (TextView) listItemView.findViewById(R.id.district_text_view);
        //Get attraction name from currentAttraction object and set Text
        districtTextView.setText(currentAttraction.getDistrictName());

        // Find the ImageView in the list_item_attraction.xmlraction.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAttraction.getImageResourceID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

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
