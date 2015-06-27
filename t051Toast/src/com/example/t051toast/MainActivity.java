package com.example.t051toast;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ������ �佺Ʈ�� �����ؼ� ���� 
				Toast t = new Toast(getApplicationContext()); // 
				t.setDuration(Toast.LENGTH_LONG); // ������ �ð��� ���� 
				t.setGravity(Gravity.CENTER, 0, 0); // �� ��ü�� ��ġ�� ���� 
				LayoutInflater inf= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE); // context�κ��� ���񽺸� ����
				View view = inf.inflate(R.layout.mytoast, null);
				
				t.setView(view);// �츮�� ���� �� ��ü�� �����ϱ� 
				t.show(); // ȭ�鿡 �����ֱ� 
			}
		});
        
        
    }


}
