package com.example.t058intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
      
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) { // ��ȭ�ɱ� 
				Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:010-9128-0000"));
        		startActivity(intent);
				
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) { // ���� ���� 
        		Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:37.569865, 126.984945")); // geo: ���� , �浵 �� 
        		startActivity(intent);
        	}
        });
        
        b3.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) { // ��������
        		Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("http://naver.com"));
        		startActivity(intent);
        	}
        });
        
        b4.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) { // ����ó���� 
        		Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));
        		startActivity(intent);
        	}
        });
        
        
        
        
        
        
    } // end of onCreate


    
} // end of class 
