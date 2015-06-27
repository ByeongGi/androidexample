package com.example.sensor02;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements SensorEventListener{
	 private SensorManager mSensorManager;
	 private Sensor mLight; // 조도 센서 
	 private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
       mLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
       tv = (TextView) findViewById(R.id.textview);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// Do something here if sensor accuracy changes.
		
	}


	@Override
	public void onSensorChanged(SensorEvent event) {
		// The light sensor returns a single value.
	    // Many sensors return 3 values, one for each axis.
	    float lux1 = event.values[0];
	    tv.setText("lux : "+lux1);
	    // Do something with this sensor value.
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		mSensorManager.registerListener(this, mLight,SensorManager.SENSOR_DELAY_NORMAL);
		
	}
	
	@Override
	public void onPanelClosed(int featureId, Menu menu) {
		super.onPanelClosed(featureId, menu);
		mSensorManager.unregisterListener(this);
	}
	
	
	
	
}
