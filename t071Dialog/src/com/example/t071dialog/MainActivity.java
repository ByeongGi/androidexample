package com.example.t071dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity  {
	
	// 다이얼로그의 id를 따로 보기 좋은 상수로 선언해서 사용한다. 
	
	final int ID1 = 1;
	final int ID2 = 2;
	final int ID3 = 3;
	final int ID4 = 4;
	// 임시 전역 변수
	int temp;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// AlertDialog : Dialog 를 상속받은 자식 클래스로
		// 다이얼로그를 쉽게 만들수 있도록 지원해주고,
		// MainActivity 라이프 사이클과 다이얼로그 라이프사이클을
		// 맞춰줌

		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);

		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				onCreateDialog(ID1).show();	
				

			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onCreateDialog(ID4).show();	
				
				
			}
		});

	}

	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// 다이얼로그를 처음 생성할때 호출됨
		
		
		switch (id) {
		case ID1:
			 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
			  builder.setTitle("경고 다이얼 로그 ")
			  		 .setMessage("안녕들하십니까 ? ???----")
			  		 .setPositiveButton("확인",null)
			  		 .setNegativeButton("취소", null)			  		 
			  		 .setNeutralButton("리셋", null);
			  ;
			  // d.show();	
			return builder.create();
		case ID2:
			 AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
			 String[] itemsId2 = {"사과","딸기","포도"}; // 리스트에 들어갈 아이템들 
			  builder2.setTitle("리스트 형식 다이얼로그") 
			  		.setItems(itemsId2, null)
			  	    .setNegativeButton("취소",null);
			  		 
			  
			return builder2.create();
			
		case ID3:
			AlertDialog.Builder builder3 = new AlertDialog.Builder(MainActivity.this);
			 final String[] itemsId3 = {"사과","딸기","포도"};
			builder3.setTitle("과일을 선택하라");
			builder3.setSingleChoiceItems(itemsId3, -1, new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int item) {
		                Toast.makeText(getApplicationContext(), "선택한 사과는 = "+itemsId3[item], Toast.LENGTH_SHORT).show();
		                
		            }
		        });
		       return builder3.create(); 
		       
		case ID4:
			AlertDialog.Builder builder4 = new AlertDialog.Builder(MainActivity.this);
			final String[] itemsId4 = {"사과","딸기","포도"};
			builder4.setTitle("과일을 선택하라");
			builder4.setSingleChoiceItems(itemsId4, -1, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int item) {
					temp=item;
					Toast.makeText(getApplicationContext(), "선택한 사과는  = "+itemsId4[item], Toast.LENGTH_SHORT).show();
					
				}
			})
			 		.setPositiveButton("선택",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "선택한 사과는  = "+itemsId4[temp], Toast.LENGTH_SHORT).show();
							
						}
					});
			return builder4.create(); 
		default:
			break;
		}
		
		
		return super.onCreateDialog(id);
	}


	

} // end class MainActivity

