package com.example.t057intentproject;

import android.app.DownloadManager.Request;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

     TextView tv ;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText et1 = (EditText) findViewById(R.id.editText1);
        final EditText et2 = (EditText) findViewById(R.id.editText2);
         tv = (TextView) findViewById(R.id.textView1);
        Button b = (Button) findViewById(R.id.button1);
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int a = Integer.parseInt(et1.getText().toString());
				int b = Integer.parseInt(et2.getText().toString());
				Intent intent = new Intent(getApplicationContext(),Next01.class);
				 intent.putExtra("num1",a);
				 intent.putExtra("num2",b);
				// ���� �������� ��� ȭ�� �ѱ�� �޼ҵ� 
				startActivityForResult(intent,1); // ȭ�� �ѱ�� // Requestcode � ȭ������ ������
				
			}
		});
    }
    
    
    @Override
    protected void onActivityResult(int requestcode, int resultcode, Intent intent) {
    	// �Ѿ� ���� ȭ�鿡�� �ǵ��� ������ ȣ��Ǵ� �޼ҵ� 
    	if (resultcode==RESULT_OK){ // ���� ��ȯ�϶��� �����ϰڴ�.
    		int result=intent.getIntExtra("hap", 0);
    		tv.setText("���� ���:"+result);
    	}
    }
    
    
} // end of class 
