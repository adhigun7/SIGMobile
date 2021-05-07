package com.example.sigmobile;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng NaelHome= new LatLng(-0.846339, 119.904643);
        LatLng Masjid = new LatLng(-0.846506, 119.903367);
        LatLng Masjid2 = new LatLng(-0.846775, 119.905616);
        LatLng Masjid3 = new LatLng(-0.843742, 119.902746);
        LatLng Masjid4 = new LatLng(-0.845911, 119.899257);

        int tinggi = 100;
        int lebar = 100;
        BitmapDrawable bitmapStart = (BitmapDrawable)getResources().getDrawable(R.drawable.house);
        BitmapDrawable bitmapDes = (BitmapDrawable)getResources().getDrawable(R.drawable.mosque);
        BitmapDrawable bitmapEnd = (BitmapDrawable)getResources().getDrawable(R.drawable.mosque2);
        BitmapDrawable bitmapEnd2 = (BitmapDrawable)getResources().getDrawable(R.drawable.mosque3);
        BitmapDrawable bitmapEnd3 = (BitmapDrawable)getResources().getDrawable(R.drawable.mosque4);
        BitmapDrawable bitmapEnd4 = (BitmapDrawable)getResources().getDrawable(R.drawable.mosque5);
        Bitmap s = bitmapStart.getBitmap();
        Bitmap d = bitmapDes.getBitmap();
        Bitmap e = bitmapEnd.getBitmap();
        Bitmap x = bitmapEnd2.getBitmap();
        Bitmap y = bitmapEnd3.getBitmap();
        Bitmap z = bitmapEnd4.getBitmap();
        Bitmap marketStart = Bitmap.createScaledBitmap(s,lebar, tinggi, false);
        Bitmap marketDes = Bitmap.createScaledBitmap(d,lebar, tinggi, false);
        Bitmap marketEnd = Bitmap.createScaledBitmap(e,lebar, tinggi, false);
        Bitmap marketEnd2 = Bitmap.createScaledBitmap(x,lebar, tinggi, false);
        Bitmap marketEnd3 = Bitmap.createScaledBitmap(y,lebar, tinggi, false);
        Bitmap marketEnd4 = Bitmap.createScaledBitmap(z,lebar, tinggi, false);



        // Add a marker in Sydney and move the camera
        LatLng home= new LatLng(-0.846339, 119.904643);
        mMap.addMarker(new MarkerOptions().position(NaelHome).title("Nael Amany's Home")
        .icon(BitmapDescriptorFactory.fromBitmap(marketStart)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NaelHome));

        LatLng mosque= new LatLng(-0.846506, 119.903367);
        mMap.addMarker(new MarkerOptions().position(Masjid).title("Masjid Al-Alqsa")
                .icon(BitmapDescriptorFactory.fromBitmap(marketDes)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid));

        LatLng mosque2 = new LatLng(-0.846775, 119.905616);
        mMap.addMarker(new MarkerOptions().position(Masjid2).title("Masjid Al-Ikhlas")
                .icon(BitmapDescriptorFactory.fromBitmap(marketEnd4)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid2));

        LatLng mosque3 = new LatLng(-0.843742, 119.902746);
        mMap.addMarker(new MarkerOptions().position(Masjid3).title("Masjid Daaruttarbiyah")
                .icon(BitmapDescriptorFactory.fromBitmap(marketEnd2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid3));

        LatLng mosque4= new LatLng(-0.845911, 119.899257);
        mMap.addMarker(new MarkerOptions().position(Masjid4).title("Masjid Baitul Makmur Perdos")
                .icon(BitmapDescriptorFactory.fromBitmap(marketEnd3)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid4));





        mMap.addPolyline(new PolylineOptions().add(
                NaelHome,
                new LatLng(-0.846339, 119.904643),
                new LatLng(  -0.846383,119.903495),
                new LatLng(-0.846506, 119.903367),
                Masjid
                ).width(10)
                        .color(Color.DKGRAY)

        );

        mMap.addPolyline(new PolylineOptions().add(
                NaelHome,
                new LatLng(-0.846339, 119.904643),
                new LatLng(-0.846352, 119.905209),
                new LatLng(-0.846623, 119.905209),
                new LatLng(-0.846588, 119.905496),
                new LatLng(-0.846775, 119.905616),
                Masjid2
                ).width(10)
                .color(Color.DKGRAY)

        );

        mMap.addPolyline(new PolylineOptions().add(
                NaelHome,
                new LatLng(-0.846339, 119.904643),
                new LatLng(-0.845520, 119.904638),
                new LatLng(-0.845520, 119.904546),
                new LatLng(-0.844967, 119.904543),
                new LatLng(-0.844967, 119.904337),
                new LatLng(-0.843582, 119.904337),
                new LatLng(-0.843564, 119.902990),
                new LatLng(-0.843742, 119.902746),
                Masjid3).width(10)
                .color(Color.DKGRAY)
        );

        mMap.addPolyline(new PolylineOptions().add(
                NaelHome,
                new LatLng(-0.846339, 119.904643),
                new LatLng(-0.846344, 119.904342),
                new LatLng(-0.845534, 119.904353),
                new LatLng(-0.845507, 119.901033),
                new LatLng(-0.845035, 119.900984),
                new LatLng(-0.844971, 119.899042),
                new LatLng(-0.845797, 119.899016),
                new LatLng(-0.845911, 119.899257),
                Masjid4
        ).width(10)
                .color(Color.DKGRAY)
        );



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(NaelHome, 14.5f));


    }
}