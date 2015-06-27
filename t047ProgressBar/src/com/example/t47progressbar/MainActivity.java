package com.example.t47progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.widget.ProgressBar;


public class MainActivity extends ActionBarActivity {
	Handler handler = new Handler(); // Thread에서 화면 제어 
	int value=0; // progressBar 값
	int a=1;
	boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 앱이 시작하면 , Thread 를 시작해서 ProgressBar를 증가시키기 
        // Thread 내부에서 작업을 하려면 Handler를 사용해야 한다.
        final ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar1);
        Thread t = new Thread(new Runnable() { // Thread 로 작업할 내용을 구현 
			
			@Override
			public void run() {
				while(true){
					handler.post(new Runnable() { // 화면에 변경하는 작업을 구현 
						
						@Override
						public void run() {
							
							pb.setProgress(value);
							
							
						}
					});
					
					try {
						Thread.sleep(10); // 시간 지연
					} catch (InterruptedException e) {	}
					
					
				} // end of while()
				
				
			}
		});// end Thread 오래 걸리는 작업을 구현 
        
        t.start();
        
        
        
    } // end onCreate


}
