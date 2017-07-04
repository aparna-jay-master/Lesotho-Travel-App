package com.example.android.lesothovistorsapp;
/**
 * {@link Attraction} represents an attraction in Lesotho.
 * It contains the name, district name, and an optional image
 */

public class Attraction {

    //Name of attraction
    private int mName;

    //District name
    private int mDistrictName;

    //Image
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Creates new attraction object
     *
     * @param name is string id of the name of the attraction
     *
     * @param districtName is the string id of the district the attraction is located in
     *
     * @param imageResourceID is the id of the image
     */
    public Attraction (int name, int districtName, int imageResourceID) {
        mName = name;
        mDistrictName = districtName;
        mImageResourceID = imageResourceID;
    }

    /**
     * Creates new attraction object
     *
     * @param name is name of the attraction
     *
     * @param districtName is the district the attraction is located in
     */
    public Attraction (int name, int districtName) {
        mName = name;
        mDistrictName = districtName;
    }

    /**
     * Get the attraction name
     */
    public int getAttractionName() {
        return mName;
    }

    /**
     * Get the district name
     */
    public int getDistrictName() {
        return mDistrictName;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
