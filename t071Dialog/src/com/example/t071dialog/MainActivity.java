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
	
	// ���̾�α��� id�� ���� ���� ���� ����� �����ؼ� ����Ѵ�. 
	
	final int ID1 = 1;
	final int ID2 = 2;
	final int ID3 = 3;
	final int ID4 = 4;
	// �ӽ� ���� ����
	int temp;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// AlertDialog : Dialog �� ��ӹ��� �ڽ� Ŭ������
		// ���̾�α׸� ���� ����� �ֵ��� �������ְ�,
		// MainActivity ������ ����Ŭ�� ���̾�α� ����������Ŭ��
		// ������

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
		// ���̾�α׸� ó�� �����Ҷ� ȣ���
		
		
		switch (id) {
		case ID1:
			 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
			  builder.setTitle("��� ���̾� �α� ")
			  		 .setMessage("�ȳ���Ͻʴϱ� ? ???----")
			  		 .setPositiveButton("Ȯ��",null)
			  		 .setNegativeButton("���", null)			  		 
			  		 .setNeutralButton("����", null);
			  ;
			  // d.show();	
			return builder.create();
		case ID2:
			 AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
			 String[] itemsId2 = {"���","����","����"}; // ����Ʈ�� �� �����۵� 
			  builder2.setTitle("����Ʈ ���� ���̾�α�") 
			  		.setItems(itemsId2, null)
			  	    .setNegativeButton("���",null);
			  		 
			  
			return builder2.create();
			
		case ID3:
			AlertDialog.Builder builder3 = new AlertDialog.Builder(MainActivity.this);
			 final String[] itemsId3 = {"���","����","����"};
			builder3.setTitle("������ �����϶�");
			builder3.setSingleChoiceItems(itemsId3, -1, new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int item) {
		                Toast.makeText(getApplicationContext(), "������ ����� = "+itemsId3[item], Toast.LENGTH_SHORT).show();
		                
		            }
		        });
		       return builder3.create(); 
		       
		case ID4:
			AlertDialog.Builder builder4 = new AlertDialog.Builder(MainActivity.this);
			final String[] itemsId4 = {"���","����","����"};
			builder4.setTitle("������ �����϶�");
			builder4.setSingleChoiceItems(itemsId4, -1, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int item) {
					temp=item;
					Toast.makeText(getApplicationContext(), "������ �����  = "+itemsId4[item], Toast.LENGTH_SHORT).show();
					
				}
			})
			 		.setPositiveButton("����",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "������ �����  = "+itemsId4[temp], Toast.LENGTH_SHORT).show();
							
						}
					});
			return builder4.create(); 
		default:
			break;
		}
		
		
		return super.onCreateDialog(id);
	}


	

} // end class MainActivity

