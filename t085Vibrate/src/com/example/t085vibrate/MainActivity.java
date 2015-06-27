package com.example.t085vibrate;

import android.app.AlarmManager;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        final Vibrator vibrator= (Vibrator) getSystemService(VIBRATOR_SERVICE);
       
        final AudioAttributes audioAttributes = (AudioAttributes) getSystemService(AUDIO_SERVICE);
        
        RelativeLayout ll = (RelativeLayout) findViewById(R.id.mylayout);
        
        ll.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				long[]  pattern ={100,300,100,700,300,2000};
				
				vibrator.vibrate(new long[]{100,300,100,700},// 진동 패턴 배열 
						-1); // 0 무한 반복, -1 반복없음, 양의 정수 해당 배턴의 반복 횟수 !
				
				
			}
		});			
        
        ll.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				vibrator.cancel();
				return false;
			}
		});
        
    } // end onCreate


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
