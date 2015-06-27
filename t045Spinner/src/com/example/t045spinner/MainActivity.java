package com.example.t045spinner;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        // 1. 다량의 데이터 
        final String city[] = {"서울특별시","인천광역시","부산광역시","대전광역시","대구광역시","광주광역시","울산광역시"};
        final String gu[] ={"중구 ","남구 ", "북구" ,"동구","서구"};
        // 2. Adapter 
        // 3. AdaterView : Spinner
        
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.myspinner,city);
        
        adapter.setDropDownViewResource(R.layout.mydropdown);
        
        
        
        final Spinner s1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner  s2 = (Spinner) findViewById(R.id.spinner2);
        s1.setAdapter(adapter);
        
        final TextView tv = (TextView) findViewById(R.id.textView3);
        s1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				str = city[position];
				tv.setText("주소 : "+city[position]+s2.getSelectedItem().toString());
				
//				Log.d("test",s1.getSelectedItem().toString());
//				Log.d("test",s1.getSelectedItemId()+"");
//				Log.d("test",s1.getSelectedItemPosition()+"");
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
				
			}
		});
       
        
        ArrayAdapter adapter2 = new ArrayAdapter(getApplicationContext(),R.layout.myspinner,gu);
        adapter2.setDropDownViewResource(R.layout.mydropdown);
       
        s2.setAdapter(adapter2);
        s2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				tv.setText("주소 : "+s1.getSelectedItem().toString()+" "+gu[position]);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        
        
        
    } // end onCreate 


} // end of class 


