package com.example.t005textview4;// 현재 폴더 위치 

import android.R.color;
import android.R.string;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
// 소스상에서 Import 된 클래스들 Path 정의 :아래에서 PATH 주소가 전부 입력안해도 됨 

// 안드로이드는 달빅 머신이라는 것이 메인 메소드의 시작을 갖고 있습니다. 
// 이미 안드로이드를 구동과 동시에 달빅 머신을 작동됨. 
// 달빅 머신이 시작점을 갖고 있다가 어떤 앱을 구동하는 순간 callback 메소드를 호출하도록 이벤트를 날려줌 ~.
// 안드로이드는 이벤트로 모두 동작하는 프로그램.
// 안드로이드는 주 목적은 이벤트에 대한 모든 처리 ~
// 버튼을 누르는 순간 달빅 머신이 쓰래드를 생성하고 callback 메소드를 호출하도록 이벤트를날려주고 앱을 작동시킴





// activity -  
public class MainActivity extends ActionBarActivity {

    @Override // jdk 1.5 이후 사용됨 , 어노테이션 , 코드에는 영향이 없음
    protected void onCreate(Bundle savedInstanceState) { 
    	// onCreate() : 최초에 앱이 실행될때 호출되는 콜백 메소드 ~
        super.onCreate(savedInstanceState); // super 클래스의 onCreate() 메소드를 호출 
        setContentView(R.layout.activity_main); // setContentView() 사용할 레이아웃을 등록하는 메소드
        //R 클래스:  안드로이드 파일 리소스들의 경로와 이름들을 정의  
        
        // ↓ 밑에 줄부터 앱이 화면에 출력된 뒤에 할 소스를 구현함 
        
        TextView tv;
        tv= (TextView) findViewById(R.id.textView1); // view 로 캐스팅 : 다형성 성질 
        	// xml에 선언된 자원을 소스상에서 연결 
        
        tv.setText("밥 먹자 ~~~");// TextView 의 글자를 변경하는 메소드
        tv.setTextSize(20.0f);
        tv.setTextColor(0xff7700ff); // alpha , red, green , blue 
        tv.setTextColor(Color.RED);
       
        String str= tv.getText().toString();
        // System.out.println(str);  // 안드로이드 콘솔창 출력 불가
        // 대체하기 위한 방법 : log 클래스를 지원한다
        Log.d("test","텍스트 뷰 문자열 "+str);
    } // and of onCreate
    

 // 밑에 코드들은  버튼 메뉴바  
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    } // end of onCreateOptionsMenu
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    } // end of onOptionsItemSelected
} // end class of MainActivity
