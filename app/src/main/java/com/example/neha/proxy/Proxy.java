package com.example.neha.proxy;


public class Proxy {

    private int mTitleId;
    private int mDurationId;
    private String mUrlId;
    private int mDescriptionId;
    private int mPhotoId;

    public Proxy(int titleId,int photoId,String urlId,int durationId,int descriptionId)
    {
        mTitleId=titleId;
        mPhotoId=photoId;
        mUrlId=urlId;
        mDurationId=durationId;
        mDescriptionId=descriptionId;
    }

public int getTitleId(){
    return mTitleId;
}
public int getDescriptionId(){
    return mDescriptionId;
}
public int getDurationId(){return mDurationId;}
public String getUrlId() {return mUrlId;}
    public int getPhotoId(){return mPhotoId;}
}
