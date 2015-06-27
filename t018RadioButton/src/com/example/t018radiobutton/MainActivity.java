package com.example.t018radiobutton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // RadioButton 은 각각 선언하는 것이 아니라 
        // 		RadioGroup 으로 선언해서 사용한다
        
        final RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
        Button b = (Button)findViewById(R.id.button1);
        final TextView tv = (TextView)findViewById(R.id.textView1);
        b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				int id = rg.getCheckedRadioButtonId(); // Radiobutton 의 id 값을 구하는 메소드 
				RadioButton rb = (RadioButton) findViewById(id);// Radiobutton 의 입력된 텍스트를 읽어냄
				tv.setText("결과 : " + rb.getText().toString());
			}
		});
        
    } // end of onCreate
} // end of class

