package com.example.t060extenalstorage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	String state;
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 외부 메모리에 파일 읽기 / 쓰기
        // 1. 외부 메모리 장치가 있는지 확인 checkExternalStorage() 메소드와
        // 2. 외부 메모리 저장 권한을 획득 선언 매니케스트 선언 ~~(외부 저장 장치)
        // 3. 읽기 / 쓰기 경로를 저장한다.
        final EditText et = (EditText) findViewById(R.id.editText1);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        tv= (TextView) findViewById(R.id.textView1);
       
        
        
        checkExternalStorage(); // 외부 메모리 상태 확인 메소드 
      
       
       
       
       b1.setOnClickListener(new OnClickListener() { // 세이브 
		
		@Override
		public void onClick(View v) {
			if (!checkExternalStorage()) {
				return;  // 외장 메모리 사용못하면 끝내라 
				}
			
			String data  = et.getText().toString();
			
			try {
				File path =Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
				File f = new File(path,"myfile01.txt");
				FileWriter write = new FileWriter(f,true);
				PrintWriter out =new PrintWriter(write);
				out.println(data);
				out.close();
				tv.setText("저장완료");				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	});
       
       b2.setOnClickListener(new OnClickListener() { // 로딩
		
		@Override
		public void onClick(View v) {
			if (!checkExternalStorage()) { return; }// 사용하지 못하면 끝내라 
			
			try {
				StringBuffer data =new StringBuffer();
				File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
				File f = new File(path,"myfile01.txt");
				BufferedReader buffer = new BufferedReader(new FileReader(f));
				String str= buffer.readLine();
				
				while(str!=null){
					data.append(str+"\n");
					str= buffer.readLine();
				}
				tv.setText(data);
				buffer.close();
				
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

			
		}
	});
       
    }// end onCreate

    private boolean checkExternalStorage(){
    	 /**
    	  * 외부메모리 상태 알려주는 메소드다 ~
    	  */
    	 state= Environment.getExternalStorageState(); // 외부 메모리 상태 
         if(Environment.MEDIA_MOUNTED.equals(state)){ // 읽기 쓰기 모두 가능 
      	   Log.d("Test", "외부메모리 읽기 쓰기 가능 ?");
      	   tv.setText("외장메모리 사용가능");
      	   return true;
         } else if ( Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)){// 읽기 전용
        	 
      	   Log.d("Test", "외부메모리 읽기 가능 ?");
      	   tv.setText("외장메모리 읽기만가능");
      	   return false;
         } else{
      	   Log.d("Test", "외부메모리 쓰기만 가능 ?"+state);
      	   tv.setText("외장메모리 사용불가");
      	   return false;
         }
         
         
          
    }
    
} // end class MainActivity
