package com.example.handlermessge;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class MainActivity extends Activity {

	int mManinValue = 0;
	int mBackValue = 0;
	TextView mMainText;
	TextView mBackTest;

	BackThread thread;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		thread = new BackThread(mHandler);
		thread.setDaemon(true);
		thread.start();
	}

	Handler mHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			if (msg.what == 0) {
				// 처리할 내용
			}
		};
	};
}

class BackThread extends Thread {
	Handler mHandler;

	public BackThread(Handler handler) {
		// TODO Auto-generated constructor stub
		mHandler = handler;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Message msg = new Message();
		msg.what = 0;
		msg.arg1 = 1;
		mHandler.sendMessage(msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
