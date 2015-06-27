package com.example.t084blockgame;

import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Start extends Activity implements OnClickListener {
	TextView tvPoint;
	TextView tvTime;
	Vibrator vibrator;
	int[] img= {R.drawable.key1,R.drawable.key2,R.drawable.key3};
	ImageView[] ivList = new ImageView[6];
	SoundPool soundPool;
	int soundId_Ok; 
	int soundId_Error;
	MediaPlayer mediaPlayer;
	int score=0;
	int time=60;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		
		tvPoint = (TextView) findViewById(R.id.textView1);
		tvTime = (TextView) findViewById(R.id.textView2);
		
		ImageView ivB1= (ImageView) findViewById(R.id.imageView1); // ��ư 1
		ImageView ivB2= (ImageView) findViewById(R.id.imageView2); // ��ư 2
		ImageView ivB3= (ImageView) findViewById(R.id.imageView3); // ��ư 3
		ivB1.setTag(0);
		ivB2.setTag(1);
		ivB3.setTag(2);
		
		// ���� ����� �ʱ�ȭ  : �������� ���� ���� ����
		ivList[0]=(ImageView) findViewById(R.id.ImageView01);
		ivList[1]=(ImageView) findViewById(R.id.ImageView02);
		ivList[2]=(ImageView) findViewById(R.id.ImageView03);
		ivList[3]=(ImageView) findViewById(R.id.ImageView04);
		ivList[4]=(ImageView) findViewById(R.id.ImageView05);
		ivList[5]=(ImageView) findViewById(R.id.ImageView06);
		
//		Random random = new Random();
//		random.nextInt(3);
		for (int i = 0; i < ivList.length; i++) {
			int num=new Random().nextInt(3);
			ivList[i].setImageResource(img[num]);
			ivList[i].setTag(num+"");// ��ư�� ������ �Ǵ��ϱ� ���� ������ ���
		}
		
		
		
		
		
		
		
//		Queue<Integer> list = new LinkedList<Integer>();
//		list.add();
		
		ivB1.setOnClickListener(this);
		ivB2.setOnClickListener(this);
		ivB3.setOnClickListener(this);
		
		new GameThread().start();
		
	} // end onCreate
	@Override
	public void onClick(View v) {
		// ��ư�� �������� ȣ��Ǵ� �ݹ� �޼ҵ� 
		// ��ư�� ���� ������ �������� �Ǻ� - �̹��� ���� ��ĭ�� ������
				ImageView iv = (ImageView) v;
				boolean isOk = false;
				switch (iv.getId()) {
				case R.id.imageView1:
					if ("0".equals(ivList[5].getTag().toString())) {
						isOk=true;
						vibrator.vibrate(100);
						soundPool.play(soundId_Ok, 1, 1, 0, 1, 1);
						score++;
						tvPoint.setText("���� :"+score);
					} else {
						vibrator.vibrate(1000);
						soundPool.play(soundId_Error,1, 1, 0, 1, 1);
						score--;
						tvPoint.setText("���� :"+score);
					}
					break;
				case R.id.imageView2:
					if ("1".equals(ivList[5].getTag().toString())) {
						isOk=true;
						vibrator.vibrate(100);
						soundPool.play(soundId_Ok, 1, 1, 0, 1, 1);
						score++;
						tvPoint.setText("���� :"+score);
					} else {
						vibrator.vibrate(1000);
						soundPool.play(soundId_Error,1, 1, 0, 1, 1);
						score--;
						tvPoint.setText("���� :"+score);
					}
					break;
				case R.id.imageView3:
					if ("2".equals(ivList[5].getTag().toString())) {
						isOk=true;
						vibrator.vibrate(100);
						soundPool.play(soundId_Ok, 1, 1, 0, 1, 1);
						score++;
						tvPoint.setText("���� :"+score);
					} else {
						vibrator.vibrate(1000);
						soundPool.play(soundId_Error,1, 1, 0, 1, 1);
						score--;
						tvPoint.setText("���� :"+score);
					}
					break;
				}
				if (isOk) { // ���������� ������� �ϰ� �� ���ٿ� ���� 
					
					
					for (int i = ivList.length-2; i >=0 ; i--) {
						int num=Integer.parseInt( ivList[i].getTag().toString());
						ivList[i+1].setImageResource(img[num]);
						ivList[i+1].setTag(num+"");
					} 
					
					int num=new Random().nextInt(3);
					ivList[0].setImageResource(img[num]);
					ivList[0].setTag(num+"");
					
				}
	} // end onClick

	
	
	
	
	@Override
	protected void onPause() {
		
		super.onPause();
		if (mediaPlayer!=null) {
			mediaPlayer.stop();
			mediaPlayer.release();
		}
	}
	
	@Override
	protected void onResume() {
				super.onResume();
				vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
				soundPool= new SoundPool(1,AudioManager.STREAM_MUSIC, 0);
				soundId_Ok = soundPool.load(Start.this, R.raw.gun, 1);
				soundId_Error = soundPool.load(Start.this, R.raw.gun2, 1);
				
				mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.mario);
				mediaPlayer.setLooping(false);
				mediaPlayer.start();
	}

	Handler handler = new Handler();
	class GameThread extends Thread{
		
		@Override
		public void run() {
			super.run();
			// �ð��� 1�� ���� ǥ���ϱ�
			// ������ ���ο����� ���� ȭ���� �����Ҽ� �ִ�.
			// UI���ٰ� �۾��� �� ��� Handler ��ü�� �̿��ؾ� �Ѵ�.
			
			handler.postDelayed(new Runnable() {
				
				@Override
				public void run() {
					if (time>=0) {
						tvTime.setText("�ð�"+time);
						time--;
						handler.postDelayed(this, 1000);
					} else {
						tvTime.setText("Timeout");
						AlertDialog.Builder builder = new AlertDialog.Builder(Start.this);
						builder.setTitle("��������");
						builder.setMessage("����"+score);
						builder.setPositiveButton("�ٽ��ϱ�",new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								time = 60;
								score= 0;
								GameThread gameThread = new GameThread();
								
							}
						});
						builder.setNegativeButton("�׸��α�", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								finish();
								
							}
						});
						builder.create();
						builder.show();
					}
					
				}
			}, 1000);
			
			
		}
	} // GameThread

	
	
	
} // end class Start




