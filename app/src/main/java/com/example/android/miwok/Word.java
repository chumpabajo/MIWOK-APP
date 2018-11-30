package com.example.android.miwok;

import android.widget.ImageView;

public class Word {

    /** Default translation for the word. it is a variable */
    private String mDefaultTranslation;

    /** Miwok translation for the word, also a variable */
    private String mMiwokTranslation;

    private int mResourceId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;

    private int mAudioResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResource;
        }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * @param resourceId is for the image                          (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int resourceId, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId=resourceId;
        mAudioResourceId= audioResource;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
        }

    public int getResourceId() {
        return mResourceId;
    }
    public boolean hasImage(){
        return mResourceId != NO_IMAGE_PROVIDED;

    }

    public int getmAudioResourceId(){
        return mAudioResourceId;
        }

}
