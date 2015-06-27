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
        // ContextMenu - ��ü�� �� Ŭ�������� ������ �޴� 
        // Pc ���� ���콺 ��Ŭ������ �ΰ��������� �����ϴ� ����� 
        // ����Ʈ�������� �� Ŭ���� ContextMenu�� ��ü�Ѵ�.
        tv= (TextView) findViewById(R.id.textView1);
        registerForContextMenu(tv); // ������ ContextMenu �並 ����� 

    }
    
    
    
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
    		ContextMenuInfo menuInfo) {
    	// super.onCreateContextMenu(menu, v, menuInfo);
    	// ���ؽ�Ʈ �޴��� ���ʷ� ���϶� �ѹ��� ȣ��Ǵ� �޼ҵ� 
    	Log.d("test", " onCreateContextMenu");
   // 	getMenuInflater().inflate(R.menu.main, menu);
    	menu.setHeaderIcon(R.drawable.ic_launcher); // ����� �޼��ִ°� context �޴����� ���� 
    	menu.setHeaderTitle("Ÿ��Ʋ ");
    	menu.add(0,1,100,"����");
    	menu.add(0,2,100,"���");
    	menu.add(0,3,100,"�Ķ�");
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
