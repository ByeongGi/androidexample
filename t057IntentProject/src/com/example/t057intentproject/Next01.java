package com.example.t057intentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Next01  extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent(); // �Ѿ�� ����Ʈ�� ������ 
		int a=intent.getIntExtra("num1", 0);
		int b =intent.getIntExtra("num2", 0);
		intent.putExtra("hap", (a+b));
		setResult(RESULT_OK,intent); // ȣ���� ȭ������ �ǵ����ֱ� // resultcode : ��� ���� 
		finish(); // �ι�° ȭ�� ���� 
	}
	
	
}
