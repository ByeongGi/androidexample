package com.example.t083sensororientation;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements SensorEventListener {
	TextView tv;
	Sensor s;
	SensorManager sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView2);
        // 센서 객체를 얻어오기 위해서는 센서매니저를 통해서만 가능하다.
        sm = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        
        s=sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        
        // 센서의 값이 변경되었을때  콜백 받기 위한 리스너를 등록한다 .
        
        sm.registerListener(this,// 콜백 받을 리스너 등록 
        		s, // 콜백을 원하는 리스너 
        		SensorManager. // 지연시간 
        		SENSOR_DELAY_UI);
        
        
        
        
        
    }

    @Override
    protected void onResume() { // 화면에 다시 보일때 자원 획득 
    	super.onResume();
    	sm.registerListener(this,// 콜백 받을 리스너 등록 
         		s, // 콜백을 원하는 리스너 
         		SensorManager. // 지연시간 
         		SENSOR_DELAY_UI);
    	
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	sm.unregisterListener(this,s); // 센서 이벤트 리스너 ,반납할 센서 자원 
    }

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// 센서의 정확도가 변경되었을때 호출되는메소드 
		
	}


	@Override
	public void onSensorChanged(SensorEvent event) {
		// 센서의 값이 변경 되었을떄 호출되는 메소드 
		
		if (event.sensor.getType()==Sensor.TYPE_ORIENTATION) {
			long timestamp =event.timestamp;
			float value1=event.values[0]; // 방위각(원둘레)
			float value2=event.values[1]; // 피치(높이 올라감)
			float value3=event.values[2]; // 롤(자체외천 )
			String str = "방위각 : "+value1+"\n"+"피치 : "+value2+"\n"+"롤 : "+value3+"\n";
			tv.setText(str);
			
			
			
		}
		
		
	}
}
