package com.example.topic9;

public class LatitudeLongitude {
    private double lat;
    private double log;
    private String marker;

    public LatitudeLongitude(double lat, double log, String marker) {
        this.lat = lat;
        this.log = log;
        this.marker = marker;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLog() {
        return log;
    }

    public void setLog(double log) {
        this.log = log;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}
