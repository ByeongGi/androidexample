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
        // ���� ��ü�� ������ ���ؼ��� �����Ŵ����� ���ؼ��� �����ϴ�.
        sm = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        
        s=sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        
        // ������ ���� ����Ǿ�����  �ݹ� �ޱ� ���� �����ʸ� ����Ѵ� .
        
        sm.registerListener(this,// �ݹ� ���� ������ ��� 
        		s, // �ݹ��� ���ϴ� ������ 
        		SensorManager. // �����ð� 
        		SENSOR_DELAY_UI);
        
        
        
        
        
    }

    @Override
    protected void onResume() { // ȭ�鿡 �ٽ� ���϶� �ڿ� ȹ�� 
    	super.onResume();
    	sm.registerListener(this,// �ݹ� ���� ������ ��� 
         		s, // �ݹ��� ���ϴ� ������ 
         		SensorManager. // �����ð� 
         		SENSOR_DELAY_UI);
    	
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	sm.unregisterListener(this,s); // ���� �̺�Ʈ ������ ,�ݳ��� ���� �ڿ� 
    }

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// ������ ��Ȯ���� ����Ǿ����� ȣ��Ǵ¸޼ҵ� 
		
	}


	@Override
	public void onSensorChanged(SensorEvent event) {
		// ������ ���� ���� �Ǿ����� ȣ��Ǵ� �޼ҵ� 
		
		if (event.sensor.getType()==Sensor.TYPE_ORIENTATION) {
			long timestamp =event.timestamp;
			float value1=event.values[0]; // ������(���ѷ�)
			float value2=event.values[1]; // ��ġ(���� �ö�)
			float value3=event.values[2]; // ��(��ü��õ )
			String str = "������ : "+value1+"\n"+"��ġ : "+value2+"\n"+"�� : "+value3+"\n";
			tv.setText(str);
			
			
			
		}
		
		
	}
}
