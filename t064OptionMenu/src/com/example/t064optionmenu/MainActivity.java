package com.example.t064optionmenu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	boolean loginflag = false; // �α׾ƿ� ���� 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	// �޴���ư�� �������� ����Ǵ� �ݹ� �޼ҵ�
    	// �޴���ư�� �������� ������ �޴��� ���ؼ� ���� 
        getMenuInflater().inflate(R.menu.main, menu);
        Log.d("test", "�޴� �ݹ� "); 
        return true;
       
    }
    
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
    	Log.d("test", "onPrepareOptionsMenu "); // �ɼ� �޴� �׸��� �����ٶ� ���� ȣ���� �ȴ� .
    	
    	if (loginflag) { // �α��� �� ���� 
			menu.getItem(1).setEnabled(false);
			menu.getItem(2).setEnabled(true);
			menu.getItem(3).setEnabled(true);
		}else { // �α׾ƿ��� ���� : �α��� ���̰� �α׾ƿ� �Ⱥ��̰� 
			menu.getItem(1).setEnabled(true);
			menu.getItem(2).setEnabled(false);
			menu.getItem(3).setEnabled(false);
		}
    	
    	return super.onPrepareOptionsMenu(menu);
    }
    
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	// �޴��� �׸��� ���������� ȣ��Ǵ� �ݹ� �޼ҵ� 
        int id = item.getItemId();
        
        
    	
    	
    	switch (id) {
		case R.id.action_settings:
			Log.d("test", "��ư �ݹ� �޼ҵ� "+id);
	    	Toast.makeText(getApplicationContext(),"���� �޴� ", Toast.LENGTH_LONG);
	    	return true;
			
		case R.id.menu_login:
			Log.d("test", "��ư �ݹ� �޼ҵ� "+id);
	    	Toast.makeText(getApplicationContext(),"�α� �޴� ", Toast.LENGTH_LONG);
			return true;
		case R.id.menu_logout:
			Log.d("test", "��ư �ݹ� �޼ҵ� "+id);
	    	Toast.makeText(getApplicationContext(),"�α׾ƿ� ", Toast.LENGTH_LONG);
			return true;
		case R.id.menu_relogin:
			Log.d("test", "��ư �ݹ� �޼ҵ� "+id);
	    	Toast.makeText(getApplicationContext(),"������ ", Toast.LENGTH_LONG);
			return true;
		}
 

        return super.onOptionsItemSelected(item);
    }
}
