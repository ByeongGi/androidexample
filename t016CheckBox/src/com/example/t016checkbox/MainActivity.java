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
				String result=""; // üũ�� ����� ����� ���ڿ� 
				// üũ ���� Ȯ��
				// if (cb1.isChecked()==true) result = result+"����";
				if (cb1.isChecked()) result += cb1.getText().toString();
				if (cb2.isChecked()) result += cb2.getText().toString();
				if (cb3.isChecked()) result += cb3.getText().toString();
				if (cb4.isChecked()) result += cb4.getText().toString();
				tv.setText(" ���ð�� : "+result);
				
				
				
				
			}
		});
    } // end onCreate


   
} // end class MainActivity
