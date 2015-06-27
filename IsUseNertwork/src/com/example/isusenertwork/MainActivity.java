package com.example.isusenertwork;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WifiManager m= (WifiManager) getSystemService(Context.WIFI_SERVICE);
        Boolean isEnabled=m.isWifiEnabled();
        
        if (isEnabled) {
			Toast.makeText(getApplicationContext(), "���ͳ��� ������ �Ǿ��ֽ��ϴ�.", Toast.LENGTH_LONG);
		} else{
			Toast.makeText(getApplicationContext(), "���ͳ��� ���ּ���", Toast.LENGTH_LONG);
		}
        
        
    } // end onCreate()


   
} // end 
