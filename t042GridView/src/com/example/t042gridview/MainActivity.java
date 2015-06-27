package com.example.t042gridview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 1. 다량의 데이터 
        // 2. Adapter
        // 3. AdapterView - GridView
        
        
        int img[] = {R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3,R.drawable.line1,R.drawable.line2,R.drawable.line3,
        			R.drawable.line1,R.drawable.line2,R.drawable.line3};
        
        
        MyAdapter adapter = new MyAdapter(getApplicationContext(),R.layout.row,img);
        
        
        GridView gv = (GridView) findViewById(R.id.gridView1);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new OnItemClickListener() {
        TextView tv = (TextView) findViewById(R.id.textView1);	
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				tv.setText("position :"+position);
				// TODO Auto-generated method stub
				
			}
		});
        
        
    } // end onCreate


   
}



class MyAdapter extends BaseAdapter{
	Context context;
	int layout;
	int img[];
	LayoutInflater inf;
	
	public MyAdapter(){}
	public MyAdapter(Context context, int layout, int[] img) {
	
		this.context = context;
		this.layout = layout;
		this.img = img;
		this.inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return img.length;
	}
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return img[position];
	}
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView==null) {convertView = inf.inflate(layout, null);}
		
		
		ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1); // 이미지를 변경 
		iv.setImageResource(img[position]);
		
		
		return convertView;
	}
	
	
	
	
	
	
	
}