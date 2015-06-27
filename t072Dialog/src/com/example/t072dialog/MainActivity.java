package com.example.t072dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	final int M_C1= 4;
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView2);
        
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				showDialog(M_C1);
				
			}
		});
        
        
    }// 
    
    
    @Override
    @Deprecated
    protected Dialog onCreateDialog(int id) {
    	final String items[] = {"한국","북한","소련","영국"};
    	final boolean checked[] = {true,false,true,true};
    	switch (id) {
		case M_C1:
			AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
			builder.setTitle("MuiltiChoice 다이얼로그 제목")
					.setNegativeButton("선택완료", null)
					.setPositiveButton("취소",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							String str = "선택된 값은 : ";
							for (int i = 0; i < checked.length; i++) {
								if (checked[i]) {
									str = str + items[i]+",";
								}
							}
							
						}
					})
					.setMultiChoiceItems(items, // 체크박스 리스트 항복
							checked, // 초기값 (선택여부) 배열
							new DialogInterface.OnMultiChoiceClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which, boolean isChecked) {
									tv.setText("선택된 값은 :"+which);
									
								}
							});
					
		return builder.create();
		}
    	return super.onCreateDialog(id);
    }


  
}
