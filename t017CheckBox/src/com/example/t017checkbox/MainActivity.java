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
//				// 체크 박스를 클릭해서 상태가 변했을떄 호출되는 콜백  메소드 
//				if (isChecked) tv.setText("체크되었음");
//				else tv.setText("체크되지 않음");
//				
////				tv.setText(isCheck ? "체크 했음" : "체크 안했음 ")
//			}
//		});
        
        
        cb1.setOnCheckedChangeListener(this); 
        cb2.setOnCheckedChangeListener(this); // 비슷한 코드의 중복을 제거
        cb3.setOnCheckedChangeListener(this); 
        cb4.setOnCheckedChangeListener(this); 
        
        
        
        
        
        
        
        
        
        
    } // onCreate

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// 체크 박스를 클릭해서 상태가 바뀌었을 경우 호출되는 콜백 메소드 
		String result =""; // 문자열의 초기화는 빈 문자열로 하자 
		
		if (cb1.isChecked()) result += cb1.getText().toString()+",";
		if (cb2.isChecked()) result += cb2.getText().toString()+",";
		if (cb3.isChecked()) result += cb3.getText().toString()+",";
		if (cb4.isChecked()) result += cb4.getText().toString();
		tv.setText("체크항목 : "+result);
		
		
	}// end onCheckedChanged


   
} // end class MainActivity
