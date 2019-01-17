package com.example.ongor2.listviewanimal;

public class Data {
    private String mTxt1;
    private String mTxt2;
    private int mIcon;

    public String getmTxt1() {
        return mTxt1;
    }

    public void setmTxt1(String mTxt1) {
        this.mTxt1 = mTxt1;
    }

    public String getmTxt2() {
        return mTxt2;
    }

    public void setmTxt2(String mTxt2) {
        this.mTxt2 = mTxt2;
    }

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public Data (String text1, String text2,int icon){
        mIcon = icon;
        mTxt1 = text1;
        mTxt2 = text2;
    }



}
