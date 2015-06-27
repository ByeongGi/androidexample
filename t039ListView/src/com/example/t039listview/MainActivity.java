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
        
        // ListView 로 카카오톡 만들기
        
        // 1. 다량의 데이터 
        Man m1 = new Man();
        m1.img = R.drawable.line;
        m1.name= "김병기";
        m1.birthDay = "1990-06-04";		
        al.add(m1);
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
  
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        al.add(new Man(R.drawable.line2,"김빙기",true,"1990-07-04"));al.add(new Man(R.drawable.line3,"이현주",false,"1991-03-06"));
        
  
   
      
        
        // 2.Adapter(데이터와 view 의 연결 관계를 정의 ) 
        
        ListView lv= (ListView) findViewById(R.id.listView1);
        
        
        
        
        // 3.AdapterView(ListView)
        KakaoAapter adapter = new KakaoAapter(getApplicationContext(),R.layout.myrow,al);
        										// 제어권자, 한행을그려줄 layout, 다량의 데이터
        lv.setAdapter(adapter);// 리스트 뷰에 연결함 ....
        
        // 이벤트 처리 
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Log.d("test", "아이템 클릭:"+position+"id:"+id);
			}
		});
        
        
        
        
    } // end of onCreate


    
} // end of Class MainActivity



class Man { // java Bean

	int img; // 사진 -res/drawable
	String name = "";
	boolean sex;
	String birthDay = "";

	// 생성자가 있으면 객체 생성시 편리하다 .

	// 기존 코드와 호환을 위해서 생성자 기본 생성자도 추가 해준다.
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
	Context context; // 현재 화면의 제어권자
	int layout;	 	 // 한행의 레이아웃
	ArrayList<Man> al; // 
	LayoutInflater inf;//  화면을 그려줄때 필요
	
	
	// 생성자 
	public KakaoAapter() {
		
	}
	
	public KakaoAapter(Context context, int layout, ArrayList<Man> al) {
	
		this.context = context;
		this.layout = layout;
		this.al = al;
		this.inf=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() { // 레이아웃에서 사용될 자료의 갯수
		
		return al.size();
	}

	@Override
	public Object getItem(int position) { // 레이아웃에서 사용될 행의 자료의 행
		
		return al.get(position);
	}

	@Override
	public long getItemId(int position) { // 해당 번째의 고유한 값  행의 레이아웃이 위치할 row를 지정해줌
		
		return position;
	}

	@Override // 해당 번째 행의 레이아웃과 데이터를 연결하는 작업 
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if (convertView==null) {convertView = inf.inflate(layout, null);} // 우리가 xml로  설계한 레이아웃을 파싱해서 뷰에 저장한다 .
		
		TextView tv1= (TextView) convertView.findViewById(R.id.tvName); // 우리가 설계한  xml 레이아웃 안에 있는 위젯들의 리소스 주소값을 넣어준다 
		TextView tv2= (TextView) convertView.findViewById(R.id.tvSex);
		TextView tv3= (TextView) convertView.findViewById(R.id.tvBirthDay);
		ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
		
		
		
		tv1.setText(al.get(position).getName());
		// if (al.get(position).sex) {tv2.setText("남자");} else {tv2.setText("여자");}
		tv2.setText(al.get(position).sex ? "남자":"여자");
		tv3.setText(al.get(position).getBirthDay());
		iv.setImageResource(al.get(position).img);
		
		return convertView;
	}
	
	
	
	
	
}
