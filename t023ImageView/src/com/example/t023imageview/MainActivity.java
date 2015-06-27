package com.example.t023imageview;

import java.io.InputStream;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
	// ������� 
	
	Handler handler = new Handler();// �ܺξ����忡��  ���� OS UI ȭ���� �׸��� ��� 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ������ �̹��� imageView ��������
        // 1. ���ͳݿ� ���� ������ ȹ���Ѵ�.
        // 2. �� �������  ���� �̹����� �޾ƿ´� - �ȵ���̵� 3.0 ����� �������� �ٲ� 
        // 			
        // 3. �ܺ� �����弭 ���� UI ���� ���� �Ϸ��� Handler �� ����ؾ� �Ѵ� .     UI - Main-(Handler)- �ܺξ�����  
        // �ܺ� �����忡�� Handler �� Main �� ���ؼ� UI�� �����ϰ� �ȴ� .
        
        
        // ������ ����: ���� Ŭ���� �������� ����
        
        
        Thread t= new Thread(new Runnable() {           // ���ʺ� ��ü�� �����.
			
			@Override
			public void run() { // ������ �����ɸ� �۾��� �����Ѵ�.
				try {
					final ImageView iv= (ImageView) findViewById(R.id.imageView1);
					URL url = new URL("http://old.img.clien.net/old/file/park/1374472928_b5XUdps9_2013-07-22-14-52-03-1.jpg");
					InputStream is = url.openStream();
					final Bitmap bm = BitmapFactory.decodeStream(is);
					handler.post(new Runnable() {
						
						@Override
						public void run() { // ȭ�鿡 �׷��� �۾� 
							iv.setImageBitmap(bm); // ��Ʈ�� ��ü�� �����ֱ� 
							
						}
					});
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
        
        
        t.start();// �غ��� �����带 �����Ѵ� .
       
        
        
        
        
        
        
        
        
    }// end onCreate


   
}// end class MainActivity
