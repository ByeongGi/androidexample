package com.example.testdatabase;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class MainActivity extends ActionBarActivity implements Qurey {
	SQLiteDatabase db;
	MySQLiteOpenHelper helper;
	ArrayList<Mylist> resultlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new MySQLiteOpenHelper(getApplicationContext(), "type.db", null, 1);
        select();
        
        
        
        
    }
	private void select() {
		db= helper.getReadableDatabase();// 읽기 
		Cursor c= db.query("type", null, null, null, null, null, null);
		
		while (c.moveToNext()) {
			int type = c.getInt(c.getColumnIndex("type"));
			String result = c.getString(c.getColumnIndex("result"));
			Log.i("db", "type"+type+"result"+result);
			
			resultlist.add(new Mylist(type,result));
		};
		
	}
	


    
}


class MySQLiteOpenHelper extends SQLiteOpenHelper{

	public MySQLiteOpenHelper(Context context, // 화면의 제어권자
			String name,// 데이터베이스의 이름 
			CursorFactory factory, // 커서 팩토리 (보통 null) 등을 지정 
			int version// 데이터베이스 스키마 버전을 아렬주는 숫자값을 넘겨준다 
			) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) { // SQLiteDatabase를 매개변수로 받고, 테이블 생성하고 
		// TODO Auto-generated method stub    // 초기 데이터를 추가하기 적당한 위치이다.
		String sql = Qurey.CREATE_TABEL;
		
		db.execSQL(sql);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, // SQLiteDatabase 인스턴스를 넘겨 받고 , 현재 스키마버전
			int oldVersion,						// 최신 스키마 버전을 받는다 .
			int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}




class Mylist{
	int type;
	String result;
	public Mylist() {}
	public Mylist(int type, String result) {
		this.type = type;
		this.result = result;
	}
	
	
	
}