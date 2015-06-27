package com.example.t031debug;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        int x = 100;
        
        for (int i = 0; i < 10; i++) {
			Log.d("test","debug È®ÀÎ");
			x++;
		}
        String str = null;
        char c = str.charAt(0);
        
        
        
        
    }


    
}// end Class MainActivity
