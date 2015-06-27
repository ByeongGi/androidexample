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
		setContentView(R.layout.next01);  // next01 �� ���� 	
		TextView tv =(TextView) findViewById(R.id.textView2);
		Intent intent=getIntent();// �Ѿ�� intent ��ü�� �޴´� .
		int a =intent.getIntExtra("num", 0);// Ű ,����Ʈ��
		int b =intent.getIntExtra("num2", 0);// Ű ,����Ʈ��
		int c =intent.getIntExtra("num3", 0); // ���ٵ忡 ����� ���� ��쿡 
		String[] list =intent.getStringArrayExtra("list");
		String str =intent.getStringExtra("String"); // ���ϰ��� ��ü�� ���
													 // ����Ʈ���� �������� �ʴ´�.
		
		
		
		Man man= (Man) intent.getSerializableExtra("m"); // ��ü ���� �ڷ� �޴¹� 
		
		tv.setText("intent�� ���� ��"+a+","+b+","+c+list[0]);
		
		
		Button b1 = (Button) findViewById(R.id.button1); 
		Button b2 = (Button) findViewById(R.id.button2); 
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();// ��Ƽ��Ƽ�� �޼ҵ� - ����ȭ���� �׺�Ƽ�񿡼� ���� (Task ���ÿ��� �����ϰ� ����) - �޸� ��ȯ 
			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new  Intent(getApplicationContext(),MainActivity.class); // �ٽ� �������� ����Ʈ�� ����.
				
				startActivity(intent2);
				
				// Task �ڿ����� ��ȯ�� �ȵ�. // �ᱹ������ ���������� ���� ��Ƽ��Ƽ���� ���ٵ带 ������ ���ο� ����Ʈ�� �����Ͽ� 
				// ��� ���ٵ尡 ���̰� �Ǹ� ���ÿ� �׿� �ڿ� ���� �ǰ� ���ư�� ��� ���� ������ ��� �ڿ��� ������ �� // ��ȿ������ 
				
				
				// �� 
				// �� �����͸� �����ؾ��ϴ� ���� onpause() �� �����Ұ� !!!!
			}
		});
		
		
	}
	

	
	
	
	
	
} // end class Next01
