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
		super(context); // �� Ŭ������ ��� �޾����Ƿ� �θ��� �����ڸ� ȣ���Ѵ�.
		this.context= context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) { // ȭ���� �׷��ִ� �۾� 
		Paint paint = new Paint(); // ȭ�鿡 �׷��� ������ �����ϴ� ��ü
		paint.setColor(Color.RED); // ������ ����
		setBackgroundColor(Color.GREEN);
		canvas.drawRect(100,100,100,200,paint); // �»� ���� ��ǥ , paint 
		canvas.drawCircle(300, 300, 40, paint); //�� �� x,y, ������ ,paint
		
		paint.setColor(Color.YELLOW);
		paint.setStrokeWidth(10f);
		canvas.drawLine(400, 100, 500, 150, paint);
		
		
		// path ���� �����
		Path path = new Path();
		path.moveTo(20, 100); // ���� �̵�
		path.lineTo(100, 200); // ���� ����
		path.cubicTo(150, 30, 200,200 , 300, 200); // ���� ������ � 
		
		paint.setColor(Color.MAGENTA);
		canvas.drawPath(path, paint);
		
	}
	
	
}
