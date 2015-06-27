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
	ArrayList al = new ArrayList(); // 다량의 데이터를 담을 객체 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ListView 커스터마이징
        // 1. 다량의 데이터(ArrayList)
        // 2. Adapter
        // 3. AdapterView 선정 (ListView)
        al.add("사자");
        al.add("기린");
        al.add("호랑이");
        al.add("돌고래");
        al.add("참새");
        al.add("자라");
        al.add("비둘기");
        al.add("독수리");
        al.add("원숭이");
        al.add("사자");
        al.add("기린");
        al.add("호랑이");
        al.add("돌고래");
        al.add("참새");
        al.add("자라");
        al.add("비둘기");
        al.add("독수리");
        al.add("원숭이");
        al.add("사자");
        al.add("기린");
        al.add("호랑이");
        al.add("돌고래");
        al.add("참새");
        al.add("자라");
        al.add("비둘기");
        al.add("독수리");
        al.add("원숭이");
      
       
        // adapter 만들기 
        MyAdapter adapter = new MyAdapter(getApplicationContext(),// 현재화면의 제어권자 
        		R.layout.myrow,// 한 행을 담당할 레이아웃
        		al// 보여줄 다량의 데이터 
        		);
        
        
        
        
        
        
        
        	ListView lv= (ListView) findViewById(R.id.listView1);
        	lv.setAdapter(adapter);
        	
  
        
        
        
        
    } // end onCreate


   
} // end Class MainActivity

class MyAdapter extends BaseAdapter { // Adapter 를 상속받아서 구현한다. 
	Context context; // 현재 화면의 제어권자 
	int layout; // 한행을 그려줄 layout
	ArrayList al; // 데이터 
	
	LayoutInflater inf; // Layout xml 파일을 객체로 변환할때 필요함 
	

	public MyAdapter(Context context, int layout, ArrayList al) { // 초기화
		this.context = context;
		this.layout= layout;
		this.al=al;
		this.inf= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		// 현재 화면에서부터 권한을 모두 얻어와야함 . 그래서 서비스를 관리하는 시스템에서 레이아웃 인틀레이터 서비스를 권한을 가지고 옴 .
	}

	@Override
	public int getCount() { // listView에서 사용할 데이터의 총개수 
		
		return al.size(); // al의 데이터의 크기만큼 데이터를 보여주겠다 .
	}

	@Override
	public Object getItem(int position) { // 해당 position 번째 데이터 값이 무엇이냐 
		
		return al.get(position);
	}

	@Override
	public long getItemId(int position) { // 해당 position 유니크한 아이디 값 
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {// 한행의 화면을 세팅하는 메소드 (가장중요)
						// position 해당행 순서 , convertView 해당행 레이아웃,parent 리스트뷰
		
		if (convertView==null){convertView = inf.inflate(layout, null);} // 성능개선
		// xml 파일로 작성한 레이아웃 객체 생성  
		TextView tv= (TextView) convertView.findViewById(R.id.textView1);
		tv.setText(al.get(position).toString()); // 해당 번째의 값을 설정 
		
		return convertView;
	}
	
	
	
	
	
	
	
	
	
}