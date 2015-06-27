package com.example.dbconnent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements DBQurey,SchoolQurey{
	ArrayList<model> list;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.textView1);
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				connectdb();
				
				try {
					list=select();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("에러 ");
				}
				
				
				String id=list.get(0).getId();
				Log.d("test", "DB 연동 테스트 "+id);
				
				
				
			}
		}).start();
		
		
		
		
		 
		
	}
	
	

//	public static String connectionJDBCTest() {
//        StringBuffer sb = new StringBuffer();
//        Connection con = null;
//        try {
//            Class.forName("org.mariadb.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        // 만약 위와 같이 Driver를 설정하지 않는다면, Driver를 찾을수 없다는 Error 메세지가 발생될 것 입니다.
//        try {
//
//            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","scott","tiger");
//            // 접속하고자 하는 Maria DB Server가 설치된 IP 주소 및 설정되어 있는 ID와 PassWord를 설정.
//            Statement st = null;
//            ResultSet rs = null;
//
//            st = con.createStatement();
//
//            if(st.execute("SHOW DATABASES")) {
//                rs = st.getResultSet();
//            }
//
//            while(rs.next()) {
//                String str = rs.getString(1);
//                sb.append(str);
//                sb.append("\n");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if(null != con) {
//                try {
//                    con.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return sb.toString();
//    } 
//	
	private Connection conn;
	public void connectdb() {
		try {
			Class.forName(DRIVER);
			System.out.println("1. MariaDB 드라이버 로딩 성공");
			conn = DriverManager.getConnection(URL,USER,PASSWD);
			System.out.println("2. Driver DB 연동 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public ArrayList<model> select() {
		PreparedStatement psmt = null;
		ResultSet rsult = null;
		ArrayList<model> list = new ArrayList<model>();
		try {
			psmt = conn.prepareStatement(SELECT);
			rsult = psmt.executeQuery();
			System.out.println("DB 질의 성공 ");
			
			

			while (rsult.next()) {
				String id = rsult.getString(COL_LEBEL_ID);
				String name = rsult.getString(COL_LEBEL_NAME);
				String phone = rsult.getString(COL_LEBEL_PHONE);
				String email = rsult.getString(COL_LEBEL_EMAIL);
				String grade = rsult.getString(COL_LEBEL_GRADE);
				list.add(new model(id, name, phone, email, grade));
			} // end While()

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	} // end select()
	
	
	
	public void insert(String id,String name,String phone,String email,String grade) throws SQLException {
		System.out.println("DB insert 시작");
		PreparedStatement psmt =null;
		
			psmt = conn.prepareStatement(SQL_INSERT);
			
			psmt.setInt(1, Integer.parseInt(id));
			psmt.setString(2, name);
			psmt.setString(3, phone);
			psmt.setString(4, email);
			psmt.setInt(5, Integer.parseInt(grade));
			psmt.executeUpdate();
			
			System.out.println("DB insert 성공");
		
		
		
		
		
		
	} // end insert()
	
	
	public void update(String id,String name,String phone,String email,String grade) throws SQLException{
		System.out.println("DB update 시작");	
		PreparedStatement psmt =null;
		psmt = conn.prepareStatement(SQL_UPDATE);
		psmt.setInt(1, Integer.parseInt(id));
		psmt.setString(2, name);
		psmt.setString(3, phone);
		psmt.setString(4, email);
		psmt.setInt(5, Integer.parseInt(grade));
		psmt.setInt(6, Integer.parseInt(id));
		psmt.executeUpdate();
		System.out.println("DB update 성공");	
	} // end update()
	
	public void delete(String id) throws SQLException{
		System.out.println("DB delete 시작");	
		
		PreparedStatement psmt =null;
		psmt = conn.prepareStatement(SQL_DELETE);
		psmt.setInt(1, Integer.parseInt(id));
		psmt.executeUpdate();
		
		System.out.println("DB delete 성공");
	} // end delete()

	
	
	
	
	public void insert2(int id,double kor,double eng,double math) throws SQLException {
		System.out.println("DB insert 시작");
		PreparedStatement psmt =null;
		
			psmt = conn.prepareStatement(SQL_INSERT2);
			
			psmt.setInt(1, id);
			psmt.setDouble(2, kor);
			psmt.setDouble(3, eng);
			psmt.setDouble(4, math);
			psmt.executeUpdate();
			System.out.println("DB insert 성공");
		
	} // end insert()
	
	
	
	
	public void update2(int id,double kor,double eng,double math) throws SQLException{
		System.out.println("DB update 시작");	
		PreparedStatement psmt =null;
		psmt = conn.prepareStatement(SQL_UPDATE2);
		psmt.setInt(1, id);
		psmt.setDouble(2, kor);
		psmt.setDouble(3, eng);
		psmt.setDouble(4, math);
		psmt.setInt(5, id);
		psmt.executeUpdate();
		System.out.println("DB update 성공");	
	} // end update2()
	
	
	public void delete2(int id) throws SQLException{
		System.out.println("DB delete 시작");	
		
		PreparedStatement psmt =null;
		psmt = conn.prepareStatement(SQL_DELETE2);
		psmt.setInt(1, id);
		psmt.executeUpdate();
		
		System.out.println("DB delete 성공");
	} // end delete()
	
	
	
	
	
	
	
	public ArrayList<model> select2() {
		PreparedStatement psmt = null;
		ResultSet rsult = null;
		ArrayList<model> list = new ArrayList<model>();
		try {
			psmt = conn.prepareStatement(SELECT2);
			rsult = psmt.executeQuery();
			System.out.println("DB 질의 성공 ");
			
			

			while (rsult.next()) {
				int id = rsult.getInt(COL_LEBEL_ID);
				double kor = rsult.getDouble(SCORE_KOR);
				double eng = rsult.getDouble(SCORE_ENG);
				double math = rsult.getDouble(SCORE_MATH);
				list.add(new model(id,kor,eng,math));
			} // end While()

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	} // end select()
	
	
	public ArrayList<model> select_Info() {
		PreparedStatement psmt = null;
		ResultSet rsult = null;
		ArrayList<model> list = new ArrayList<model>();
		try {
			psmt = conn.prepareStatement(SELECT_JOIN);
			rsult = psmt.executeQuery();
			System.out.println("DB 질의 성공 rsult");
			
			

			while (rsult.next()) {
				
				String id = rsult.getString(COL_LEBEL_ID);
				String name = rsult.getString(COL_LEBEL_NAME);
				String phone = rsult.getString(COL_LEBEL_PHONE);
				String email = rsult.getString(COL_LEBEL_EMAIL);
				String grade = rsult.getString(COL_LEBEL_GRADE);
				
				list.add(new model(id, name, phone, email, grade));
			} // end While()

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return list;

	} // end select()
	
	
	
	
} // end class 





