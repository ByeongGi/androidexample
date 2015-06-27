package com.example.t073dialog;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	final int DIALOG_DATE= 1;
	final int DIALOG_TIME= 2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1= (Button) findViewById(R.id.button1);
        Button b2= (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showDialog(DIALOG_DATE); // 날짜 
			}
		});
       
        b2.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		showDialog(DIALOG_TIME); // 시간 
        	}
        });
        
    }

    @Override
    @Deprecated
    protected Dialog onCreateDialog(int id) {
    	switch (id) {
		case DIALOG_DATE:
			DatePickerDialog dpd=new DatePickerDialog(MainActivity.this,
					new OnDateSetListener() {
						
						@Override
						public void onDateSet(DatePicker view, int year, int monthOfYear,
								int dayOfMonth) {
							Toast.makeText(MainActivity.this, "현재 날짜"+year+"년"+monthOfYear+"월"+dayOfMonth+"일", Toast.LENGTH_LONG).show();
							
						}
					}, 						// 사용자가 날짜 설정후 다이얼 로그 빠져나올때
					2015, 5-1, 21);				// 호출할 리스너 등록
												// 기본값 연월일
					
			return dpd;
		case DIALOG_TIME:
			TimePickerDialog tpd = new TimePickerDialog(MainActivity.this,
					new OnTimeSetListener() {
						
						@Override
						public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
							Toast.makeText(MainActivity.this, hourOfDay+"시"+minute+"분 " +
									"", Toast.LENGTH_LONG).show();
						}
					}, // 값 설정시 호출될 리스너 등록 
					17,  // 시
					21,  // 분
					true); // 24시간 설정 온/오프
			return tpd;

		default:
			break;
		}
    	return super.onCreateDialog(id);
    }
   
}
