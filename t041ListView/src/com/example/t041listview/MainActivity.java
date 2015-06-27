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
     // 1. �ٷ��� ������ 
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        al.add(new Story("2015.01.01","������",R.drawable.line1));
        al.add(new Story("2015.01.02","���Ȱ���",R.drawable.line2));
        al.add(new Story("2015.01.03","��ٰ���",R.drawable.line3));
        
        
        
        // 2. Adapter
        
        MyAdaper adapter = new MyAdaper(getApplicationContext(),R.layout.row,al);
        // 3. AdapterView
        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);
        
    } // end onCreate


   
} // end class MainActivity


class MyAdaper extends BaseAdapter{
	// �������
	Context context;
	int layout;
	ArrayList<Story> al;
	LayoutInflater inf;

	// ������
	public MyAdaper(){}
	public MyAdaper(Context context, int layout, ArrayList<Story> al) {
		

		this.context = context;
		this.layout = layout;
		this.al = al;
		this.inf = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		// inf �� �ٰ� ���̾ƿ� ���÷���Ʈ ���񽺸� �� �����Ѵ� .
	}
	@Override
	public int getCount() { // �� �������� ��
		// TODO Auto-generated method stub
		return al.size();
	}
	@Override
	public Object getItem(int position) { // �ش� ���� ������
		// TODO Auto-generated method stub
		return al.get(position);
	}
	@Override
	public long getItemId(int position) { // �ش� �� id
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
	// ��� ���� 
	String date = "";
	String messge="";
	int img; // �̹���
	
	// ������
	public Story(){}; // �׻� �⺻ �����ڸ� �׻� �۾�����
	public Story(String date, String messge, int img) {
		this.date = date;
		this.messge = messge;
		this.img = img;
		
	}
}// end class Story