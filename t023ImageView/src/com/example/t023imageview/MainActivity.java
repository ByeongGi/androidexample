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
	// 멤버변수 
	
	Handler handler = new Handler();// 외부쓰레드에서  메인 OS UI 화면을 그릴때 사용 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 웹에서 이미지 imageView 가져오기
        // 1. 인터넷에 접근 권한을 획득한다.
        // 2. 꼭 쓰레드로  웹의 이미지를 받아온다 - 안드로이드 3.0 허니콤 버전부터 바뀜 
        // 			
        // 3. 외부 쓰레드서 메인 UI 에서 접근 하려면 Handler 를 사용해야 한다 .     UI - Main-(Handler)- 외부쓰레드  
        // 외부 쓰레드에서 Handler 로 Main 을 통해서 UI에 접근하게 된다 .
        
        
        // 쓰레드 사용법: 내부 클래스 사용법으로 구현
        
        
        Thread t= new Thread(new Runnable() {           // 런너블 객체를 만든다.
			
			@Override
			public void run() { // 실제로 오래걸릴 작업을 구현한다.
				try {
					final ImageView iv= (ImageView) findViewById(R.id.imageView1);
					URL url = new URL("http://old.img.clien.net/old/file/park/1374472928_b5XUdps9_2013-07-22-14-52-03-1.jpg");
					InputStream is = url.openStream();
					final Bitmap bm = BitmapFactory.decodeStream(is);
					handler.post(new Runnable() {
						
						@Override
						public void run() { // 화면에 그려질 작업 
							iv.setImageBitmap(bm); // 비트맵 객체로 보여주기 
							
						}
					});
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
        
        
        t.start();// 준비한 쓰레드를 시작한다 .
       
        
        
        
        
        
        
        
        
    }// end onCreate


   
}// end class MainActivity
