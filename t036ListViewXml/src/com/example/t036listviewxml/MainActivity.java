package com.example.t036listviewxml;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        // xml���� ������ �о ListView �� ���� 
        // 1. �ٷ��� ������(xml)
        // 2. AdapterView 
        // 3. Adapeter(ListView)
        
        
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getApplicationContext(),
        		R.array.data, // xml�� �ۼ��� array �׸��� ���� 
        		android.R.layout.simple_list_item_1); //row layout ����
        
        
        ListView lv= (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);
        
        
        
        
    } 


    
} // end of Class 
