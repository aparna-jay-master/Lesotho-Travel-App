package com.example.android.lesothovistorsapp;

import static android.R.attr.name;

/**
 * Language object which contains the English word, the Sesotho word,
 * and the pronunciation
 */

public class Language {

    //English Word
    private String mEnglishWord;

    //Sesotho translation for word
    private String mSesothoWord;

    //Pronunciation
    private String mPronunciation;


    /**
     * Creates new Language object
     *
     * @param englishWord is string of the English word
     *
     * @param sesothoWord is the string of the Sesotho word
     *
     * @param pronunciation is the string explaining how to say the word
     */
    public Language (String englishWord, String sesothoWord, String pronunciation) {
        mEnglishWord = englishWord;
        mSesothoWord = sesothoWord;
        mPronunciation = pronunciation;
    }

    /**
     * Get the attraction name
     */
    public String getEnglishWord() {
        return mEnglishWord;
    }

    public String getSesothoWord() {
        return mSesothoWord;
    }

    public String getPronunciation() {
        return mPronunciation;
    }
}
