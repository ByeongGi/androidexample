package com.example.t048seekbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView tv = (TextView) findViewById(R.id.textView1);
        SeekBar sb = (SeekBar) findViewById(R.id.seekBar1);
        
        sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) { // 사용자가 터치를 안했을때 알려줌 
				tv.setText("터치 를 멈춤 "+"");
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) { // 사용자가 터치를 시작했을때 알려줌 
				tv.setText("터치를 시작 "+"");
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, // 사용자가 프로그래스를  변화는것을 알려줌 
					boolean fromUser) {
				tv.setText("변화는 값"+progress+"");
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
