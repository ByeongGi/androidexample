package com.example.gpsspeed;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class SpeedoActionListener  implements LocationListener {
	double mySpeed, maxSpeed;
	
	@Override
	public void onLocationChanged(Location location) {
		
		double latitude= location.getLatitude();
		double longitude = location.getLongitude();
		 
              
             
           
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}

}
