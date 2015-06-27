package com.example.t052soundpool;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b = (Button) findViewById(R.id.button1);
        
        final SoundPool sp = new SoundPool(1, // �ִ� ���� ������ ���� 
				AudioManager.STREAM_MUSIC, // ��Ʈ�� Ÿ�� 
				0); // ���� - �⺻�� :0
        
        final int soundID = sp.load(this, // ���� ȭ���� ������� 
				R.raw.battlecruiser_engage_sound_effect, // ���� ���� 
				1); // �켱���� 
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
			sp.play(soundID,// �غ��� ���� ���̵�
					1, // ���� ���� float 
					1, // ������ ���� flaot
					0, // �켱���� int
					3, // �ݺ�Ƚ�� int -1: ���ѹݺ� ,0 :�ݺ����� 
					1); // ����ӵ� float 0.5(���ݼӵ�)~2.0(2���)
			
				
			}
		});
        
    } // and onCreate


    
} // end class MainActivity
