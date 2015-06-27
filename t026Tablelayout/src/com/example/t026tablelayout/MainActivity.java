package com.example.t026tablelayout;

import java.io.PrintStream;
import java.util.Queue;
import java.util.Stack;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.print.PrinterInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements OnClickListener{
	EditText et;
	Character[] list;
	Stack<Character> st = new Stack<Character>();
	Character[] number={1,2,3,4,5,6,7,8,9,0};
	
	int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et = (EditText)findViewById(R.id.editText1);
        Button b1= (Button) findViewById(R.id.button1);
        Button b2= (Button) findViewById(R.id.button2);
        Button b3= (Button) findViewById(R.id.button3);
        Button b4= (Button) findViewById(R.id.button4);
        Button b5= (Button) findViewById(R.id.button5);
        Button b6= (Button) findViewById(R.id.button6);
        Button b7= (Button) findViewById(R.id.button7);
        Button b8= (Button) findViewById(R.id.button8);
        Button b9= (Button) findViewById(R.id.button9);
        Button b0= (Button) findViewById(R.id.button0);
        Button bplus= (Button) findViewById(R.id.buttonplus);
        Button bminus= (Button) findViewById(R.id.buttonminus);
        Button bmul= (Button) findViewById(R.id.buttonmul);
        Button bdid= (Button) findViewById(R.id.buttondivide);
        Button bqua= (Button) findViewById(R.id.buttonequal);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        
       
        
    } // end onCreate 


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
    }// 


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Button b = (Button) v;
		String str=b.getText().toString();
		char ccc= str.charAt(0);// ¹®ÀÚ¿­ÀÇ 0¹øÂ° ÀÎµ¦½º ±ÛÀÚ¸¦ ¾ò¾î¿È
		
		
		
		switch (ccc) {
		case '*':
			st.add(ccc);
			break;
		case '/':
			st.add(ccc);
			break;	
		case '+':
			st.add(ccc);
			break;	
		case '-':
			st.add(ccc);
			break;	
			
			
		default:
			if (number.equals(list[i])) {
			list[i]=ccc;
			i++;
			}
			
			break;
		}
		
		
		
		
		if ("*".equals(str)) {
			// °ö¼ÀÃ³¸®
		} else if ("*".equals(str)) {
			// ³ª´°¼ÀÃ³¸® 
		} else { // ¼ýÀÚÀÏ °æ¿ì 
			int num = Integer.parseInt(str);
//			et.setText(num+"");
			et.append(num+"");
			
		}
		
	}
    
    
    
    
} // end Class MainActivity 


