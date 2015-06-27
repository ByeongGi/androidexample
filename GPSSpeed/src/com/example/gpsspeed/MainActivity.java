package com.example.gpsspeed;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView tv;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button01 = (Button) findViewById(R.id.button1);
		tv = (TextView) findViewById(R.id.button1);
		button01.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				// startLocationService
				startLocationService();
				
			}
		});
			   
	}
	
	
	private void startLocationService() {
		
		// get manager instance
		LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		
		// set listener
		GPSListener gpsListener = new GPSListener();
		long minTime = 10000; 
		float minDistance = 0; 
		
		manager.requestLocationUpdates(
					LocationManager.GPS_PROVIDER,
					minTime, 
					minDistance, 
					gpsListener);
		
		Toast.makeText(getApplicationContext(), "Location Service started.\nyou can test using DDMS.", 2000).show();
	}
	
	
	private class GPSListener implements LocationListener {

		public void onLocationChanged(Location location) {
			//capture location data sent by current provider
			Double latitude = location.getLatitude();
			Double longitude = location.getLongitude();
			
			String msg = "Latitude : "+ latitude + "\nLongitude:"+ longitude;
			Log.i("GPSLocationService", msg);
			tv.setText(msg);
			Toast.makeText(getApplicationContext(), msg, 2000).show();
			
		}

		public void onProviderDisabled(String provider) {
		}

		public void onProviderEnabled(String provider) {
		}

		public void onStatusChanged(String provider, int status, Bundle extras) {
		}

	}    
	
}