package com.example.t022imageview;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ����Ͽ� ����� ������ �ε��ؼ� ImageView�� ����
        
        // 1. ������� ������ ȹ���ϴ� ��� (androidMainfest.xml)
        // androidMainfest ���� android.permission.WRITE_EXTERNAL_STORAGE ���� ������ġ �б� ����� üũ���ش�.
        // 2. �̹����� ���, Bitmap ���� imageView�� ����.
        
        
        ImageView iv = (ImageView) findViewById(R.id.imageView1);
        
        Bitmap bm = BitmapFactory.decodeFile("/storage/emulated/0/tmptemp.jpg");
        iv.setImageBitmap(bm);
        
        
        
        
        
        
        
        
        
        
        
        
    }// end of onCreate 


   
} // end class MainActivity
