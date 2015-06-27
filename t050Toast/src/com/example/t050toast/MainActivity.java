package com.example.t050toast;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b1= (Button) findViewById(R.id.button1);
        Button b2= (Button) findViewById(R.id.button2);
        
        //�佺Ʈ Toast : ����ڿ��� ������ �޼����� �����ϰ� ���� �ִ� ��� 
        Toast.makeText(getApplicationContext() // ���� ȭ���� �������
        		, "onCreate �佺Ʈ�� (onCreate ������ ��  )" // ������ �޼��� ���� 
        		, Toast.LENGTH_LONG) // ������ �Ⱓ () ���/ ª��
        		.show(); // �佺Ʈ�� ȭ�鿡 �����ֱ� 
        
        // ��ư�� �̺�Ʈ ó��
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(),"ª�Ժ����ش�",Toast.LENGTH_SHORT).show();
				
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "��Ժ����ش�", Toast.LENGTH_LONG).show();
				
			}
		});
    } // end onCreate


    
} // end of class 
