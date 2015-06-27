package com.example.t075longclick;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.button1).setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplicationContext(), "��Ŭ�� ���� ", Toast.LENGTH_LONG).show();
						
				return true; // �̺�Ʈ�� ���´��� ��ȯ�� 
			}
		});
        
        
    }


   
}
