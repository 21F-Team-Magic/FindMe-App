package com.example.findme;

import android.location.Location;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.firestore.GeoPoint;
import com.google.maps.android.geojson.GeoJsonPoint;

import java.util.ArrayList;
import java.util.List;

public class NotHere {
    public GeoPoint latLng;
    public int weight;

    public NotHere(){
        this.weight = 5;
    }

    public NotHere(Location location, int weight){
        double lat = location.getLatitude();
        double lng = location.getLongitude();
        this.latLng = new GeoPoint(lat, lng);

        this.weight = weight;
    }

    public void setLocation(Location location) {
        if(location != null){
            double lat = location.getLatitude();
            double lng = location.getLongitude();
            this.latLng = new GeoPoint(lat, lng);

            Log.d("PetInfo_NotHere class", String.valueOf(location));
        }
        else
            Log.d("PetInfo_NotHere class", "Try to set as null");
    }

    public void setWeight(int w){
        this.weight = w;
    }
}
