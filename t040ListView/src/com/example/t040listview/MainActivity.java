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
        //1. �뷮�� ������ 
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        al.add(new Board("05-11","��ſ� ���Դϴ�.",R.drawable.line));
        al.add(new Board("05-12","���� �Ϸ� �Դϴ�",R.drawable.line2));
        al.add(new Board("05-13","Ȱ���� �Ϸ� �Դϴ�",R.drawable.line3));
        
        
        // 2. Adapter �� ���� 
        ListView lv = (ListView) findViewById(R.id.listView1); 
        
        MyAdapter adapter =new MyAdapter(getApplicationContext(),R.layout.row,al);
        
        // 3. �ƴ��� ���� 
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
		this.lnf= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); // ���̾ƿ��� xml �Ľ����ִ� ��ü�� �������ش�.
	}

	@Override
	public int getCount() { // ���̾ƿ����� ��Ÿ�� �ڷ��� �� 
		// TODO Auto-generated method stub
		return al.size();
	}

	@Override 
	public Object getItem(int position) { // ���̾ƿ��� ��Ÿ�� �ڷ��� �ڷ����� data set
		// TODO Auto-generated method stub
		return al.get(position);
	}

	@Override
	public long getItemId(int position) { // ������ ���� id
		// TODO Auto-generated method stub
		return position;
	}

	@Override // �ڷ�� ���̾ƿ��� �̾��ִ� �� 
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		if(convertView==null) convertView = lnf.inflate(layout, null); // xml �Ľ̵� ���̾ƿ��� �־��ش�.
		
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
	// ������� 
	String title="";
	String context="";
	int img;
	
	
	// ������ 
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
