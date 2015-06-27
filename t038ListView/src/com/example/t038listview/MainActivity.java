package com.example.t038listview;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	ArrayList al = new ArrayList(); // �ٷ��� �����͸� ���� ��ü 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ListView Ŀ���͸���¡
        // 1. �ٷ��� ������(ArrayList)
        // 2. Adapter
        // 3. AdapterView ���� (ListView)
        al.add("����");
        al.add("�⸰");
        al.add("ȣ����");
        al.add("����");
        al.add("����");
        al.add("�ڶ�");
        al.add("��ѱ�");
        al.add("������");
        al.add("������");
        al.add("����");
        al.add("�⸰");
        al.add("ȣ����");
        al.add("����");
        al.add("����");
        al.add("�ڶ�");
        al.add("��ѱ�");
        al.add("������");
        al.add("������");
        al.add("����");
        al.add("�⸰");
        al.add("ȣ����");
        al.add("����");
        al.add("����");
        al.add("�ڶ�");
        al.add("��ѱ�");
        al.add("������");
        al.add("������");
      
       
        // adapter ����� 
        MyAdapter adapter = new MyAdapter(getApplicationContext(),// ����ȭ���� ������� 
        		R.layout.myrow,// �� ���� ����� ���̾ƿ�
        		al// ������ �ٷ��� ������ 
        		);
        
        
        
        
        
        
        
        	ListView lv= (ListView) findViewById(R.id.listView1);
        	lv.setAdapter(adapter);
        	
  
        
        
        
        
    } // end onCreate


   
} // end Class MainActivity

class MyAdapter extends BaseAdapter { // Adapter �� ��ӹ޾Ƽ� �����Ѵ�. 
	Context context; // ���� ȭ���� ������� 
	int layout; // ������ �׷��� layout
	ArrayList al; // ������ 
	
	LayoutInflater inf; // Layout xml ������ ��ü�� ��ȯ�Ҷ� �ʿ��� 
	

	public MyAdapter(Context context, int layout, ArrayList al) { // �ʱ�ȭ
		this.context = context;
		this.layout= layout;
		this.al=al;
		this.inf= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		// ���� ȭ�鿡������ ������ ��� ���;��� . �׷��� ���񽺸� �����ϴ� �ý��ۿ��� ���̾ƿ� ��Ʋ������ ���񽺸� ������ ������ �� .
	}

	@Override
	public int getCount() { // listView���� ����� �������� �Ѱ��� 
		
		return al.size(); // al�� �������� ũ�⸸ŭ �����͸� �����ְڴ� .
	}

	@Override
	public Object getItem(int position) { // �ش� position ��° ������ ���� �����̳� 
		
		return al.get(position);
	}

	@Override
	public long getItemId(int position) { // �ش� position ����ũ�� ���̵� �� 
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {// ������ ȭ���� �����ϴ� �޼ҵ� (�����߿�)
						// position �ش��� ���� , convertView �ش��� ���̾ƿ�,parent ����Ʈ��
		
		if (convertView==null){convertView = inf.inflate(layout, null);} // ���ɰ���
		// xml ���Ϸ� �ۼ��� ���̾ƿ� ��ü ����  
		TextView tv= (TextView) convertView.findViewById(R.id.textView1);
		tv.setText(al.get(position).toString()); // �ش� ��°�� ���� ���� 
		
		return convertView;
	}
	
	
	
	
	
	
	
	
	
}