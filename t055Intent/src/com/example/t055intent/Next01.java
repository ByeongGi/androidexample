package com.example.t055intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Next01 extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next01);  // next01 과 연결 	
		TextView tv =(TextView) findViewById(R.id.textView2);
		Intent intent=getIntent();// 넘어온 intent 객체를 받는다 .
		int a =intent.getIntExtra("num", 0);// 키 ,디폴트값
		int b =intent.getIntExtra("num2", 0);// 키 ,디폴트값
		int c =intent.getIntExtra("num3", 0); // 인텐드에 담기지 않을 경우에 
		String[] list =intent.getStringArrayExtra("list");
		String str =intent.getStringExtra("String"); // 리턴값이 객체일 경우
													 // 디폴트값을 설정하지 않는다.
		
		
		
		Man man= (Man) intent.getSerializableExtra("m"); // 객체 형태 자료 받는법 
		
		tv.setText("intent로 받은 값"+a+","+b+","+c+list[0]);
		
		
		Button b1 = (Button) findViewById(R.id.button1); 
		Button b2 = (Button) findViewById(R.id.button2); 
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();// 액티비티의 메소드 - 현재화면을 액비티비에서 종료 (Task 스택에서 완전하게 제거) - 메모리 반환 
			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new  Intent(getApplicationContext(),MainActivity.class); // 다시 메인으로 인텐트를 날림.
				
				startActivity(intent2);
				
				// Task 자원에서 반환이 안됨. // 결국적으로 연속적으로 메인 액티비티에서 인텐드를 날려서 새로운 인텐트를 생성하여 
				// 계속 인텐드가 쌓이게 되면 스택에 쌓여 자원 낭비도 되고 백버튼을 계속 눌러 스택의 모든 자원을 날려야 됨 // 비효율적임 
				
				
				// 팁 
				// 꼭 데이터를 보존해야하는 것은 onpause() 로 구현할것 !!!!
			}
		});
		
		
	}
	

	
	
	
	
	
} // end class Next01
