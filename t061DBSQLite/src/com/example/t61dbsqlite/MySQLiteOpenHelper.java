package com.example.t61dbsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteOpenHelper extends SQLiteOpenHelper implements Query{
	
	// �ȵ���̵忡�� DB �� SQLite ������ ���̽��� ���� ����Ҽ� �ֵ��� �����ִ� Ŭ���� 
	
	
	// ������ 
	public MySQLiteOpenHelper(Context context, String name,CursorFactory factory, int version) {
		super(context, name, factory, version);
		
	}
	
	
	// �޼ҵ�(�������̵�) 
	@Override
	public void onCreate(SQLiteDatabase db) {
		// ������ �������̽��� ���� ��� ������ ���̽��� ���� ���, ������ ���̽� ������ ���� ȣ���.
		// ������ ���̽��� ���̺��� �����ϴ� �ڵ带 �ۼ� 
		db.execSQL(CRIARE_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// ���� �����ͺ��̽� ������ �ٲ���� ȣ���ϴ� �ݹ� �޼ҵ� 
		// ������ ����Ǿ��� �� ���� ������ ���̽��� ��� �����Ұ� �����ϴ� ���̴� . 
		// �� ������ ���� ������� �������� �ۼ��ؾ��� 
		db.execSQL(DROP_TABLE);
		onCreate(db);
	}

}
