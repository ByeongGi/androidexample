package com.example.t039listview;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
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
	ArrayList<Man> al = new ArrayList<Man>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ListView �� īī���� �����
        
        // 1. �ٷ��� ������ 
        Man m1 = new Man();
        m1.img = R.drawable.line;
        m1.name= "�躴��";
        m1.birthDay = "1990-06-04";		
        al.add(m1);
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
  
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"�����",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"������",false,"1991-03-06"));
        
  
   
      
        
        // 2.Adapter(�����Ϳ� view �� ���� ���踦 ���� ) 
        
        ListView lv= (ListView) findViewById(R.id.listView1);
        
        
        
        
        // 3.AdapterView(ListView)
        KakaoAapter adapter = new KakaoAapter(getApplicationContext(),R.layout.myrow,al);
        										// �������, �������׷��� layout, �ٷ��� ������
        lv.setAdapter(adapter);// ����Ʈ �信 ������ ....
        
        // �̺�Ʈ ó�� 
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Log.d("test", "������ Ŭ��:"+position+"id:"+id);
			}
		});
        
        
        
        
    } // end of onCreate


    
} // end of Class MainActivity



class Man { // java Bean

	int img; // ���� -res/drawable
	String name = "";
	boolean sex;
	String birthDay = "";

	// �����ڰ� ������ ��ü ������ ���ϴ� .

	// ���� �ڵ�� ȣȯ�� ���ؼ� ������ �⺻ �����ڵ� �߰� ���ش�.
	public Man() {
	}

	public Man(int img, String name, boolean sex, String birthDay) {
		this.img = img;
		this.name = name;
		this.sex = sex;
		this.birthDay = birthDay;
	}

	// getter & setter
	public int getImg() {
		return img;
	}

	public String getName() {
		return name;
	}

	public boolean isSex() {
		return sex;
	}

	public String getBirthDay() {
		return birthDay;
	}

} // end Class Man



class KakaoAapter extends BaseAdapter{
	Context context; // ���� ȭ���� �������
	int layout;	 	 // ������ ���̾ƿ�
	ArrayList<Man> al; // 
	LayoutInflater inf;//  ȭ���� �׷��ٶ� �ʿ�
	
	
	// ������ 
	public KakaoAapter() {
		
	}
	
	public KakaoAapter(Context context, int layout, ArrayList<Man> al) {
	
		this.context = context;
		this.layout = layout;
		this.al = al;
		this.inf=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() { // ���̾ƿ����� ���� �ڷ��� ����
		
		return al.size();
	}

	@Override
	public Object getItem(int position) { // ���̾ƿ����� ���� ���� �ڷ��� ��
		
		return al.get(position);
	}

	@Override
	public long getItemId(int position) { // �ش� ��°�� ������ ��  ���� ���̾ƿ��� ��ġ�� row�� ��������
		
		return position;
	}

	@Override // �ش� ��° ���� ���̾ƿ��� �����͸� �����ϴ� �۾� 
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if (convertView==null) {convertView = inf.inflate(layout, null);} // �츮�� xml��  ������ ���̾ƿ��� �Ľ��ؼ� �信 �����Ѵ� .
		
		TextView tv1= (TextView) convertView.findViewById(R.id.tvName); // �츮�� ������  xml ���̾ƿ� �ȿ� �ִ� �������� ���ҽ� �ּҰ��� �־��ش� 
		TextView tv2= (TextView) convertView.findViewById(R.id.tvSex);
		TextView tv3= (TextView) convertView.findViewById(R.id.tvBirthDay);
		ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
		
		
		
		tv1.setText(al.get(position).getName());
		// if (al.get(position).sex) {tv2.setText("����");} else {tv2.setText("����");}
		tv2.setText(al.get(position).sex ? "����":"����");
		tv3.setText(al.get(position).getBirthDay());
		iv.setImageResource(al.get(position).img);
		
		return convertView;
	}
	
	
	
	
	
}
