package com.example.t063sharedpreference;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	EditText et;
	String fileName= "myfile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText) findViewById(R.id.editText1);
        
        // 이전에 입력했던 사용자 입력값을 꺼내서 보여주기
        SharedPreferences sf= getSharedPreferences(fileName, 0);
        String str=sf.getString("name", "");
        et.setText(str);
    }
    
   
    @Override
    protected void onStop() {
    	super.onStop();
    	// Activity 종료되기 전에 저장한다.
    	// SharedPreferences 에 설정값(특별히 기억해야할 사용자 값)을 저장하기
    	SharedPreferences sf = getSharedPreferences(fileName, 0);
    	SharedPreferences.Editor editor = sf.edit(); // 저장하려면 editor가 필요
    	String str =et.getText().toString(); // 사용자가 입력한 값 
    	editor.putString("name", str); // 입력
    	editor.commit();// 파일 저장
    	
    }
   
}
