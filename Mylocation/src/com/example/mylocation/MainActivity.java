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
        
       
        
         
        // GPS ������ �����ֱ� ���� �̺�Ʈ Ŭ���� ���
        btnShowLocation.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View arg0) {
       
                Sservice();
                
                
            	
              
                
            }
        });
    }
    
    
    void Sservice(){
    	gps = new GpsInfo(MainActivity.this);
        // GPS ������� ��������
        if (gps.isGetLocation()) {
        	
            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();
             
            txtLat.setText(String.valueOf(latitude));
            txtLon.setText(String.valueOf(longitude));
             
            Toast.makeText(
                    getApplicationContext(),
                    "����� ��ġ - \n����: " + latitude + "\n�浵: " + longitude,
                    Toast.LENGTH_LONG).show();
        } else {
            // GPS �� ����Ҽ� �����Ƿ�
            gps.showSettingsAlert();
        }
    }
    
}// 
