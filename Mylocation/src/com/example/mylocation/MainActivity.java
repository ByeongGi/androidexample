package com.example.mylocation;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	private Button btnShowLocation;
    private TextView txtLat;
    private TextView txtLon;
     
    // GPSTracker class
    private GpsInfo gps;
    
    
    private TimerTask mTask;
    private Timer mTimer;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        btnShowLocation = (Button) findViewById(R.id.button1);
        txtLat = (TextView) findViewById(R.id.textView3);
        txtLon = (TextView) findViewById(R.id.textView1);
        
       
        
         
        // GPS 정보를 보여주기 위한 이벤트 클래스 등록
        btnShowLocation.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View arg0) {
       
                Sservice();
                
                
            	
              
                
            }
        });
    }
    
    
    void Sservice(){
    	gps = new GpsInfo(MainActivity.this);
        // GPS 사용유무 가져오기
        if (gps.isGetLocation()) {
        	
            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();
             
            txtLat.setText(String.valueOf(latitude));
            txtLon.setText(String.valueOf(longitude));
             
            Toast.makeText(
                    getApplicationContext(),
                    "당신의 위치 - \n위도: " + latitude + "\n경도: " + longitude,
                    Toast.LENGTH_LONG).show();
        } else {
            // GPS 를 사용할수 없으므로
            gps.showSettingsAlert();
        }
    }
    
}// 
