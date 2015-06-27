package com.example.t074dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
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
        Button b1= (Button) findViewById(R.id.button1);
        Button b2= (Button) findViewById(R.id.button2);
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				showDialog(1);
				
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		
        		showDialog(2);
				
        	}
        });
    }

    @Override
    @Deprecated
    protected Dialog onCreateDialog(int id) {
    	
    	switch (id) {
		case 1:
			ProgressDialog pd = new ProgressDialog(MainActivity.this);
			pd.setTitle("로딩중입니다.");
			pd.setTitle("잠시만 기다려주세요");
			pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			
			return pd;
		case 2:
			ProgressDialog pd2 = new ProgressDialog(MainActivity.this);
			pd2.setTitle("로딩중입니다.");
			pd2.setTitle("잠시만 기다려주세요");
			pd2.setCanceledOnTouchOutside(false);
			pd2.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			
			return pd2;
		}
    	
    	    	
    	
    	
    	
    	
    	
    	return super.onCreateDialog(id);
    }
    
    

}
