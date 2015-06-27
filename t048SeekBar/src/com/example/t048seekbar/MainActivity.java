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
			public void onStopTrackingTouch(SeekBar seekBar) { // ����ڰ� ��ġ�� �������� �˷��� 
				tv.setText("��ġ �� ���� "+"");
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) { // ����ڰ� ��ġ�� ���������� �˷��� 
				tv.setText("��ġ�� ���� "+"");
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, // ����ڰ� ���α׷�����  ��ȭ�°��� �˷��� 
					boolean fromUser) {
				tv.setText("��ȭ�� ��"+progress+"");
				
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
