package com.example.t072dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	final int M_C1= 4;
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView2);
        
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				showDialog(M_C1);
				
			}
		});
        
        
    }// 
    
    
    @Override
    @Deprecated
    protected Dialog onCreateDialog(int id) {
    	final String items[] = {"�ѱ�","����","�ҷ�","����"};
    	final boolean checked[] = {true,false,true,true};
    	switch (id) {
		case M_C1:
			AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
			builder.setTitle("MuiltiChoice ���̾�α� ����")
					.setNegativeButton("���ÿϷ�", null)
					.setPositiveButton("���",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							String str = "���õ� ���� : ";
							for (int i = 0; i < checked.length; i++) {
								if (checked[i]) {
									str = str + items[i]+",";
								}
							}
							
						}
					})
					.setMultiChoiceItems(items, // üũ�ڽ� ����Ʈ �׺�
							checked, // �ʱⰪ (���ÿ���) �迭
							new DialogInterface.OnMultiChoiceClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which, boolean isChecked) {
									tv.setText("���õ� ���� :"+which);
									
								}
							});
					
		return builder.create();
		}
    	return super.onCreateDialog(id);
    }


  
}
