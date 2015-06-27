package com.example.t055intent;

import java.io.Serializable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 메인 xml 과 연결 
        
        // 화면전환(Intent 날릴때) 단계
        // 1. 다음 화면을 만든다 .(layout xml, java)
        // 2. AndroidManifest.xml 파일에 화면을 등록한다.
        // 3. Intent를 날린다.
        
        Button b= (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), Next01.class); // 인턴트 생성
				// 데이터를 Intent에 실어서 보내기
				intent.putExtra("num",// key 
						3); // 데이터값 
				
				intent.putExtra("num2", 2);
				intent.putExtra("long", 30L);
				String[] list={"가","나","다","라"};
				intent.putExtra("list", list);
				// 객체 보내는 방법 
				Man m = new Man();
				m.name= "서민규 ";
				m.age= 36;
				m.sex= true;
				
				intent.putExtra("m",m);// 객체를 보내야할 경우 
				// 객체 선언부에 implements Serializable 하면 된다 . // 데이터를 연속으로 보내는 구조 변경 
				startActivity(intent); // 인텐드 실행 
				
				
			}
		});
        
        
        
    }


}



class Man implements Serializable{ // 자바빈  - 데이터 저장용 단위 (Model)
	String name; 
	int age;
	boolean sex;
	
}


