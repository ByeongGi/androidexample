package com.example.t015edittext;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et1 = (EditText) findViewById(R.id.editText1);
        final EditText et2 = (EditText) findViewById(R.id.editText2);
        final EditText et3 = (EditText) findViewById(R.id.editText3);
        Button b = (Button) findViewById(R.id.button1);
        final TextView tv = (TextView) findViewById(R.id.textView1);
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String str1=et1.getText().toString();
				String str2=et2.getText().toString();
				String str3=et3.getText().toString();
				// 빈 문자열이 경우 "0"
				if ("".equals(str1)) str1="0";
				if ("".equals(str2)) str2="0";
				if ("".equals(str3)) str3="0";
				
				int x=Integer.parseInt(str1);
				int y=Integer.parseInt(str2);
				int z=Integer.parseInt(str3);
				
				// 최대값 찾기
				// 최대값 변수의 초기값을 집합내의 원소로 설정하는 것이 중요 
				int max= x;// 최대값을 저장할 변수 
//				if (max<x) max =x; 
				if (max<y) max =y; 
				if (max<z) max =z;
				
				tv.setText(String.valueOf(max));
			}
		});
        
    } // end onCreate


  
} // end class MainActivity
