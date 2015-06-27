package com.example.t62dbsqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	private String dbName="st_file.db";
	private int dbVersion= 1;
	private MySQLiteOpenHelper helper;
	private SQLiteDatabase db;
	private String tag = "SQLite";
	private String tableName = "student";
	
	EditText etName;
	EditText etage;
	EditText etadress;
	Button bInsert; // 삽입버튼
	Button bUpdate;
	Button bDelete; 
	Button bSelect; 
	TextView tv; // 결과창
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etName = (EditText) findViewById(R.id.editText1);
        etage = (EditText) findViewById(R.id.editText2);
        etadress = (EditText) findViewById(R.id.editText3);
        bInsert = (Button) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.textView4);
        bUpdate =(Button) findViewById(R.id.button2);
        bDelete = (Button) findViewById(R.id.button3);
    	bSelect =(Button) findViewById(R.id.button4);
        
        HelperStart(); // db 연동시작 
        
        bInsert.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ischeckNullInsert(); // 입력된 데이터 값 null 인지 판단. 
				select();
			}
		});
        
        bUpdate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String name = etName.getText().toString();
				String age = etage.getText().toString();
				String address = etadress.getText().toString();
				if ("".equals(name)||"".equals(age)||"".equals(address))
				{
					tv.setText("insert 실패 : 입력하세요");
					return;
				} 
				
				int a=0;
				
				try {
					a=Integer.parseInt(age);
					update(name,a,address);
					select();
				} catch (NumberFormatException e) {
					tv.setText("insert 실패 - age는 숫자로 입력하세요");
					return;
				}
		    	
		    	
				
				
			}
		});
        
        bDelete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			String name = etName.getText().toString();
			if ("".equals(name))
			{tv.setText("insert 실패 : 입력하세요");
				return;}
			
			delete(name);
			select();
			}
		});
        
       bSelect.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			select();
			
		}
	});
        

    } // end onCreate()
    
    
    
    // ////////////////////////////////////////////////////////
    //	Method 구현부 
    // ////////////////////////////////////////////////////////
    
    
    void ischeckNullInsert(){
		String name = etName.getText().toString();
		String age = etage.getText().toString();
		String address = etadress.getText().toString();
		if ("".equals(name)||"".equals(age)||"".equals(address))
		{
			tv.setText("insert 실패 : 입력하세요");
			return;
		} 
		
		int a=0;
		
		try {
			a=Integer.parseInt(age);
			insert(name,a,address);
		} catch (NumberFormatException e) {
			tv.setText("insert 실패 - age는 숫자로 입력하세요");
			return;
		}
    	
    	
    	
    } // end ischeckNullInsert()
    
    void HelperStart(){
    	
    	 try {
			 helper=new MySQLiteOpenHelper(getApplicationContext(),dbName, null, dbVersion);
			 db= helper.getWritableDatabase();
		} catch (SQLiteException e) {
			e.printStackTrace();
			Log.e("SQLite","데이터베이스를 열리지 않습니다.");
			finish();
		}
       
    	
    	
    } // end HelperStart()
    
    void delete(String name){
    	int result =db.delete(tableName, "name=?", new String[]{name});
        Log.d(tag, result+"개 delete 성공 ");
        tv.setText(result+"개 delete 성공 ");
    	
    } 
    
    void update(String name, int age, String address){
    	 ContentValues values = new ContentValues();
         
    	 values.put("address", address); // 변경값
         values.put("age", age); 
         
          int result=db.update(tableName, 
          		values, // 변경할 값
          		"name=?", // 변경할 항목을 찾을 조건
          		new String[]{name}); // 변경할 항목으로 찾을 값
          Log.d(tag,result+"번째 row update 성공");
          tv.setText(result+"번째 row update 성공");
    	
    	
    	
    	
    	
    }
    
    
    void insert(String name, int age, String address){
        ContentValues values = new ContentValues();
        						// 키 , 값의 쌍으로 데이터 입력 
        values.put("name", name);
        values.put("age", age);
        values.put("address", address);
       
        long result =db.insert(tableName, null, values); // 테이블명, 표준 컬럼 , 값
        Log.d(tag,result+"번째 insert 성공했음");
        tv.setText(result+"번째 insert 성공했음");
    }// end insert()
    
    
    void select(){
    	 
    	 Cursor c = db.query(tableName, null, null, null, null, null, null);
         while(c.moveToNext()){
         	int id=c.getInt(0);
         	String name = c.getString(1);
         	int age = c.getInt(2);
         	String address = c.getString(3);
         	tv.append("_id : "+id+", name : "+name+",age : "+age+", address : "+address);
         	Log.d(tag,"_id : "+id+", name : "+name+",age : "+age+", address : "+address);
         }
         
         
        // 키보드 내리기  
    	InputMethodManager imm=
    			(InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
    	imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),0);
    }

   

   
} // end class MainActivity
