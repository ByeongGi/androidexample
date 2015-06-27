package com.example.t070dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView tv = (TextView) findViewById(R.id.textView1);
        
        
        // ////////////////////////////////////////////
        // Dialog 객체 생성 
        // ////////////////////////////////////////////
        final Dialog d= new Dialog(MainActivity.this);
        
        d.setContentView(R.layout.dialog); // 객체가 연결 
        Button b1=(Button) d.findViewById(R.id.button1);
        Button b2=(Button) d.findViewById(R.id.button2);
        final EditText et =(EditText) d.findViewById(R.id.editText1);
        
        
        d.setTitle("개인정보변경화면");
       
        
        d.show();
        // 다이얼 로그 생성 작성, 이벤트 처리 
        
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 String str=et.getText().toString();
				if (!"".equals(str)) {
					tv.setText(str);
					d.hide();
					Toast.makeText(getApplicationContext(), "수정되었습니다.", Toast.LENGTH_SHORT);
				} else {
					Toast.makeText(getApplicationContext(), "빈칸입니다.", Toast.LENGTH_SHORT);
				}
				
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		d.hide();
        		
        	}
        });
        
    }


   
}
