package com.example.t054intent;

import android.content.Intent;
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
        
        // ȭ�� ��ȯ  - ����Ʈ ������ (startActivity)
        // 1. ���� ȭ������ �Ѿ ȭ���� �غ��Ѵ� .
        // 2. AdroidMainfest.xml �� Activity �� ����Ѵ� .
        // 3. Intent ��ü�� ���� startActivity �Ѵ� .
        Button b =(Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), // ���� ȭ���� ������� 
						Two.class); // ���� �Ѿ Ŭ���� ���� 
				startActivity(intent); // ���� ȭ������ �Ѿ 
				
			}
		});
        
    } // end onCreate


   
} // end class MainActivity
