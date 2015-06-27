package com.example.t081pathdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        
        
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        SeekBar sb = new SeekBar(this);
        
        
        MyView m= new MyView(MainActivity.this);
       // Button b = new Button(MainActivity.this);
      
       // ll.addView(b);
        
        
        ll.addView(sb,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.addView(m,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        setContentView(ll);
        
    }


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
}

class MyView extends View{
	Paint paint = new Paint();
	Path path =new Path();
	float x;
	float y;
	public MyView(Context context) {
		super(context);
		
	
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
	paint.setColor(Color.GREEN);
	canvas.drawPath(path, paint);
	paint.setStyle(Paint.Style.STROKE);
	paint.setStrokeWidth(10f);
		
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			x = event.getX();
			y = event.getY();
			path.moveTo(x, y);
			
			break;
		case MotionEvent.ACTION_MOVE:
			x = event.getX();
			y = event.getY();
			path.lineTo(x, y);
			break;
		
		}
		
		invalidate();
		
		return true;
	}
	
	
	
}