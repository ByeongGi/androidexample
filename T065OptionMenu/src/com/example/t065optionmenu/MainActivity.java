package com.example.t065optionmenu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
 //       getMenuInflater().inflate(R.menu.main, menu);
    	MenuItem item1= menu.add(0,1,100,"로그인");
    	MenuItem item2= menu.add(0,2,100,"로그아웃");
    	MenuItem item3= menu.add(0,3,100,"재로그인");
    	item1.setEnabled(true);		
    	item2.setEnabled(true);		
    	item3.setEnabled(true);		
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
