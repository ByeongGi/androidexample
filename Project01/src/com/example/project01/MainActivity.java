package com.example.project01;

import android.support.v7.app.ActionBarActivity;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity implements OnClickListener {
	LinearLayout ll1; // 레이아웃의 저장할 주소값 지정 
	LinearLayout ll2;	
	LinearLayout ll3;	
	LinearLayout ll4;	
	LinearLayout ll5;	
	LinearLayout ll6;	
	LinearLayout ll7;	
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        Button b1 = (Button) findViewById(R.id.button1); // 처음 
        Button b2 = (Button) findViewById(R.id.button2); // 목록
        Button b3 = (Button) findViewById(R.id.button3); // 이전
        Button b4 = (Button) findViewById(R.id.button4); // 다음 
        Button b5 = (Button) findViewById(R.id.Button1_java); // 다음 
        Button b6 = (Button) findViewById(R.id.Button_android); // 다음 
        
        ll1= (LinearLayout) findViewById(R.id.mainLayout); // 실제 xml 에서 만들어진 객체를 저장 
    	ll2= (LinearLayout) findViewById(R.id.subLayout1);
    	ll3= (LinearLayout) findViewById(R.id.subLayout2);
    	ll4= (LinearLayout) findViewById(R.id.subLayout3);
    	ll5= (LinearLayout) findViewById(R.id.studySelect1); // 자바 문제 선택 
    	ll6= (LinearLayout) findViewById(R.id.studySelect2); // 안드로이드 문제 선택 
    	ll7= (LinearLayout) findViewById(R.id.studySelect0); // 선택화면  
        
        
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        
        
    }



	@Override
	public void onClick(View v) {
		Button b = (Button)v;
		int index=b.getId();
		
		switch (index) {
		case R.id.button1:
			ll1.setVisibility(View.VISIBLE);
			ll7.setVisibility(View.VISIBLE);
			ll2.setVisibility(View.INVISIBLE);
			ll3.setVisibility(View.INVISIBLE);
			ll4.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.INVISIBLE);
			ll6.setVisibility(View.INVISIBLE);
			break;
		case R.id.button2:
			ll1.setVisibility(View.INVISIBLE);
			ll2.setVisibility(View.VISIBLE);
			ll3.setVisibility(View.INVISIBLE);
			ll4.setVisibility(View.INVISIBLE);
			break;
		case R.id.button3:
			ll1.setVisibility(View.INVISIBLE);
			ll2.setVisibility(View.INVISIBLE);
			ll3.setVisibility(View.VISIBLE);
			ll4.setVisibility(View.INVISIBLE);
			break;
		case R.id.button4:
			ll1.setVisibility(View.INVISIBLE);
			ll2.setVisibility(View.INVISIBLE);
			ll3.setVisibility(View.INVISIBLE);
			ll4.setVisibility(View.VISIBLE);
			break;
		case R.id.Button1_java:
			ll7.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.VISIBLE);
			ll6.setVisibility(View.INVISIBLE);
			
			break;
		case R.id.Button_android:
			ll7.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.INVISIBLE);
			ll6.setVisibility(View.VISIBLE);
			
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		
	}// end onClick
	
	
	
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
	        if (id == R.id.buttoninsert1) {
	            return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }

	
	
	
} // end class MainActivity



