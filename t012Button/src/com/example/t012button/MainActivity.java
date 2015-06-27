package com.example.t012button;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener {
	 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ctrl+ alt + ����Ű :������ �� ���� 
        tv = (TextView) findViewById(R.id.textView1);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);

        // ��ư �̺�Ʈ ó�� : this (MainMainActivity ���� ���� ���� ) 
        // �� Ŭ������ ������ �ڿ��� ���� ������ �����ϴ�.
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        
        
    }// end onCreatete()

	@Override
	public void onClick(View v) { // Ŭ���� ȣ��Ǵ� �ݹ� �޼ҵ� 
		
		// ����  �������� �����ϴ� �޼ҵ� ���� . ? ���� 
		Button b= (Button)v; // ������: �̺�Ʈ�� �߻��� ��ü�� ��ư���� ����
		String str= b.getTag().toString();
		tv.setText(str);
	} // end 


   
} // end class MainActivity
