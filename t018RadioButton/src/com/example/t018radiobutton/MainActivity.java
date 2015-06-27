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
        
        // RadioButton �� ���� �����ϴ� ���� �ƴ϶� 
        // 		RadioGroup ���� �����ؼ� ����Ѵ�
        
        final RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
        Button b = (Button)findViewById(R.id.button1);
        final TextView tv = (TextView)findViewById(R.id.textView1);
        b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				int id = rg.getCheckedRadioButtonId(); // Radiobutton �� id ���� ���ϴ� �޼ҵ� 
				RadioButton rb = (RadioButton) findViewById(id);// Radiobutton �� �Էµ� �ؽ�Ʈ�� �о
				tv.setText("��� : " + rb.getText().toString());
			}
		});
        
    } // end of onCreate
} // end of class

