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
        // �ܺ� �޸𸮿� ���� �б� / ����
        // 1. �ܺ� �޸� ��ġ�� �ִ��� Ȯ�� checkExternalStorage() �޼ҵ��
        // 2. �ܺ� �޸� ���� ������ ȹ�� ���� �Ŵ��ɽ�Ʈ ���� ~~(�ܺ� ���� ��ġ)
        // 3. �б� / ���� ��θ� �����Ѵ�.
        final EditText et = (EditText) findViewById(R.id.editText1);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        tv= (TextView) findViewById(R.id.textView1);
       
        
        
        checkExternalStorage(); // �ܺ� �޸� ���� Ȯ�� �޼ҵ� 
      
       
       
       
       b1.setOnClickListener(new OnClickListener() { // ���̺� 
		
		@Override
		public void onClick(View v) {
			if (!checkExternalStorage()) {
				return;  // ���� �޸� �����ϸ� ������ 
				}
			
			String data  = et.getText().toString();
			
			try {
				File path =Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
				File f = new File(path,"myfile01.txt");
				FileWriter write = new FileWriter(f,true);
				PrintWriter out =new PrintWriter(write);
				out.println(data);
				out.close();
				tv.setText("����Ϸ�");				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	});
       
       b2.setOnClickListener(new OnClickListener() { // �ε�
		
		@Override
		public void onClick(View v) {
			if (!checkExternalStorage()) { return; }// ������� ���ϸ� ������ 
			
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
    	  * �ܺθ޸� ���� �˷��ִ� �޼ҵ�� ~
    	  */
    	 state= Environment.getExternalStorageState(); // �ܺ� �޸� ���� 
         if(Environment.MEDIA_MOUNTED.equals(state)){ // �б� ���� ��� ���� 
      	   Log.d("Test", "�ܺθ޸� �б� ���� ���� ?");
      	   tv.setText("����޸� ��밡��");
      	   return true;
         } else if ( Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)){// �б� ����
        	 
      	   Log.d("Test", "�ܺθ޸� �б� ���� ?");
      	   tv.setText("����޸� �б⸸����");
      	   return false;
         } else{
      	   Log.d("Test", "�ܺθ޸� ���⸸ ���� ?"+state);
      	   tv.setText("����޸� ���Ұ�");
      	   return false;
         }
         
         
          
    }
    
} // end class MainActivity
