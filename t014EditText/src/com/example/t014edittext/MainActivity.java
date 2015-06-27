package com.example.t014edittext;

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
        Button b= (Button) findViewById(R.id.button1);
        final TextView tv= (TextView) findViewById(R.id.textView1);
        		
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// (tip!) String 문자열이 빈 문자열일 경우 값을 "0"으로 대체 
				String str1= et1.getText().toString();
				String str2= et2.getText().toString();
				// if (str1 !=null&str1.equals("")) {str1="0";}
				// if (str1 =="") {str1="0";} 이 코드의 의미는 str1 과 ""(빈문자열)에 주소값을 비교하게 된다.
				// if ("abc" =="abc") {str1="0";} // 같은 문자열이므로 같은 주소(힙)에 저장됨. // 상수에 저장  
				if ("".equals(str1)) str1="0"; // 보안 코드  이 코드는 실제 저장된 문자열을 비교하는 것이다.// 상수풀에 같은 주소로 저장된것을 비교
				if ("".equals(str2)) str2="0"; // 보안 코드 
				// 빈 문자열을 가급적 비교기준 대상에 넣는다 . 
				
				// 문자열을 숫자로 변환
				int result=Integer.parseInt(str1)+Integer.parseInt(str2);
				
				tv.setText(result+"");// 비문자열을 문자열로 변환 
				
				
				
			}
		});		
    } // end onCreate


    
} // end class MainActivity 
