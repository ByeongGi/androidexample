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
				pp("Ŭ��");
				
			}
		});
        
        b.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				pp("��Ŭ��");
				return true;
			}
		});
        
        b.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					pp("��ġ �ٿ� ");
					break;
				case MotionEvent.ACTION_MOVE:
					pp("��ġ ���� ");
					break;
				case MotionEvent.ACTION_UP:
					pp("��ġ �� ");
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
