package com.example.t61dbsqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class MainActivity extends ActionBarActivity implements Query{
	private MySQLiteOpenHelper Helper;
	private String dbName = "st_file.db"; // db 이름 
	int dbVersion = 2; // 현재 데이터의 버전
	private SQLiteDatabase db;
	private String tag = "SQLite"; // Log 에 사용할 tag
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // SQLite3 : 모바일용으로 제작된 경량화 DB , C 언어로 제작되어 가벼움 
        // 안드로이드에서 Sqlite3를 쉽게 사용할수 있도록 SQLiteOpenHelper 클래스 제공 
        
        Helper = new MySQLiteOpenHelper(getApplicationContext(), // 현재 화면의 제어권자 
        		dbName, // db 이름 
        		null, // 커서팩토리-null : 표준커서가 사용됨
        		dbVersion); // 버전
        // db=Helper.getReadableDatabase(); // 읽기 전용 DB select문 
        
        try {
        	
        	 db=Helper.getWritableDatabase(); // 읽고 쓸수 있는 DB 
		} catch (SQLiteException  e) {
			e.printStackTrace();
			Log.e(tag, "데이터베이스를  얻어올수없음 ");
			finish(); // 액티비티 종료 
		}
       // 삽입 
       insert();
       Log.d(tag,"insert 성공 ~!");
       // 조회
       select();
       // 업데이트 
       update();
       // 삭제
       delete();
       
       select();
       
      
        
        
    } //end onCreate()
    
    void select(){
    	Cursor c =db.rawQuery(SELECT, null);
    	while (c.moveToNext()) {
    		int id=c.getInt(0);
    		String name = c.getString(1);
    		 Log.d(tag,"id : "+id+", name : "+name);
		}
    	
    }
    
    void insert(){
    	
    	 db.execSQL("insert into mytable (name) values('seo');");
         db.execSQL("insert into mytable (name) values('choi');");
         db.execSQL("insert into mytable (name) values('park');");
         db.execSQL("insert into mytable (name) values('kim');");
    }

    
    void update(){
    	
    	 db.execSQL("update mytable set name='updateTest' where id=1;");
         Log.d(tag,"업데이트 성공 ~!");
    	
    	
    	
    }
    
    void delete(){
    	 db.execSQL("delete from mytable where id = 2");
         Log.d(tag,"삭제 성공 ~!");
    }
    
} // end class MainActivity
