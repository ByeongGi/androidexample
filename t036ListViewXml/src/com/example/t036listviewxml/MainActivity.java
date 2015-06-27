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
        
        
        // xml에서 데이터 읽어서 ListView 에 띄우기 
        // 1. 다량의 데이터(xml)
        // 2. AdapterView 
        // 3. Adapeter(ListView)
        
        
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getApplicationContext(),
        		R.array.data, // xml에 작성한 array 항목을 지정 
        		android.R.layout.simple_list_item_1); //row layout 지정
        
        
        ListView lv= (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);
        
        
        
        
    } 


    
} // end of Class 
