package com.example.t032makelayout;

import java.util.ResourceBundle.Control;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         // setContentView(R.layout.activity_main); // 코드에서 사용할 화면을 연결하는 메소드 
         
         // Java 코드에서 레이아웃을 만들어서 화면에 뿌리기 
        
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL); // LinearLayout에서 속성을 지정해주는 메소드 
        Button b1= new Button(this);
        Button b2 = new Button(this);
        b1.setText("첫번째 버튼");
        b2.setText("두번째 버튼");
        ll.addView(b1,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT); // 버튼 객체를 ll 레이아웃에 저장 
        ll.addView(b2,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT); // 버튼 객체를 ll 레이아웃에 저장 
        
        setContentView(ll);// 화면에 보여질 객체를 등록 
        
        
        
        
    } // end onCreate 


    
} // end Class MainActivity
