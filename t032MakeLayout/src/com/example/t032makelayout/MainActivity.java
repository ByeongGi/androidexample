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
         // setContentView(R.layout.activity_main); // �ڵ忡�� ����� ȭ���� �����ϴ� �޼ҵ� 
         
         // Java �ڵ忡�� ���̾ƿ��� ���� ȭ�鿡 �Ѹ��� 
        
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL); // LinearLayout���� �Ӽ��� �������ִ� �޼ҵ� 
        Button b1= new Button(this);
        Button b2 = new Button(this);
        b1.setText("ù��° ��ư");
        b2.setText("�ι�° ��ư");
        ll.addView(b1,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT); // ��ư ��ü�� ll ���̾ƿ��� ���� 
        ll.addView(b2,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT); // ��ư ��ü�� ll ���̾ƿ��� ���� 
        
        setContentView(ll);// ȭ�鿡 ������ ��ü�� ��� 
        
        
        
        
    } // end onCreate 


    
} // end Class MainActivity
