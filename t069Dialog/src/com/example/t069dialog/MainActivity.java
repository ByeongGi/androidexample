package com.example.t069dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.provider.MediaStore.Images;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Dialog 다이얼로그 클래스로 다이얼 로그를 만든다. 
        final Dialog d= new Dialog(this);
        d.setTitle("다이얼로그 제목입니다.");
        d.setContentView(R.layout.dialog);
        Button b=(Button) d.findViewById(R.id.button1);
        iv = (ImageView) d.findViewById(R.id.imageView1);
        d.show(); // 다이얼로그 띄우기 
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iv.setImageResource(R.drawable.line2);
				Toast.makeText(getApplicationContext(), "토스트 먹고싶다고 !!", Toast.LENGTH_LONG);
//				d.dismiss(); // 다이얼 로그 객체를 제거 
//				d.hide(); // 다이얼로그 객체를 화면에서만 제거 
			}
		});
        
        
        
        d.setOwnerActivity(MainActivity.this); // 액비티비와 동기화
        d.setCanceledOnTouchOutside(true); // 다이얼로그 바깥 영역을 클릭시 종료할것인지 여부
    } // end onCreate


   
} // end class
