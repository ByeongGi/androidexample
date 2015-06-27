package com.example.t046progressbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ProgressBar;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {
	int value = 0; // 막대 프로그래스바 진행값을 저장 
	int add = 10; // 증가량 , 방향 (-,+)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        final ProgressBar pb1= (ProgressBar) findViewById(R.id.progressBar1);
        final ProgressBar pb2= (ProgressBar) findViewById(R.id.progressBar2);
        ToggleButton tb1= (ToggleButton) findViewById(R.id.toggleButton1);
        final ToggleButton tb2= (ToggleButton) findViewById(R.id.toggleButton2);
        
        
        tb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
								
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {pb1.setVisibility(View.INVISIBLE);}else{
					pb1.setVisibility(View.VISIBLE);
				}
			}
		});
        
        tb2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					value=value+add; // 0 ~100 사이에서 빙빙 돌게됨 .
					
					if(value>=100||value<=0 ){
						add= -add;
					} 
					
					
				 
				 // 10씩증가
				pb2.setProgress(value); // 프로래스 바의 값을 설정
				
			}
		});
    }


   
} // end class MainActvity
