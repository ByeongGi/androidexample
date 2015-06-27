package com.example.t057intentproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Next01  extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent(); // 넘어온 인텐트를 가져옴 
		int a=intent.getIntExtra("num1", 0);
		int b =intent.getIntExtra("num2", 0);
		intent.putExtra("hap", (a+b));
		setResult(RESULT_OK,intent); // 호출한 화면으로 되돌려주기 // resultcode : 결과 상태 
		finish(); // 두번째 화면 종료 
	}
	
	
}
