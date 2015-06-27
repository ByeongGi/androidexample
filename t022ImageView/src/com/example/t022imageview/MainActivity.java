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
        // 모바일에 저장된 사진을 로딩해서 ImageView에 띄우기
        
        // 1. 사용자의 권한을 획득하는 방법 (androidMainfest.xml)
        // androidMainfest 에서 android.permission.WRITE_EXTERNAL_STORAGE 외장 저장장치 읽기 허용을 체크해준다.
        // 2. 이미지의 경로, Bitmap 으로 imageView에 띄운다.
        
        
        ImageView iv = (ImageView) findViewById(R.id.imageView1);
        
        Bitmap bm = BitmapFactory.decodeFile("/storage/emulated/0/tmptemp.jpg");
        iv.setImageBitmap(bm);
        
        
        
        
        
        
        
        
        
        
        
        
    }// end of onCreate 


   
} // end class MainActivity
