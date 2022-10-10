package com.netscapelabs.surpriseme.grocery.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.netscapelabs.surpriseme.grocery.R;

public class Locationactivity extends AppCompatActivity {
    private MapView mMapView;
    private GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationactivity);
        mMapView = findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume();
        //enableLocationSettings();
        try {
            MapsInitializer.initialize(Locationactivity.this.getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        mMapView.getMapAsync(new OnMapReadyCallback() {
            //            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;

                if (ActivityCompat.checkSelfPermission(Locationactivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED ||
                        ActivityCompat.checkSelfPermission(Locationactivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
                        || ActivityCompat.checkSelfPermission(Locationactivity.this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                }


                googleMap.setMyLocationEnabled(true);
                //To add marker
                LatLng mohali = new LatLng(30, 76);
                googleMap.addMarker(new MarkerOptions().position(mohali).title("Title").snippet("Mohali Description"));
                // For zooming functionality
                CameraPosition cameraPosition = new CameraPosition.Builder().target(mohali).zoom(12).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
        });



    }

}