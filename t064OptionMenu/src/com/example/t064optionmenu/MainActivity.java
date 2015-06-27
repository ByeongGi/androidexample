package com.example.t064optionmenu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	boolean loginflag = false; // 로그아웃 상태 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	// 메뉴버튼이 눌러질때 실행되는 콜백 메소드
    	// 메뉴버튼이 눌렀을때 보여줄 메뉴에 대해서 정의 
        getMenuInflater().inflate(R.menu.main, menu);
        Log.d("test", "메뉴 콜백 "); 
        return true;
       
    }
    
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
    	Log.d("test", "onPrepareOptionsMenu "); // 옵션 메뉴 항목이 보여줄때 마다 호출이 된다 .
    	
    	if (loginflag) { // 로그인 한 상태 
			menu.getItem(1).setEnabled(false);
			menu.getItem(2).setEnabled(true);
			menu.getItem(3).setEnabled(true);
		}else { // 로그아웃한 상태 : 로그인 보이게 로그아웃 안보이게 
			menu.getItem(1).setEnabled(true);
			menu.getItem(2).setEnabled(false);
			menu.getItem(3).setEnabled(false);
		}
    	
    	return super.onPrepareOptionsMenu(menu);
    }
    
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	// 메뉴의 항목을 선택했을대 호출되는 콜백 메소드 
        int id = item.getItemId();
        
        
    	
    	
    	switch (id) {
		case R.id.action_settings:
			Log.d("test", "버튼 콜백 메소드 "+id);
	    	Toast.makeText(getApplicationContext(),"세팅 메뉴 ", Toast.LENGTH_LONG);
	    	return true;
			
		case R.id.menu_login:
			Log.d("test", "버튼 콜백 메소드 "+id);
	    	Toast.makeText(getApplicationContext(),"로긴 메뉴 ", Toast.LENGTH_LONG);
			return true;
		case R.id.menu_logout:
			Log.d("test", "버튼 콜백 메소드 "+id);
	    	Toast.makeText(getApplicationContext(),"로그아웃 ", Toast.LENGTH_LONG);
			return true;
		case R.id.menu_relogin:
			Log.d("test", "버튼 콜백 메소드 "+id);
	    	Toast.makeText(getApplicationContext(),"재접속 ", Toast.LENGTH_LONG);
			return true;
		}
 

        return super.onOptionsItemSelected(item);
    }
}
