package com.example.t010button;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView1);
       
    } // end onCreate
    
    public void myButton(View v){
    	// 버튼 클릭시 xml 지정한 메소드를 콜백한다.
    	tv.setText("버튼1을 눌렀어요");
    	
    	
    	
    } // end myButton 


} // end of class MainActivity
