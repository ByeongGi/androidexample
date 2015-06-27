package com.example.t079ggaphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        MyView m = new MyView(MainActivity.this);
        
        setContentView(m);
        
        
    } // end of onCreate 


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

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
    }
} // end of class 

class MyView extends View{
	Context context;
	public MyView(Context context) {
		super(context); // 뷰 클래스를 상속 받았으므로 부모의 생성자를 호출한다.
		this.context= context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) { // 화면을 그려주는 작업 
		Paint paint = new Paint(); // 화면에 그려줄 도구를 셋팅하는 객체
		paint.setColor(Color.RED); // 색상을 지정
		setBackgroundColor(Color.GREEN);
		canvas.drawRect(100,100,100,200,paint); // 좌상 우하 좌표 , paint 
		canvas.drawCircle(300, 300, 40, paint); //원 점 x,y, 반지름 ,paint
		
		paint.setColor(Color.YELLOW);
		paint.setStrokeWidth(10f);
		canvas.drawLine(400, 100, 500, 150, paint);
		
		
		// path 자취 만들기
		Path path = new Path();
		path.moveTo(20, 100); // 자취 이동
		path.lineTo(100, 200); // 자취 직선
		path.cubicTo(150, 30, 200,200 , 300, 200); // 자취 베이지 곡석 
		
		paint.setColor(Color.MAGENTA);
		canvas.drawPath(path, paint);
		
	}
	
	
}
