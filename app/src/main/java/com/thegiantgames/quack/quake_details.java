package com.thegiantgames.quack;

public class quake_details {

    String place;
    double  magnitude ;
    long timeInMillisecond ;
    String  url;

    public quake_details(double  magnitude, String  place, long  timeInMillisecond ) {
        this.place = place;
        this.magnitude = magnitude;
        this.timeInMillisecond =timeInMillisecond;
    }
    public  quake_details(String url){
        this.url = url;
    }

    public String  getPlace() {
        return place;
    }

    public double  getMagnitude() {
        return magnitude;
    }

    public long  getTime() {
        return timeInMillisecond;
    }


}
