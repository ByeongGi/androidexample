package com.example.t087jsonparser;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView) findViewById(R.id.textView1);
        Button b = (Button) findViewById(R.id.button1);
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				goJSONParser();
				
			}
		});
        
    }

    void goJSONParser(){
    	try {
			StringBuffer sb = new StringBuffer();
			URL url = new URL("http://api.androidhive.info/contacts/");
			
			String str = getResources().getString(R.string.strxml);
			JSONArray jaArray = new JSONArray(str);
			for (int i = 0; i < jaArray.length(); i++) {
				JSONObject jsonObject=jaArray.getJSONObject(i);
				String name = jsonObject.getString("name");
				int age = jsonObject.getInt("age");
				String address = jsonObject.getString("address");
				sb.append("이름 :"+name+"\n"+"나이 :"+age+"\n"+"주소 : "+address);
			}
			
			tv.setText(sb.toString());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    	
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
