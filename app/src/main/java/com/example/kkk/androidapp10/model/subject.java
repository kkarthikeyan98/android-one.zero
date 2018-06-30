package com.example.kkk.androidapp10.model;

public class subject {

    public subject() {}

    public subject(int id, String name, String subdetail)
    {
        this.mId = id;
        this.mName = name;
//        this.mTotalLectures = totallectures;
//        this.mAvailLectures = availlec;
        this.mSubDetail = subdetail;
    }

    private int mId;

    private String mName;

    private int mTotalLectures;

    private int mAvailLectures;

    private String mSubDetail;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmTotalLectures() {
        return mTotalLectures;
    }

    public void setmTotalLectures(int mTotalLectures) {
        this.mTotalLectures = mTotalLectures;
    }

    public int getmAvailLectures() {
        return mAvailLectures;
    }

    public void setmAvailLectures(int mAvailLectures) {
        this.mAvailLectures = mAvailLectures;
    }

    public String getmSubDetail() {
        return mSubDetail;
    }

    public void setmSubDetail(String mSubDetail) {
        this.mSubDetail = mSubDetail;
    }


}
