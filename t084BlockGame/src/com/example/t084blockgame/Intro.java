package com.example.t084blockgame;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class Intro extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        // 초기 화면  - intro
        // 3초 후에 메인 화면으로 이동 
        Timer timer = new Timer(); 
        TimerTask tTask= new TimerTask() {
			
			@Override
			public void run() {
				 Intent intent = new Intent(getApplicationContext(),Main.class);
				 startActivity(intent);
				 finish();
				
			}
		};
		
        timer.schedule(tTask, 2000);
       
        // 가로 /세로 변경이 안 되도록 지정하기 
        // AdroidMainfext.xml ScreenOriention 지정 
        
        
        
        
        // 다음으로 화면 넘기기 
        // 1. 다음 화면 xml,java 파일 작성 -> 메니페스트 등록 -> 객체 생생 후 인턴트 날림
       
    }


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
