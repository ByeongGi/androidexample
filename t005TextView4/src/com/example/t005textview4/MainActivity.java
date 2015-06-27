package com.example.t005textview4;// ���� ���� ��ġ 

import android.R.color;
import android.R.string;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
// �ҽ��󿡼� Import �� Ŭ������ Path ���� :�Ʒ����� PATH �ּҰ� ���� �Է¾��ص� �� 

// �ȵ���̵�� �޺� �ӽ��̶�� ���� ���� �޼ҵ��� ������ ���� �ֽ��ϴ�. 
// �̹� �ȵ���̵带 ������ ���ÿ� �޺� �ӽ��� �۵���. 
// �޺� �ӽ��� �������� ���� �ִٰ� � ���� �����ϴ� ���� callback �޼ҵ带 ȣ���ϵ��� �̺�Ʈ�� ������ ~.
// �ȵ���̵�� �̺�Ʈ�� ��� �����ϴ� ���α׷�.
// �ȵ���̵�� �� ������ �̺�Ʈ�� ���� ��� ó�� ~
// ��ư�� ������ ���� �޺� �ӽ��� �����带 �����ϰ� callback �޼ҵ带 ȣ���ϵ��� �̺�Ʈ�������ְ� ���� �۵���Ŵ





// activity -  
public class MainActivity extends ActionBarActivity {

    @Override // jdk 1.5 ���� ���� , ������̼� , �ڵ忡�� ������ ����
    protected void onCreate(Bundle savedInstanceState) { 
    	// onCreate() : ���ʿ� ���� ����ɶ� ȣ��Ǵ� �ݹ� �޼ҵ� ~
        super.onCreate(savedInstanceState); // super Ŭ������ onCreate() �޼ҵ带 ȣ�� 
        setContentView(R.layout.activity_main); // setContentView() ����� ���̾ƿ��� ����ϴ� �޼ҵ�
        //R Ŭ����:  �ȵ���̵� ���� ���ҽ����� ��ο� �̸����� ����  
        
        // �� �ؿ� �ٺ��� ���� ȭ�鿡 ��µ� �ڿ� �� �ҽ��� ������ 
        
        TextView tv;
        tv= (TextView) findViewById(R.id.textView1); // view �� ĳ���� : ������ ���� 
        	// xml�� ����� �ڿ��� �ҽ��󿡼� ���� 
        
        tv.setText("�� ���� ~~~");// TextView �� ���ڸ� �����ϴ� �޼ҵ�
        tv.setTextSize(20.0f);
        tv.setTextColor(0xff7700ff); // alpha , red, green , blue 
        tv.setTextColor(Color.RED);
       
        String str= tv.getText().toString();
        // System.out.println(str);  // �ȵ���̵� �ܼ�â ��� �Ұ�
        // ��ü�ϱ� ���� ��� : log Ŭ������ �����Ѵ�
        Log.d("test","�ؽ�Ʈ �� ���ڿ� "+str);
    } // and of onCreate
    

 // �ؿ� �ڵ����  ��ư �޴���  
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    } // end of onCreateOptionsMenu
    
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
    } // end of onOptionsItemSelected
} // end class of MainActivity
