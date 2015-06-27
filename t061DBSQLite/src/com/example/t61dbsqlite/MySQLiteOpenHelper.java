package com.example.t61dbsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteOpenHelper extends SQLiteOpenHelper implements Query{
	
	// 안드로이드에서 DB 를 SQLite 데이터 베이스를 쉽게 사용할수 있도록 도와주는 클래스 
	
	
	// 생성자 
	public MySQLiteOpenHelper(Context context, String name,CursorFactory factory, int version) {
		super(context, name, factory, version);
		
	}
	
	
	// 메소드(오버라이딩) 
	@Override
	public void onCreate(SQLiteDatabase db) {
		// 최초의 데이터이스가 없을 경우 데이터 베이스를 만들 경우, 데이터 베이스 생성을 위해 호출됨.
		// 데이터 베이스의 테이블을 생성하는 코드를 작성 
		db.execSQL(CRIARE_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// 기존 데이터베이스 버전이 바뀌었을 호출하는 콜백 메소드 
		// 버전이 변경되었을 때 기존 데이터 베이스를 어떻게 변경할것 구현하는 곳이다 . 
		// 각 버전의 변경 내용들을 버전마다 작성해야함 
		db.execSQL(DROP_TABLE);
		onCreate(db);
	}

}
