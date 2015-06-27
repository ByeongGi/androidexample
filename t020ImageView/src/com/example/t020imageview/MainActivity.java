package com.example.t020imageview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	final int list[] = {R.drawable.line,R.drawable.line2,R.drawable.line3};
	/**
	 @index �迭�� ���ڿ��� �ε����� ������ 
	*/
	int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final TextView tv= (TextView) findViewById(R.id.textView1);
        // res/drawable ������ �ִ� �̹����� �����ϱ�
        iv.setImageResource(R.drawable.line2);
        
        
        
        iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				if (index>=list.length) index=0;
				iv.setImageResource(list[index]);
				index++;
			}
		});
       
//        Mylisener m =new Mylisener();
//        iv.setOnClickListener(m);
        
        
        iv.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) { // ��Ŭ�� 
				// ���� �̹����� ���ư��� 
				
				if (index<0) index = list.length-1;
				iv.setImageResource(list[index]);
				index--;
				return false;
				// �̺�Ʈ ó���� �Ϸ� - �ٸ� �̺�Ʈ�� �߻���Ű���� �ʴ´�.(true)
			}
		});
        
    } // end of onCreate

    		
}// end of class MainActivity

//
//class Mylisener implements OnClickListener{
//
//	private ImageView iv;
//	private int index=0;
//	@Override
//	public void onClick(View v) {
//		int list[] = {R.drawable.line,R.drawable.line2,R.drawable.line3};
//		
//		
//			if (index>=list.length) {index=0;}
//			iv.setImageResource(list[index]);
//			index++;
//			
//		
//	}
//
//}




