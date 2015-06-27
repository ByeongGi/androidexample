package com.example.t069dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.provider.MediaStore.Images;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Dialog ���̾�α� Ŭ������ ���̾� �α׸� �����. 
        final Dialog d= new Dialog(this);
        d.setTitle("���̾�α� �����Դϴ�.");
        d.setContentView(R.layout.dialog);
        Button b=(Button) d.findViewById(R.id.button1);
        iv = (ImageView) d.findViewById(R.id.imageView1);
        d.show(); // ���̾�α� ���� 
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iv.setImageResource(R.drawable.line2);
				Toast.makeText(getApplicationContext(), "�佺Ʈ �԰�ʹٰ� !!", Toast.LENGTH_LONG);
//				d.dismiss(); // ���̾� �α� ��ü�� ���� 
//				d.hide(); // ���̾�α� ��ü�� ȭ�鿡���� ���� 
			}
		});
        
        
        
        d.setOwnerActivity(MainActivity.this); // �׺�Ƽ��� ����ȭ
        d.setCanceledOnTouchOutside(true); // ���̾�α� �ٱ� ������ Ŭ���� �����Ұ����� ����
    } // end onCreate


   
} // end class
