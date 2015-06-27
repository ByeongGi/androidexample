package com.example.t47progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.widget.ProgressBar;


public class MainActivity extends ActionBarActivity {
	Handler handler = new Handler(); // Thread���� ȭ�� ���� 
	int value=0; // progressBar ��
	int a=1;
	boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ���� �����ϸ� , Thread �� �����ؼ� ProgressBar�� ������Ű�� 
        // Thread ���ο��� �۾��� �Ϸ��� Handler�� ����ؾ� �Ѵ�.
        final ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar1);
        Thread t = new Thread(new Runnable() { // Thread �� �۾��� ������ ���� 
			
			@Override
			public void run() {
				while(true){
					handler.post(new Runnable() { // ȭ�鿡 �����ϴ� �۾��� ���� 
						
						@Override
						public void run() {
							
							pb.setProgress(value);
							
							
						}
					});
					
					try {
						Thread.sleep(10); // �ð� ����
					} catch (InterruptedException e) {	}
					
					
				} // end of while()
				
				
			}
		});// end Thread ���� �ɸ��� �۾��� ���� 
        
        t.start();
        
        
        
    } // end onCreate


}
