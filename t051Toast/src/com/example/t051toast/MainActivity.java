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
				// 나만의 토스트를 생성해서 띄우기 
				Toast t = new Toast(getApplicationContext()); // 
				t.setDuration(Toast.LENGTH_LONG); // 보여줄 시간을 지정 
				t.setGravity(Gravity.CENTER, 0, 0); // 뷰 객체의 위치를 지정 
				LayoutInflater inf= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE); // context로부터 서비스를 얻어옴
				View view = inf.inflate(R.layout.mytoast, null);
				
				t.setView(view);// 우리가 만든 뷰 객체를 지정하기 
				t.show(); // 화면에 보여주기 
			}
		});
        
        
    }


}
