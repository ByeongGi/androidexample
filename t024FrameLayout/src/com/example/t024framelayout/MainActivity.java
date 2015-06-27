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
				// 1번 이미지가 클릭되면, 1번쨰 이미지가 안 보이게
				// 2번째 보이게
				iv1.setVisibility(View.INVISIBLE);
				iv2.setVisibility(View.VISIBLE);
				
			}
		});
        
        iv2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 2번 이미지가 클릭되면, 2번쨰 이미지가 안 보이게
				// 1번째 보이게
				iv1.setVisibility(View.VISIBLE);
				iv2.setVisibility(View.INVISIBLE);
					
			}
		});
        
    }


} 
