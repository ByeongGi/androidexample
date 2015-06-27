package com.example.t040listview;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	ArrayList<Board> al = new ArrayList<Board>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1. 대량의 데이터 
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        al.add(new Board("05-11","즐거운 날입니다.",R.drawable.line));
        al.add(new Board("05-12","힘찬 하루 입니다",R.drawable.line2));
        al.add(new Board("05-13","활기찬 하루 입니다",R.drawable.line3));
        
        
        // 2. Adapter 를 생성 
        ListView lv = (ListView) findViewById(R.id.listView1); 
        
        MyAdapter adapter =new MyAdapter(getApplicationContext(),R.layout.row,al);
        
        // 3. 아답터 연결 
        lv.setAdapter(adapter);
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Vibrator vi=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				vi.vibrate(1000);
				
			}
		});
        
    } // end onCreate 
    
    
    
   
} // end class MainActivity

class MyAdapter extends BaseAdapter{
	
	Context context;
	int layout;
	ArrayList<Board> al = new ArrayList<Board>();
	LayoutInflater lnf;
	
	
	public MyAdapter(Context context, int layout, ArrayList<Board> al) {
		this.context=context;
		this.layout=layout;
		this.al=al;
		this.lnf= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); // 레이아웃을 xml 파싱해주는 객체를 저장해준다.
	}

	@Override
	public int getCount() { // 레이아웃으로 나타낼 자료의 수 
		// TODO Auto-generated method stub
		return al.size();
	}

	@Override 
	public Object getItem(int position) { // 레이아웃에 나타낼 자료의 자료형의 data set
		// TODO Auto-generated method stub
		return al.get(position);
	}

	@Override
	public long getItemId(int position) { // 고유한 행의 id
		// TODO Auto-generated method stub
		return position;
	}

	@Override // 자료와 레이아웃을 이어주는 곳 
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		if(convertView==null) convertView = lnf.inflate(layout, null); // xml 파싱된 레이아웃을 넣어준다.
		
		TextView tv1 = (TextView) convertView.findViewById(R.id.tvtitle);
		TextView tv2 = (TextView) convertView.findViewById(R.id.tvcontent);
		ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
		
		tv1.setText(al.get(position).getTitle());
		tv2.setText(al.get(position).getContext());
		iv.setImageResource(al.get(position).getImg());
		
		return convertView;
	}
	
	
	
	
	
}





























class Board{
	// 멤버변수 
	String title="";
	String context="";
	int img;
	
	
	// 생성자 
	public Board() {
		
	}
	
	
	public Board(String title, String context, int img) {
		
		this.title = title;
		this.context = context;
		this.img = img;
	}
	
	// getter
	public String getTitle() {
		return title;
	}
	public String getContext() {
		return context;
	}
	public int getImg() {
		return img;
	}

} // end Class Board
