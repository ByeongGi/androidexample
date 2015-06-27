package com.example.t055intent;

import java.io.Serializable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // ���� xml �� ���� 
        
        // ȭ����ȯ(Intent ������) �ܰ�
        // 1. ���� ȭ���� ����� .(layout xml, java)
        // 2. AndroidManifest.xml ���Ͽ� ȭ���� ����Ѵ�.
        // 3. Intent�� ������.
        
        Button b= (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), Next01.class); // ����Ʈ ����
				// �����͸� Intent�� �Ǿ ������
				intent.putExtra("num",// key 
						3); // �����Ͱ� 
				
				intent.putExtra("num2", 2);
				intent.putExtra("long", 30L);
				String[] list={"��","��","��","��"};
				intent.putExtra("list", list);
				// ��ü ������ ��� 
				Man m = new Man();
				m.name= "���α� ";
				m.age= 36;
				m.sex= true;
				
				intent.putExtra("m",m);// ��ü�� �������� ��� 
				// ��ü ����ο� implements Serializable �ϸ� �ȴ� . // �����͸� �������� ������ ���� ���� 
				startActivity(intent); // ���ٵ� ���� 
				
				
			}
		});
        
        
        
    }


}



class Man implements Serializable{ // �ڹٺ�  - ������ ����� ���� (Model)
	String name; 
	int age;
	boolean sex;
	
}


