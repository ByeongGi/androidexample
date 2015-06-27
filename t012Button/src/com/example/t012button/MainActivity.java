package com.example.t012button;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener {
	 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ctrl+ alt + 방향키 :복사할 열 방향 
        tv = (TextView) findViewById(R.id.textView1);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);

        // 버튼 이벤트 처리 : this (MainMainActivity 에서 직접 구현 ) 
        // 내 클래스의 내부의 자원에 쉽게 접근이 가능하다.
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        
        
    }// end onCreatete()

	@Override
	public void onClick(View v) { // 클릭시 호출되는 콜백 메소드 
		
		// 무슨  위젯인지 구별하는 메소드 있음 . ? 질문 
		Button b= (Button)v; // 다형성: 이벤트가 발생한 객체를 버튼으로 꺼냄
		String str= b.getTag().toString();
		tv.setText(str);
	} // end 


   
} // end class MainActivity
