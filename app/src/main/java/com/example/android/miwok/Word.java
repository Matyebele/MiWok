package com.example.android.miwok;

/**
 * Created by Code Tribe on 2016/11/16.
 */
public class Word {
    //Default Translation

private String Detranslation;

    //Miwok translation

    private String Mitranslation;
    private int mImageResId;
    public Word(String DefaultTranslation,String MiwokTranslation, int mImageResIdd){

        Detranslation = DefaultTranslation;
        Mitranslation = MiwokTranslation;
        mImageResId = mImageResIdd;
    }
    public Word(String DefaultTranslation,String MiwokTranslation){

        Detranslation = DefaultTranslation;
        Mitranslation = MiwokTranslation;

    }

    public String getDetranslation() {
        return Detranslation;
    }

    public String getMitranslation(){
        return Mitranslation;
    }
    public  int getmImageResId(){
        return  mImageResId;
    }
}
