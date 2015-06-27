package com.example.t066optionmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	MenuItem item1;
	MenuItem item2;
	MenuItem item3;
	TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.textView1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
    	item1= menu.add(0,1,100,"»¡°­");
    	item2= menu.add(0,2,100,"³ë¶û");
    	item3= menu.add(0,3,100,"ÃÊ·Ï");
    	item1.setEnabled(true);		
    	item2.setEnabled(true);		
    	item3.setEnabled(true);	
    	
    	
    	
    	
    	
    	item1.setOnMenuItemClickListener(new OnMenuItemClickListener() {
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				// TODO Auto-generated method stub
				tv.setBackgroundColor(Color.RED);
				return false;
			}
		});
    	item2.setOnMenuItemClickListener(new OnMenuItemClickListener() {
    		
    		@Override
    		public boolean onMenuItemClick(MenuItem item) {
    			tv.setBackgroundColor(Color.BLUE);
    			return false;
    		}
    	});
    	item3.setOnMenuItemClickListener(new OnMenuItemClickListener() {
    		
    		@Override
    		public boolean onMenuItemClick(MenuItem item) {
    			tv.setBackgroundColor(Color.GREEN);
    			return false;
    		}
    	});
    	
    	
    	
    	
    	
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
