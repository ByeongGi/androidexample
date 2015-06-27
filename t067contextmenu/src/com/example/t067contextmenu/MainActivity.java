package com.example.t067contextmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ContextMenu - 객체를 롱 클릭했을때 나오는 메뉴 
        // Pc 에서 마우스 우클릭으로 부가정보들을 제공하는 방법을 
        // 스마트폰에서는 롱 클릭의 ContextMenu로 대체한다.
        tv= (TextView) findViewById(R.id.textView1);
        registerForContextMenu(tv); // 위젯에 ContextMenu 뷰를 등록함 

    }
    
    
    
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
    		ContextMenuInfo menuInfo) {
    	// super.onCreateContextMenu(menu, v, menuInfo);
    	// 컨텍스트 메뉴가 최초로 쓰일때 한번만 호출되는 메소드 
    	Log.d("test", " onCreateContextMenu");
   // 	getMenuInflater().inflate(R.menu.main, menu);
    	menu.setHeaderIcon(R.drawable.ic_launcher); // 헤더를 달수있는것 context 메뉴에만 있음 
    	menu.setHeaderTitle("타이틀 ");
    	menu.add(0,1,100,"빨강");
    	menu.add(0,2,100,"노랑");
    	menu.add(0,3,100,"파랑");
    }
    
    @Override
    public boolean onContextItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()) {
		case 1:
			tv.setTextColor(Color.RED);
			break;
		case 2:
			tv.setTextColor(Color.BLUE);
			break;
		case 3:
			tv.setTextColor(Color.GREEN);
			break;
		}
    	return super.onContextItemSelected(item);
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
