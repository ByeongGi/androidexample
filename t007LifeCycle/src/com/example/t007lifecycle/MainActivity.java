package com.example.t007lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {


	

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 앱이 최초 실행 될때 호출되는 콜백 메소드 
        Log.d("test","onCreate");
    } //  
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("test","onResume");
	}
	
    @Override
    protected void onStart() {
    	super.onStart();
    	 Log.d("test","onStart");
    }
    
    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("test","onPause");
	}
    

    @Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("test","onDestroy");
	}
 
    

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("test","onRestart");
	}

	

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("test","onStop");
	}
    
    
} // end class MainActivity
