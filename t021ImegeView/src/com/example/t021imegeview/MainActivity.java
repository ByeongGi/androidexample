package com.example.t021imegeview;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore.Images;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv1= (ImageView) findViewById(R.id.imageView1);
        ImageView iv2= (ImageView) findViewById(R.id.imageView2);
        ImageView iv3= (ImageView) findViewById(R.id.imageView3);
        
        
        // 1. ������Ʈ ���� res/drawble ������ �ִ� ������ �����ִ� ���
        	iv1.setImageResource(R.drawable.line);
        	
        
        // 2. Drawable ��ü�� �̿��ؼ� �����ִ� ���
        	Drawable drawable = getResources().getDrawable(R.drawable.line2);
        	//res/drawble
        	iv2.setImageDrawable(drawable);
        	
        // 3. Bitmap ��ü�� �̿��ؼ� �����ִ� ���
        	 Bitmap bm= BitmapFactory.decodeResource(getResources(),R.drawable.line3);
        	 iv3.setImageBitmap(bm);
        
        	 
        	 
        	 
        	 
    }// end onCreate()


    
} // end class MainActivity 
