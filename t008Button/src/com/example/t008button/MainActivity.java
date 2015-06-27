package com.example.t008button;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn3= (Button) findViewById(R.id.button3);
        Button btn1=(Button) findViewById(R.id.button1);
        // 버튼에 대한 이벤트 처리 하기 
        btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) { // 클릭했을때 호출되는 콜백 메소드 
				Log.d("test", "버튼 클릭됨");
				t1.setText("1버튼을 눌렀네 ? ㅋㅋ ");
			}
		});
        
        
        Button btn2= (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d("test","두번쨰 버튼 로그 클릭됨 "); 
				t1.setText("2버튼을 눌렀네 ? ㅋㅋ ");
			}
		});
        
        t1 = (TextView) findViewById(R.id.textView1);
        
        
        btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				 t1.setText("버튼을 눌렀네 ? ㅋㅋ ");
				// 참조 변수가 메모리에서 먼저 삭제되면 안된다. 참조변수 : 지역변수라서
				// 해결 방법 1. 참조변수를 전역 변수로 선언해서 사용한다.
				// 해결 방법 2. 지역변수 선언시 final 제어자를 추가한다.
				
			}
		});
    }// end onCreate


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
