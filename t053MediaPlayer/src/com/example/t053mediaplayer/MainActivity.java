package com.example.t053mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;


public class MainActivity extends ActionBarActivity {
	MediaPlayer mp;
	int pos;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	SeekBar sb; // 음악 재생 위치를 나타내는 시크바
	boolean isPlaying = false;// 재생중인지
	class MyThread extends Thread{
		@Override
		public void run(){ // 시크바가 시작되면 콜백되는 메서드 
			// 시크바 막대기 조금씩 움직이기
			
			while(isPlaying){
				
				sb.setProgress(mp.getCurrentPosition());
			}
			
			
			
		}
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 미디어 플레이어 활용하기
        mp = new MediaPlayer();
        b1 = (Button) findViewById(R.id.button1); // 시작 
        b2 = (Button) findViewById(R.id.button2); // 정지 
        b3 = (Button) findViewById(R.id.button3); // 일시정지 
        b4 = (Button) findViewById(R.id.button5); // 재시작 
        sb = (SeekBar) findViewById(R.id.seekBar1);
        
        // 시크바의 이벤트 처리 
        
        sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				isPlaying = true;
				int ttt= sb.getProgress(); // 사용자가 움직여놓은 위치 
				mp.seekTo(ttt);
				mp.start();
				new MyThread().start();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				isPlaying = false;
				mp.pause();
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				if(progress== seekBar.getMax()) {
					b1.setVisibility(View.VISIBLE);
					b2.setVisibility(View.INVISIBLE);
					b3.setVisibility(View.INVISIBLE);
					b4.setVisibility(View.INVISIBLE);
					isPlaying = false;
					mp.stop();
				}
				
				
				
			}
		});
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mp= MediaPlayer.create(
						getApplicationContext(),
						R.raw.a00);
				mp.setLooping(false); // true 무한반복
				mp.start();
				
				
				
				int a =mp.getDuration();// 재생 시간 
				sb.setMax(a);// 시크바의 최대 범위로 노래의 총 재생시간으로 설정 
				
				b1.setVisibility(View.INVISIBLE);
				b2.setVisibility(View.VISIBLE);
				b3.setVisibility(View.VISIBLE);
				b4.setVisibility(View.VISIBLE);
				new MyThread().start();// 씨크바 그려줄 쓰래드 
				isPlaying =true;
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 음악 종료 
				isPlaying= false; // 쓰레드 종료 
				sb.setProgress(0); // 씨크바 조기화 
				mp.stop(); // 멈춤 
				mp.release(); // 자원 해체 
				b1.setVisibility(View.VISIBLE);
				b2.setVisibility(View.INVISIBLE);
				b3.setVisibility(View.INVISIBLE);
				b4.setVisibility(View.INVISIBLE);
			}
		});
        
        
        b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pos=mp.getCurrentPosition(); // 정지 위치 저장 
				mp.pause(); // 일시 정지 구현 
				
				b3.setVisibility(View.INVISIBLE);
				b4.setVisibility(View.VISIBLE);
				isPlaying =false;
			}
		});
        
        
        b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 멈춘 지점 부터 재시작 
				mp.seekTo(pos);
				mp.start(); // 시작(처음부터)
				b3.setVisibility(View.VISIBLE);
				b4.setVisibility(View.INVISIBLE);
				isPlaying =true;// 재생하도록 플래그 변경
				new MyThread().start();// 쓰래그 시작 
				
			}
		});
        
    }// end onCreate
    	
    @Override
    protected void onPause() {
    	isPlaying= false;
    	super.onPause();// UI에서 앱이 벗어날떄
    	if(mp!=null){
    		mp.release();}
    	mp.release();// 자원해체
    	b1.setVisibility(View.VISIBLE);
    	b1.setVisibility(View.INVISIBLE);
    	b1.setVisibility(View.INVISIBLE);
    	b1.setVisibility(View.INVISIBLE);
    	
    }
}
