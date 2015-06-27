package com.example.t059internalstorage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 데이터의 파일 저장 
        final EditText et = (EditText) findViewById(R.id.editText1);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        final TextView tv = (TextView) findViewById(R.id.textView1);
        
        b1.setOnClickListener(new OnClickListener() { // 추가 저장 
			
			@Override // 입력 받은 데이터를 파일에 저장하기 
			public void onClick(View v) {
				
				
				try {
					String data=et.getText().toString();
					FileOutputStream fos = openFileOutput("myfile.txt", Context.MODE_APPEND);// 파일명, 저장모드
					PrintWriter out = new PrintWriter(fos);// 텍스트 파일로 저장하는 객체 
					out.println(data);
					out.close();
					
					tv.setText("파일저장 완료");
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
				
			}
		});
        
        
        b2.setOnClickListener(new OnClickListener() { // 읽어오기 
        	
        	@Override
        	public void onClick(View v) {
        		// 파일의 내용을 읽어서 TextView에 보여주기 
        		try {
					StringBuffer data =new StringBuffer(); // 파일에서 읽어온 데이터를 저장하기 위해서 만든 변수 
				    FileInputStream fis= openFileInput("myfile.txt");
				    BufferedReader buffer = new BufferedReader(new InputStreamReader(fis));
				    
				    String str = buffer.readLine(); // 파일에서 한줄을 읽어라.
				    
				    while (str!=null) {
				    	data.append(str+"\n");
				    	str =buffer.readLine();
					}
					
				    tv.setText(data);
				    
				} catch (Exception e) {
					e.printStackTrace();
				}
        		
        		
        		
        		
        	}
        });
        
    } // end onCreate


} // end class MainActivity
