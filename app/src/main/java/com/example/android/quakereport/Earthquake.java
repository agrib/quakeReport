package com.example.android.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake(String Magnitude, String Location, String Date) {
        this.mMagnitude = Magnitude;
        this.mLocation = Location;
        this.mDate = Date;
    }


    public String getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(String Magnitude) {
        this.mMagnitude = Magnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String Location) {
        this.mLocation = Location;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String Date) {
        this.mDate = Date;
    }
}
