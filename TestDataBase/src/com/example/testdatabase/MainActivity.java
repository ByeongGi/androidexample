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
		db= helper.getReadableDatabase();// �б� 
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

	public MySQLiteOpenHelper(Context context, // ȭ���� �������
			String name,// �����ͺ��̽��� �̸� 
			CursorFactory factory, // Ŀ�� ���丮 (���� null) ���� ���� 
			int version// �����ͺ��̽� ��Ű�� ������ �Ʒ��ִ� ���ڰ��� �Ѱ��ش� 
			) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) { // SQLiteDatabase�� �Ű������� �ް�, ���̺� �����ϰ� 
		// TODO Auto-generated method stub    // �ʱ� �����͸� �߰��ϱ� ������ ��ġ�̴�.
		String sql = Qurey.CREATE_TABEL;
		
		db.execSQL(sql);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, // SQLiteDatabase �ν��Ͻ��� �Ѱ� �ް� , ���� ��Ű������
			int oldVersion,						// �ֽ� ��Ű�� ������ �޴´� .
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