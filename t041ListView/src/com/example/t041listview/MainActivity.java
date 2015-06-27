package com.example.t041listview;

import java.util.ArrayList;

import android.R.layout;
import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	ArrayList<Story> al = new ArrayList<Story>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // 1. 다량의 데이터 
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        al.add(new Story("2015.01.01","집가요",R.drawable.line1));
        al.add(new Story("2015.01.02","집안가요",R.drawable.line2));
        al.add(new Story("2015.01.03","퇴근가요",R.drawable.line3));
        
        
        
        // 2. Adapter
        
        MyAdaper adapter = new MyAdaper(getApplicationContext(),R.layout.row,al);
        // 3. AdapterView
        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);
        
    } // end onCreate


   
} // end class MainActivity


class MyAdaper extends BaseAdapter{
	// 멤버변수
	Context context;
	int layout;
	ArrayList<Story> al;
	LayoutInflater inf;

	// 생성자
	public MyAdaper(){}
	public MyAdaper(Context context, int layout, ArrayList<Story> al) {
		

		this.context = context;
		this.layout = layout;
		this.al = al;
		this.inf = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		// inf 에 다가 레이아웃 인플레이트 서비스를 얻어서 저장한다 .
	}
	@Override
	public int getCount() { // 총 데이터의 수
		// TODO Auto-generated method stub
		return al.size();
	}
	@Override
	public Object getItem(int position) { // 해당 행의 데이터
		// TODO Auto-generated method stub
		return al.get(position);
	}
	@Override
	public long getItemId(int position) { // 해당 행 id
		// TODO Auto-generated method stub
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView==null) {convertView = inf.inflate(layout, null);}
		TextView tv1 = (TextView) convertView.findViewById(R.id.textView1);
		TextView tv2 = (TextView) convertView.findViewById(R.id.textView2);
		ImageView iv = (ImageView) convertView.findViewById(R.id.imageView2);
		
		tv1.setText(al.get(position).date);
		tv2.setText(al.get(position).messge);
		iv.setImageResource(al.get(position).img);		
		
		return convertView;
	}
	
	
}


















class Story{
	// 멤버 변수 
	String date = "";
	String messge="";
	int img; // 이미지
	
	// 생성자
	public Story(){}; // 항상 기본 생성자를 항상 작업하자
	public Story(String date, String messge, int img) {
		this.date = date;
		this.messge = messge;
		this.img = img;
		
	}
}// end class Story