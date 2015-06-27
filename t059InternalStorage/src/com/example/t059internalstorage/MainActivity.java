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
        
        // �������� ���� ���� 
        final EditText et = (EditText) findViewById(R.id.editText1);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        final TextView tv = (TextView) findViewById(R.id.textView1);
        
        b1.setOnClickListener(new OnClickListener() { // �߰� ���� 
			
			@Override // �Է� ���� �����͸� ���Ͽ� �����ϱ� 
			public void onClick(View v) {
				
				
				try {
					String data=et.getText().toString();
					FileOutputStream fos = openFileOutput("myfile.txt", Context.MODE_APPEND);// ���ϸ�, ������
					PrintWriter out = new PrintWriter(fos);// �ؽ�Ʈ ���Ϸ� �����ϴ� ��ü 
					out.println(data);
					out.close();
					
					tv.setText("�������� �Ϸ�");
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
				
			}
		});
        
        
        b2.setOnClickListener(new OnClickListener() { // �о���� 
        	
        	@Override
        	public void onClick(View v) {
        		// ������ ������ �о TextView�� �����ֱ� 
        		try {
					StringBuffer data =new StringBuffer(); // ���Ͽ��� �о�� �����͸� �����ϱ� ���ؼ� ���� ���� 
				    FileInputStream fis= openFileInput("myfile.txt");
				    BufferedReader buffer = new BufferedReader(new InputStreamReader(fis));
				    
				    String str = buffer.readLine(); // ���Ͽ��� ������ �о��.
				    
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
