package com.example.t008button;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn3= (Button) findViewById(R.id.button3);
        Button btn1=(Button) findViewById(R.id.button1);
        // ��ư�� ���� �̺�Ʈ ó�� �ϱ� 
        btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) { // Ŭ�������� ȣ��Ǵ� �ݹ� �޼ҵ� 
				Log.d("test", "��ư Ŭ����");
				t1.setText("1��ư�� ������ ? ���� ");
			}
		});
        
        
        Button btn2= (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d("test","�ι��� ��ư �α� Ŭ���� "); 
				t1.setText("2��ư�� ������ ? ���� ");
			}
		});
        
        t1 = (TextView) findViewById(R.id.textView1);
        
        
        btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				 t1.setText("��ư�� ������ ? ���� ");
				// ���� ������ �޸𸮿��� ���� �����Ǹ� �ȵȴ�. �������� : ����������
				// �ذ� ��� 1. ���������� ���� ������ �����ؼ� ����Ѵ�.
				// �ذ� ��� 2. �������� ����� final �����ڸ� �߰��Ѵ�.
				
			}
		});
    }// end onCreate


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
