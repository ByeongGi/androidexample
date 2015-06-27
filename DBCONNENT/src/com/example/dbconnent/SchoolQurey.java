package com.example.dbconnent;

public interface SchoolQurey {
	// student
	public static final String TBL_NAME="student";
	public static final String  COL_LEBEL_ID="id";
	public static final String COL_LEBEL_NAME="name";
	public static final String COL_LEBEL_PHONE="phone";
	public static final String COL_LEBEL_EMAIL="email";
	public static final String COL_LEBEL_GRADE="grade";
	// prepareStatement 
	public static final String SELECT= "SELECT * FROM "+TBL_NAME;
	public static final String SQL_INSERT= "INSERT INTO "+TBL_NAME+" Values (?,?,?,?,?) "; 
	public static final String SQL_UPDATE= "UPDATE "+TBL_NAME+" SET "+COL_LEBEL_ID+" = ? ," 
	+COL_LEBEL_NAME+" = ? ," 
	+COL_LEBEL_PHONE+" = ? ,"
	+COL_LEBEL_EMAIL+" = ? ,"
	+COL_LEBEL_GRADE+" = ?"
			+" WHERE "+COL_LEBEL_ID+" = ?";
	public static final String SQL_DELETE="DELETE FROM "+TBL_NAME+" WHERE "+"id = ?";	
	
	
	// suject
	public static final String TBL_NAME2= "subject";
	public static final String SCORE_KOR="kor";
	public static final String SCORE_ENG="eng";
	public static final String SCORE_MATH="math";
	
	
	public static final String SELECT2= "SELECT * FROM "+TBL_NAME2;
	public static final String SQL_INSERT2= "INSERT INTO "+TBL_NAME2+" Values (?,?,?,?) "; 
	public static final String SQL_UPDATE2= "UPDATE "+TBL_NAME2+" SET "+COL_LEBEL_ID+" = ? ," +SCORE_KOR+" = ? ," +SCORE_ENG+" = ? ,"+SCORE_MATH+" = ?"
			+" WHERE "+COL_LEBEL_ID+" = ?";
	public static final String SQL_DELETE2="DELETE FROM "+TBL_NAME2+" WHERE "+"id = ?";	
	
	// JOIN 
	public static final String SELECT_JOIN="SELECT i.id, i.name, i.phone, i.email, i.grade ,s.kor,s.eng,s.math FROM student i Left OUTER JOiN subject s ON i.id = s.id";

	
	
	
	
} // end SchoolQurey
