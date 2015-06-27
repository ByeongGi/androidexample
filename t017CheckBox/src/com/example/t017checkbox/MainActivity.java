package com.example.t017checkbox;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnCheckedChangeListener {

    private TextView tv;
	private CheckBox cb1;
	private CheckBox cb2;
	private CheckBox cb3;
	private CheckBox cb4;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        tv = (TextView) findViewById(R.id.textView3);
        
//        cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
//			
//			@Override
//			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//				// üũ �ڽ��� Ŭ���ؼ� ���°� �������� ȣ��Ǵ� �ݹ�  �޼ҵ� 
//				if (isChecked) tv.setText("üũ�Ǿ���");
//				else tv.setText("üũ���� ����");
//				
////				tv.setText(isCheck ? "üũ ����" : "üũ ������ ")
//			}
//		});
        
        
        cb1.setOnCheckedChangeListener(this); 
        cb2.setOnCheckedChangeListener(this); // ����� �ڵ��� �ߺ��� ����
        cb3.setOnCheckedChangeListener(this); 
        cb4.setOnCheckedChangeListener(this); 
        
        
        
        
        
        
        
        
        
        
    } // onCreate

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// üũ �ڽ��� Ŭ���ؼ� ���°� �ٲ���� ��� ȣ��Ǵ� �ݹ� �޼ҵ� 
		String result =""; // ���ڿ��� �ʱ�ȭ�� �� ���ڿ��� ���� 
		
		if (cb1.isChecked()) result += cb1.getText().toString()+",";
		if (cb2.isChecked()) result += cb2.getText().toString()+",";
		if (cb3.isChecked()) result += cb3.getText().toString()+",";
		if (cb4.isChecked()) result += cb4.getText().toString();
		tv.setText("üũ�׸� : "+result);
		
		
	}// end onCheckedChanged


   
} // end class MainActivity
