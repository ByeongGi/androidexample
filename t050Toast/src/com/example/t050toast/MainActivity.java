package com.example.t050toast;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b1= (Button) findViewById(R.id.button1);
        Button b2= (Button) findViewById(R.id.button2);
        
        //토스트 Toast : 사용자에게 전달할 메세지를 간단하게 띄울수 있는 방법 
        Toast.makeText(getApplicationContext() // 현재 화면의 제어권자
        		, "onCreate 토스트임 (onCreate 시작할 때  )" // 보여줄 메세지 내용 
        		, Toast.LENGTH_LONG) // 보여줄 기간 () 길게/ 짧게
        		.show(); // 토스트를 화면에 보여주기 
        
        // 버튼에 이벤트 처리
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(),"짧게보여준다",Toast.LENGTH_SHORT).show();
				
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "길게보여준다", Toast.LENGTH_LONG).show();
				
			}
		});
    } // end onCreate


    
} // end of class 
