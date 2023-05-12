package com.example.parkingspacefinder;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.firebase.auth.FirebaseAuth;

import java.io.IOException;
import java.text.BreakIterator;
import java.util.List;
import java.util.Locale;
public class MainActivity extends AppCompatActivity {
    private static String value;
    private static int ids;
    public TextView loc;
    public static String getValue() {
        return value;
    }

    public static int getId() {
        return ids;
    }
    private final LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            loc = findViewById(R.id.textView30);
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            // Convert location into address
            Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
            List<Address> addresses;
            if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
            try {
                addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                String address = addresses.get(0).getAddressLine(0);
                loc.setText(address);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
        }
        @Override
        public void onProviderEnabled(String provider) {
        }
        @Override
        public void onProviderDisabled(String provider) {
        }
    };
    //    Connecting layout 'home' file to 'Changeprofile' class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

//    Implementing onClick function to navigate to next screen
        TextView res = findViewById(R.id.textView6);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = res.getText().toString();
                ids = res.getId();
                change_reserve();
            }
        });
//        Implementing onClick function to navigate to next screen
        TextView res1 = findViewById(R.id.textView7);
        res1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = res1.getText().toString();
                ids = res1.getId();
                change_reserve();
            }
        });
//        Implementing onClick function to navigate to next screen
        TextView res2 = findViewById(R.id.textView8);
        res2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = res2.getText().toString();
                ids = res2.getId();
                change_reserve();
            }
        });
//        Implementing onClick function to navigate to next screen
        TextView res3 = findViewById(R.id.textView9);
        res3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = res3.getText().toString();
                ids = res3.getId();
                change_reserve();
            }
        });
//        Implementing onClick function to navigate to next screen
        TextView res4 = findViewById(R.id.textView10);
        res4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = res4.getText().toString();
                ids = res4.getId();
                change_reserve();
            }
        });
        //       Implementing onClick function to navigate to next screen
        TextView res5 = findViewById(R.id.textView11);
        res5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = res5.getText().toString();
                ids = res5.getId();
                change_reserve();
            }
        });
        //       Implementing onClick function to navigate to next screen
        ImageView res6 = findViewById(R.id.imageView9);
        res6.setOnClickListener(view ->{
            startActivity(new Intent(this, Profile.class));
        });
        ImageView res7 = findViewById(R.id.imageView2);
        res7.setOnClickListener(view -> change_drawable());

        ImageView res8 = findViewById(R.id.imageView10);
        res8.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            finishAffinity();
            startActivity(new Intent(this, Login.class));
        });

        final LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                // Convert location into address
                Geocoder geocoder = new Geocoder(getApplicationContext(), Locale.getDefault());
                List<Address> addresses;
                try {
                    addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                    String address = addresses.get(0).getAddressLine(0);
                    String city = addresses.get(0).getLocality();
                    String state = addresses.get(0).getAdminArea();
                    String country = addresses.get(0).getCountryName();
                    String postalCode = addresses.get(0).getPostalCode();
                    String knownName = addresses.get(0).getFeatureName();

                    // Show address in TextView or other UI component
                    BreakIterator loc = null;
                    loc.setText(address);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            @Override
            public void onProviderEnabled(String provider) {
            }

            @Override
            public void onProviderDisabled(String provider) {
            }
        };
    }
    @Override
    protected void onStart() {
        super.onStart();
        loc = findViewById(R.id.textView30);
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(intent);
        }
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Please enable the location permision!", Toast.LENGTH_SHORT).show();
            return;
        }
// Request location updates
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

    }
        //Function implementation to navigate to Reserve class
        private void change_reserve () {
            Intent intent = new Intent(this, Reserve.class);
            startActivity(intent);
        }
        //Function implementation to navigate to Editprofile class
        private void change_profile () {
            Intent intent1 = new Intent(this, Editprofile.class);
            startActivity(intent1);
        }
        //Function implementation to navigate to Drawable class
        private void change_drawable () {
            Intent intent2 = new Intent(this, Drawable.class);
            startActivity(intent2);
        }
}
