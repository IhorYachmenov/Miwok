package com.example.android.miwok;

public class Word {
    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mMiwokWord;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mDefaultWord;



    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Word(String vMiwokWord, String vDefaultWord)
    {
        mMiwokWord = vMiwokWord;
        mDefaultWord = vDefaultWord;

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


}
