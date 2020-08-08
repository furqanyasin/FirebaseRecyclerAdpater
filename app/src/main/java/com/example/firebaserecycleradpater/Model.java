package com.example.firebaserecycleradpater;

public class Model {
    String mid,mTitle, mDescription;

    public Model() {
    }

    public Model(String mid, String mTitle, String mDescription) {
        this.mid = mid;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
