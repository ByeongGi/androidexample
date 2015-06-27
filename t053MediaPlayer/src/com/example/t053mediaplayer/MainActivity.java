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
	SeekBar sb; // ���� ��� ��ġ�� ��Ÿ���� ��ũ��
	boolean isPlaying = false;// ���������
	class MyThread extends Thread{
		@Override
		public void run(){ // ��ũ�ٰ� ���۵Ǹ� �ݹ�Ǵ� �޼��� 
			// ��ũ�� ����� ���ݾ� �����̱�
			
			while(isPlaying){
				
				sb.setProgress(mp.getCurrentPosition());
			}
			
			
			
		}
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // �̵�� �÷��̾� Ȱ���ϱ�
        mp = new MediaPlayer();
        b1 = (Button) findViewById(R.id.button1); // ���� 
        b2 = (Button) findViewById(R.id.button2); // ���� 
        b3 = (Button) findViewById(R.id.button3); // �Ͻ����� 
        b4 = (Button) findViewById(R.id.button5); // ����� 
        sb = (SeekBar) findViewById(R.id.seekBar1);
        
        // ��ũ���� �̺�Ʈ ó�� 
        
        sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				isPlaying = true;
				int ttt= sb.getProgress(); // ����ڰ� ���������� ��ġ 
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
				mp.setLooping(false); // true ���ѹݺ�
				mp.start();
				
				
				
				int a =mp.getDuration();// ��� �ð� 
				sb.setMax(a);// ��ũ���� �ִ� ������ �뷡�� �� ����ð����� ���� 
				
				b1.setVisibility(View.INVISIBLE);
				b2.setVisibility(View.VISIBLE);
				b3.setVisibility(View.VISIBLE);
				b4.setVisibility(View.VISIBLE);
				new MyThread().start();// ��ũ�� �׷��� ������ 
				isPlaying =true;
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ���� ���� 
				isPlaying= false; // ������ ���� 
				sb.setProgress(0); // ��ũ�� ����ȭ 
				mp.stop(); // ���� 
				mp.release(); // �ڿ� ��ü 
				b1.setVisibility(View.VISIBLE);
				b2.setVisibility(View.INVISIBLE);
				b3.setVisibility(View.INVISIBLE);
				b4.setVisibility(View.INVISIBLE);
			}
		});
        
        
        b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pos=mp.getCurrentPosition(); // ���� ��ġ ���� 
				mp.pause(); // �Ͻ� ���� ���� 
				
				b3.setVisibility(View.INVISIBLE);
				b4.setVisibility(View.VISIBLE);
				isPlaying =false;
			}
		});
        
        
        b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ���� ���� ���� ����� 
				mp.seekTo(pos);
				mp.start(); // ����(ó������)
				b3.setVisibility(View.VISIBLE);
				b4.setVisibility(View.INVISIBLE);
				isPlaying =true;// ����ϵ��� �÷��� ����
				new MyThread().start();// ������ ���� 
				
			}
		});
        
    }// end onCreate
    	
    @Override
    protected void onPause() {
    	isPlaying= false;
    	super.onPause();// UI���� ���� �����
    	if(mp!=null){
    		mp.release();}
    	mp.release();// �ڿ���ü
    	b1.setVisibility(View.VISIBLE);
    	b1.setVisibility(View.INVISIBLE);
    	b1.setVisibility(View.INVISIBLE);
    	b1.setVisibility(View.INVISIBLE);
    	
    }
}
