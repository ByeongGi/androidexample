package com.example.t063sharedpreference;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	EditText et;
	String fileName= "myfile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText) findViewById(R.id.editText1);
        
        // ������ �Է��ߴ� ����� �Է°��� ������ �����ֱ�
        SharedPreferences sf= getSharedPreferences(fileName, 0);
        String str=sf.getString("name", "");
        et.setText(str);
    }
    
   
    @Override
    protected void onStop() {
    	super.onStop();
    	// Activity ����Ǳ� ���� �����Ѵ�.
    	// SharedPreferences �� ������(Ư���� ����ؾ��� ����� ��)�� �����ϱ�
    	SharedPreferences sf = getSharedPreferences(fileName, 0);
    	SharedPreferences.Editor editor = sf.edit(); // �����Ϸ��� editor�� �ʿ�
    	String str =et.getText().toString(); // ����ڰ� �Է��� �� 
    	editor.putString("name", str); // �Է�
    	editor.commit();// ���� ����
    	
    }
   
}
