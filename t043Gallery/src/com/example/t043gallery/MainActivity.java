package com.example.t043gallery;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        // 1. �ٷ��� ������
        final int img[]={R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia,
        		R.drawable.canada,R.drawable.france,R.drawable.mexico,R.drawable.poland,R.drawable.saudi_arabia
        };
        
        
        // 2. Adapter
        MyAdapter adapter = new MyAdapter(getApplicationContext(),R.layout.row,img);
        
        
        // 3. AdapterView : Gallery
        
       Gallery g = (Gallery) findViewById(R.id.gallery1);
       final ImageView iv = (ImageView) findViewById(R.id.imageView1);
       g.setAdapter(adapter);
       g.setOnItemSelectedListener(new OnItemSelectedListener() {
      
    	   
		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position,
				long id) { // ���õǾ�
			// TODO Auto-generated method stub
			iv.setImageResource(img[position]);
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
	});
       
    } // end of onCreate


} // end of Class MyActivity


class MyAdapter extends BaseAdapter{
	Context context;
	int layout;
	int img[];
	LayoutInflater inf;
	
	public MyAdapter() {}
	public MyAdapter(Context context, int layout, int[] img) {
		this.context = context;
		this.layout = layout;
		this.img = img;
		this.inf= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);// ��������� ���α׷� �Ŵ����� ������ ����
	}
	@Override
	public int getCount() { // ����� �������� �� - �� ����ؾ��Ѵ�.
		// TODO Auto-generated method stub
		return img.length;
	}
	@Override
	public Object getItem(int position) { // �ش����� ������ 
		// TODO Auto-generated method stub
		return img[position];
	}
	@Override
	public long getItemId(int position) { // ���� ����ũ id �� 
		// TODO Auto-generated method stub
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView==null) { convertView= inf.inflate(layout, null);} // ������ �䰴ü�� ���� 
		ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1); // ��ü�� �̹��� �並 ���� 
		iv.setImageResource(img[position]); // ��ü�� �̹����� �������� �Է�
		
		return convertView;
	}
	
	
	
	
	
	
	
}
