package com.example.t056intentprogect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Next01 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next01); // 레이아웃 연결 
		Intent intent =getIntent(); // 인텐트를 얻어온다.
		String name = intent.getStringExtra("name");
		int img = intent.getIntExtra("img", 0);
		String info=intent.getStringExtra("info");
		
		
		TextView tv1 = (TextView) findViewById(R.id.textView1);
		TextView tv2 = (TextView) findViewById(R.id.textView2);
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		
		tv1.setText(name);
		tv2.setText(info);
		iv.setImageResource(img);
		
	}
	
}
