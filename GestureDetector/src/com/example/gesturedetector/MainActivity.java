package com.example.gesturedetector;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnGestureListener{
	 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.mylayout);
        tv = (TextView) findViewById(R.id.textView1);
        final GestureDetector gd = new GestureDetector(getApplicationContext(),MainActivity.this);
        
        
        rl.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				gd.onTouchEvent(event);
				return false;
			}
		});
        
    }

	@Override
	public boolean onDown(MotionEvent e) {
		Log.d("Gesture", "onDown");
		tv.setText("onDown");
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		Log.d("Gesture", "onFling");
		tv.setText("onFling");
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		Log.d("Gesture", "onLongPress");
		tv.setText("onLongPress");
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		Log.d("Gesture", "onScroll");
		tv.setText("onScroll");
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		Log.d("Gesture", "onShowPress");
		tv.setText("onShowPress");
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		Log.d("Gesture", "onSingleTapUp");
		tv.setText("onSingleTapUp");
		return false;
	}


  
}
