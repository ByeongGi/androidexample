package com.example.t056intentprogect;

import java.io.Serializable;
import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
	ArrayList<Movie> al = new ArrayList<Movie>(); // 
//	public static String name  = ""; // ����ȭ������ �Ѿ�� ������ ���� 
//	public static int img;
//	public static String info = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        al.add(new Movie("�����",R.drawable.apple,"���踦 ���ϴ� ��ȭ"));
        al.add(new Movie("�ܿ�ձ�",R.drawable.banana,"�ִϸ��̼� ��ȭ"));
        al.add(new Movie("����",R.drawable.cherry,"������ ��ȭ "));
        al.add(new Movie("��Ŭ����",R.drawable.jadoo_plum,"��Ÿ�� ��ȭ"));
        al.add(new Movie("�����",R.drawable.apple,"���踦 ���ϴ� ��ȭ"));
        al.add(new Movie("�ܿ�ձ�",R.drawable.banana,"�ִϸ��̼� ��ȭ"));
        al.add(new Movie("����",R.drawable.cherry,"������ ��ȭ "));
        al.add(new Movie("��Ŭ����",R.drawable.jadoo_plum,"��Ÿ�� ��ȭ"));
        al.add(new Movie("�����",R.drawable.apple,"���踦 ���ϴ� ��ȭ"));
        al.add(new Movie("�ܿ�ձ�",R.drawable.banana,"�ִϸ��̼� ��ȭ"));
        al.add(new Movie("����",R.drawable.cherry,"������ ��ȭ "));
        al.add(new Movie("��Ŭ����",R.drawable.jadoo_plum,"��Ÿ�� ��ȭ"));
        al.add(new Movie("�����",R.drawable.apple,"���踦 ���ϴ� ��ȭ"));
        al.add(new Movie("�ܿ�ձ�",R.drawable.banana,"�ִϸ��̼� ��ȭ"));
        al.add(new Movie("����",R.drawable.cherry,"������ ��ȭ "));
        al.add(new Movie("��Ŭ����",R.drawable.jadoo_plum,"��Ÿ�� ��ȭ"));
        al.add(new Movie("�����",R.drawable.apple,"���踦 ���ϴ� ��ȭ"));
        al.add(new Movie("�ܿ�ձ�",R.drawable.banana,"�ִϸ��̼� ��ȭ"));
        al.add(new Movie("����",R.drawable.cherry,"������ ��ȭ "));
        al.add(new Movie("��Ŭ����",R.drawable.jadoo_plum,"��Ÿ�� ��ȭ"));
        al.add(new Movie("�����",R.drawable.apple,"���踦 ���ϴ� ��ȭ"));
        al.add(new Movie("�ܿ�ձ�",R.drawable.banana,"�ִϸ��̼� ��ȭ"));
        al.add(new Movie("����",R.drawable.cherry,"������ ��ȭ "));
        al.add(new Movie("��Ŭ����",R.drawable.jadoo_plum,"��Ÿ�� ��ȭ"));
        al.add(new Movie("�����",R.drawable.apple,"���踦 ���ϴ� ��ȭ"));
        al.add(new Movie("�ܿ�ձ�",R.drawable.banana,"�ִϸ��̼� ��ȭ"));
        al.add(new Movie("����",R.drawable.cherry,"������ ��ȭ "));
        al.add(new Movie("��Ŭ����",R.drawable.jadoo_plum,"��Ÿ�� ��ȭ"));
        
        MyAdapter adapter = new MyAdapter(getApplicationContext(),R.layout.row,al);
        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// �� ���� ȭ������ �̵��ϱ� (���ٵ� ������)
				Intent intent = new Intent(getApplicationContext(),Next01.class); // ������� �� ����Ʈ�� �����ش� .
//				name=al.get(position).name;
//				img =al.get(position).img;
//				info=al.get(position).info;
				
				intent.putExtra("name",al.get(position).name );
				intent.putExtra("img",al.get(position).img );
				intent.putExtra("info",al.get(position).info );
				
				startActivity(intent);
				
				
			}
        	
		});
        
    } // end of onCreate()


    
} // end class 


class MyAdapter extends BaseAdapter{
	Context context;
	int layout;
	LayoutInflater inf;
	ArrayList<Movie> al = new ArrayList<Movie>();
	
	
	
	public MyAdapter(Context context, int layout,ArrayList<Movie> al) {
		super();
		this.context = context;
		this.layout = layout;
		this.al = al;
		this.inf = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return al.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return al.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView==null) convertView = inf.inflate(R.layout.row, null);
		
		ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
		TextView tv1= (TextView) convertView.findViewById(R.id.textView1);
		TextView tv2= (TextView) convertView.findViewById(R.id.textView2);
		
		Movie m =al.get(position);
		iv.setImageResource(m.img);
		tv1.setText(m.name);
		tv2.setText(m.info);
		
		
		return convertView;
	}
	
	
	
	
}













class Movie implements Serializable{ // �ڹٺ� 
	// �ʵ� 
	String name = "";
	int img; // ��ȭ �̹���
	String info = ""; // ��ȭ �� ���� 
	// ������ 
	public Movie(){}
	public Movie(String name, int img, String info) {
		super();
		this.name = name;
		this.img = img;
		this.info = info;
	}
	
} // end Movie
