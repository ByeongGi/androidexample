package com.example.t61dbsqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class MainActivity extends ActionBarActivity implements Query{
	private MySQLiteOpenHelper Helper;
	private String dbName = "st_file.db"; // db �̸� 
	int dbVersion = 2; // ���� �������� ����
	private SQLiteDatabase db;
	private String tag = "SQLite"; // Log �� ����� tag
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // SQLite3 : ����Ͽ����� ���۵� �淮ȭ DB , C ���� ���۵Ǿ� ������ 
        // �ȵ���̵忡�� Sqlite3�� ���� ����Ҽ� �ֵ��� SQLiteOpenHelper Ŭ���� ���� 
        
        Helper = new MySQLiteOpenHelper(getApplicationContext(), // ���� ȭ���� ������� 
        		dbName, // db �̸� 
        		null, // Ŀ�����丮-null : ǥ��Ŀ���� ����
        		dbVersion); // ����
        // db=Helper.getReadableDatabase(); // �б� ���� DB select�� 
        
        try {
        	
        	 db=Helper.getWritableDatabase(); // �а� ���� �ִ� DB 
		} catch (SQLiteException  e) {
			e.printStackTrace();
			Log.e(tag, "�����ͺ��̽���  ���ü����� ");
			finish(); // ��Ƽ��Ƽ ���� 
		}
       // ���� 
       insert();
       Log.d(tag,"insert ���� ~!");
       // ��ȸ
       select();
       // ������Ʈ 
       update();
       // ����
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
         Log.d(tag,"������Ʈ ���� ~!");
    	
    	
    	
    }
    
    void delete(){
    	 db.execSQL("delete from mytable where id = 2");
         Log.d(tag,"���� ���� ~!");
    }
    
} // end class MainActivity
