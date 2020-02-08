package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mMiwokWord;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mDefaultWord;

    private int mImageView = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;




    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
//    public Word(String vMiwokWord, String vDefaultWord)
//    {
//        mMiwokWord = vMiwokWord;
//        mDefaultWord = vDefaultWord;
//
//    }

    public Word(String vMiwokWord, String vDefaultWord, int vAudioResource)
    {
        mMiwokWord = vMiwokWord;
        mDefaultWord = vDefaultWord;
        mAudioResourceId = vAudioResource;

    }
    public Word(String vMiwokWord, String vDefaultWord, int vImageView, int audioResourceId)
    {
        mMiwokWord = vMiwokWord;
        mDefaultWord = vDefaultWord;
        mImageView = vImageView;
        mAudioResourceId = audioResourceId;

    }

    /**
     * Get the name of the Android version
     */
    public String getMiwokTranslation() {  return mMiwokWord;  }

    /**
     * Get the Android version number
     */
    public String getDefaultTranslation() {
        return mDefaultWord;
    }

    public int getImageResourceId() { return  mImageView; }

    public boolean hasImage() {
        return mImageView != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() { return mAudioResourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokWord='" + mMiwokWord + '\'' +
                ", mDefaultWord='" + mDefaultWord + '\'' +
                ", mImageView=" + mImageView +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
