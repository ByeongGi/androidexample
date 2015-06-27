package com.example.t086htmlload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	 TextView tv;
	 HtmlThread htmlThread;
	 // ������Ʈ �ּҸ� ������ ����
	 String urlAddress = "https://apis.daum.net/contents/movie?apikey=bf6652bf6a1564fd4a8f24db7a7ab3ce&q=%EB%AF%B8%EC%83%9D&result=1&pageno=1&output=json"; 
	 Handler handler = new Handler(); // ȭ�鿡 �׷��ֱ� ���� ��ü
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv= (TextView) findViewById(R.id.textView1);
        
        
        
			
        
        tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				loadHtml();
				
			}
		});
        
        
       
		
		
		
        
        
        // ������ Html - ���ͳ� ����, Thread ���� �ڵ鷯�� ���� ���� 
        
        
    } // end onCreate
    
    
    
    
    void loadHtml() { // ������ html �о����
    	Thread t = new Thread(new Runnable() {
    		@Override
    		public void run() {
    			final StringBuffer sb = new StringBuffer();
    			
    			try {
    				URL url = new URL(urlAddress);
    				HttpURLConnection conn = 
    					(HttpURLConnection)url.openConnection();// ����
    				if (conn != null) {
    					conn.setConnectTimeout(2000);
    					conn.setUseCaches(false);
    					if (conn.getResponseCode()
    							==HttpURLConnection.HTTP_OK){
    					//	������ �б�
    						BufferedReader br 
    							= new BufferedReader(new InputStreamReader
    							(conn.getInputStream(),"euc-kr"));//"utf-8"
    						while(true) {
    							String line = br.readLine();
    							if (line == null) break;
    							sb.append(line+"\n");
    						}
    						br.close(); // ��Ʈ�� ����
    					}
    					conn.disconnect(); // ���� ����
    				}
    				// ���� ����ϱ�
    				Log.d("test",sb.toString());
    				handler.post(new Runnable() {
    					@Override
    					public void run() {
    						tv.setText(sb.toString());
    					}
    				});
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    	});
    	t.start(); // ������ ����
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Handler mHandler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			if (msg.what==0) {
				StringBuffer sb=(StringBuffer) msg.obj;
				tv.setText(sb.toString()+"");
			}
			
		}
	};
    
} // end class MainActivity



class HtmlThread extends Thread{
	Handler htmlhandler; 
	public String URLAddress ="http://www.kma.co.kr"; 
	StringBuffer sb;
	public HtmlThread(Handler handler) {
		this.htmlhandler= new Handler();
	}
	@Override
	public void run() {
		
		try {
			StringBuffer sb = new StringBuffer();
			URL url = new URL(URLAddress);
			HttpURLConnection conn =(HttpURLConnection) url.openConnection();
			if (conn!=null) {
				conn.setConnectTimeout(1000);
				conn.setUseCaches(false);
				if (conn.getResponseCode()==HttpURLConnection.HTTP_OK) {
					// �����͸� �б� 
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					
					while (true) {
						String line =in.readLine();
						if (line==null)
							break;
						
							sb.append(line + "\n");

						in.close();
					}
					
				}
				conn.disconnect(); // ���� ���� 
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	} // end run()
	
	
	
} // end class HtmlThread