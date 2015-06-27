package com.example.t082sensor;

import java.util.List;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView tv=(TextView) findViewById(R.id.textView2);
        // 액티비티 최상 클래스 context 로부터 가진 매니저들의 반환 정보를 얻는 메소드 
        SensorManager sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> list=sm.getSensorList(Sensor.TYPE_ALL);
        
        for (Sensor sensor : list) {
			tv.append("센서명 :"+sensor.getName()+": \n"
					+" 센서 소모 에너지 :"+sensor.getPower()+": \n"
					+" 센서 Resolution :"+sensor.getResolution()+": \n"
					+" 센서 MaximumRange :"+sensor.getMaximumRange()+": \n"+"\n");
			tv.append("총개수"+list.size());
		}
        
        
        
        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        
        RelativeLayout ll =(RelativeLayout) findViewById(R.id.mylayout);
        ll.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        vibrator.vibrate(100);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        vibrator.vibrate(10);
                        break;
                }

                return false;
            }
        });
        
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
}
