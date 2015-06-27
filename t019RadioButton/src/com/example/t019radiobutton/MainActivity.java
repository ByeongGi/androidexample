package com.example.t019radiobutton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
        final TextView tv = (TextView) findViewById(R.id.textView1);
        
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				int id = rg.getCheckedRadioButtonId(); 
				RadioButton rb = (RadioButton) findViewById(id);
				
				String result = "";
				
				
				if(checkedId==R.id.radio3) result = "�����Դϴ�.";
				else result = "Ʋ�Ⱦ�� !";
				
				tv.setText("����Ȯ��"+result);
			}
		});
        
    } // end onCreate 


    
}// end class MainActivity
