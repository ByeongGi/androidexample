package com.example.t024framelayout;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView iv1= (ImageView) findViewById(R.id.imageView1);
        final ImageView iv2= (ImageView) findViewById(R.id.imageView2);
        iv1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 1�� �̹����� Ŭ���Ǹ�, 1���� �̹����� �� ���̰�
				// 2��° ���̰�
				iv1.setVisibility(View.INVISIBLE);
				iv2.setVisibility(View.VISIBLE);
				
			}
		});
        
        iv2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 2�� �̹����� Ŭ���Ǹ�, 2���� �̹����� �� ���̰�
				// 1��° ���̰�
				iv1.setVisibility(View.VISIBLE);
				iv2.setVisibility(View.INVISIBLE);
					
			}
		});
        
    }


} 
