package com.example.t016checkbox;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        
        
        Button b = (Button) findViewById(R.id.button1);
        final TextView tv= (TextView) findViewById(R.id.textView2);
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String result=""; // 체크될 결과를 출력할 문자열 
				// 체크 상태 확인
				// if (cb1.isChecked()==true) result = result+"딸기";
				if (cb1.isChecked()) result += cb1.getText().toString();
				if (cb2.isChecked()) result += cb2.getText().toString();
				if (cb3.isChecked()) result += cb3.getText().toString();
				if (cb4.isChecked()) result += cb4.getText().toString();
				tv.setText(" 선택결과 : "+result);
				
				
				
				
			}
		});
    } // end onCreate


   
} // end class MainActivity
