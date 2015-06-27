package com.example.t084blockgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Main extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// 메인화면 : 게임시작, 게임 방법 보기 , 정보보기 
		
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(getApplicationContext(),Start.class);
				startActivity(intent1);
				
			}
		});
		
		findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(getApplicationContext(),HowToPlay.class);
				startActivity(intent2);
			}
		});
		findViewById(R.id.button3).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent3 = new Intent(getApplicationContext(),Info.class);
				startActivity(intent3);
			}
		});
		
		
		
		
		
		
	} // end onCreate()
	
} // end class Main
