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
        
        final SoundPool sp = new SoundPool(1, // 최대 음악 파일의 갯수 
				AudioManager.STREAM_MUSIC, // 스트림 타입 
				0); // 음질 - 기본값 :0
        
        final int soundID = sp.load(this, // 현재 화면의 제어권자 
				R.raw.battlecruiser_engage_sound_effect, // 음악 파일 
				1); // 우선순위 
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
			sp.play(soundID,// 준비한 사운드 아이디
					1, // 왼쪽 볼륨 float 
					1, // 오른쪽 볼륨 flaot
					0, // 우선순위 int
					3, // 반복횟수 int -1: 무한반복 ,0 :반복안함 
					1); // 재생속도 float 0.5(절반속도)~2.0(2배속)
			
				
			}
		});
        
    } // and onCreate


    
} // end class MainActivity
