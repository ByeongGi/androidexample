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
				// (tip!) String ���ڿ��� �� ���ڿ��� ��� ���� "0"���� ��ü 
				String str1= et1.getText().toString();
				String str2= et2.getText().toString();
				// if (str1 !=null&str1.equals("")) {str1="0";}
				// if (str1 =="") {str1="0";} �� �ڵ��� �ǹ̴� str1 �� ""(���ڿ�)�� �ּҰ��� ���ϰ� �ȴ�.
				// if ("abc" =="abc") {str1="0";} // ���� ���ڿ��̹Ƿ� ���� �ּ�(��)�� �����. // ����� ����  
				if ("".equals(str1)) str1="0"; // ���� �ڵ�  �� �ڵ�� ���� ����� ���ڿ��� ���ϴ� ���̴�.// ���Ǯ�� ���� �ּҷ� ����Ȱ��� ��
				if ("".equals(str2)) str2="0"; // ���� �ڵ� 
				// �� ���ڿ��� ������ �񱳱��� ��� �ִ´� . 
				
				// ���ڿ��� ���ڷ� ��ȯ
				int result=Integer.parseInt(str1)+Integer.parseInt(str2);
				
				tv.setText(result+"");// ���ڿ��� ���ڿ��� ��ȯ 
				
				
				
			}
		});		
    } // end onCreate


    
} // end class MainActivity 
