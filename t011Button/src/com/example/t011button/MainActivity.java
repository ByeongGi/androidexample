package com.example.t011button;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.StaticLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	static TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView) findViewById(R.id.TextView1);
        
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5= (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
        Button b9 = (Button) findViewById(R.id.button9);
        Button b0 = (Button) findViewById(R.id.button0);
        
        
        // ���� Ŭ������ �̺�Ʈ�� ó���� ��ü�� �־� ����ϴ¹�
        
        b1.setOnClickListener(new MyLisener());
        b2.setOnClickListener(new MyLisener());
        b3.setOnClickListener(new MyLisener());
        b4.setOnClickListener(new MyLisener());
        b5.setOnClickListener(new MyLisener());
        b6.setOnClickListener(new MyLisener());
        // tip 
        MyLisener m = new MyLisener(); // �ϳ��� �ν��Ͻ��� ���� 
        b7.setOnClickListener(m);
        b8.setOnClickListener(m);
        b9.setOnClickListener(m);
        b0.setOnClickListener(m);
    }

   
} // end class MainActivity


    class MyLisener implements OnClickListener{

	@Override
	public void onClick(View v) { // ��ư Ŭ���� ȣ��Ǵ� �ݹ� �޼ҵ� 
		Button b = (Button)v; // ������: ���� ����ִ� ��ü ��ư�� ������.
		String str=b.getText().toString();
		
		MainActivity.tv.setText(str);
		
	}// end onClick
	
    } // end class MyLisener

