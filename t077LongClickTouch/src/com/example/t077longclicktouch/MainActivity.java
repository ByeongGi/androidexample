package com.example.t077longclicktouch;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends ActionBarActivity {
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       tv = (TextView) findViewById(R.id.textView2);
        Button b=(Button)findViewById(R.id.button1);

        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pp("클릭");
				
			}
		});
        
        b.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				pp("롱클릭");
				return true;
			}
		});
        
        b.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					pp("터치 다운 ");
					break;
				case MotionEvent.ACTION_MOVE:
					pp("터치 무브 ");
					break;
				case MotionEvent.ACTION_UP:
					pp("터치 업 ");
					break;

				}
				return false;
			}
		});
    }
    
    
    void pp(String str){
    	
    	tv.setText(str);
    	Log.d("test",str);
    	
    	
    	
    }

   
}
