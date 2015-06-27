package com.example.project_ennergram;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
	// ���̾ƿ� �ڿ��� 
	private LinearLayout ll1; private LinearLayout ll2; private LinearLayout ll3; 
    private LinearLayout ll4; private LinearLayout ll5; private LinearLayout ll6; 
    private LinearLayout ll7; 
    private TextView tv1;private TextView tv2;
    private RadioGroup rg;
    // �ڷ� �ڿ���
    private QuetionModel list= new QuetionModel(); 
    private String[][] Qusetionlist=list.getList();
    private int Qconut=0;private int Sconut=0;
   
    //  ���� ��ư üũ �迭 ����
    private int score[]=new int[180];
    // ������ ���� ���� ����
    private int type1=0; private int type2=0; private int type3=0;
    private int type4=0; private int type5=0; private int type6=0; 
    private int type7=0; private int type8=0; private int type9=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1); // ó��
        Button b2 = (Button) findViewById(R.id.button2); // ���
        Button b3 = (Button) findViewById(R.id.button3); // ����
        Button b4 = (Button) findViewById(R.id.button4); // ����
        Button b5 = (Button) findViewById(R.id.Button_enneagram); // �ִϾ�׷� �˻� ����
        Button b6 = (Button) findViewById(R.id.Button_result); // �˻��� ����
        Button b7 = (Button) findViewById(R.id.buttoninsert1); // ���� ���� ��ư
        Button b8 = (Button) findViewById(R.id.buttoninsert2); // ��� ����


        ll1 = (LinearLayout) findViewById(R.id.mainLayout); // ���� xml ���� �������// ��ü�� ����
        ll2 = (LinearLayout) findViewById(R.id.subLayout1);
        ll3 = (LinearLayout) findViewById(R.id.subLayout2);
        ll4 = (LinearLayout) findViewById(R.id.subLayout3);
        ll5 = (LinearLayout) findViewById(R.id.studySelect1); // �˻� ����
        ll6 = (LinearLayout) findViewById(R.id.studySelect2); // �˻� ���
        ll7 = (LinearLayout) findViewById(R.id.studySelect0); // ����ȭ��

        tv1= (TextView) findViewById(R.id.TextView_ennergram); // ���� ��� �ϴ� �ؽ�Ʈ ��
        tv2= (TextView) findViewById(R.id.textView_result); // ���� ��� �ϴ� �ؽ�Ʈ ��
        	
        // ��ư�� ���� �̺�Ʈ ������  
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
      





    } // end onCreate

    @Override
    public void onClick(View v) { 
        Button b = (Button) v;
        int index = b.getId();
        layoutVisibleContol(index); // ���̾ƿ� ��Ʈ�ѷ� 
        
    }// end onClick
    
    
    
    
    //==================================================================================================//
    /**
     * ���̾ƿ����� ���� ����/�Ⱥ��ӵ��� �����Ѵ�.
     * @param index - �� ��ư�� ���� ������
     */
	private void layoutVisibleContol(int index) {
		switch (index) {
		case R.id.button1: // ó�� 
			ll1.setVisibility(View.VISIBLE);
			ll7.setVisibility(View.VISIBLE);
			ll2.setVisibility(View.INVISIBLE);
			ll3.setVisibility(View.INVISIBLE);
			ll4.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.INVISIBLE);
			ll6.setVisibility(View.INVISIBLE);
			Qconut = 0;Sconut = 0; // ó������ ���ư��� ���׿� ���� ī��Ʈ�� ���� �ʱ�ȭ ��Ų��.
			type1 = 0;type2 = 0;type3 = 0;type4 = 0;
			type5 = 0;type6 = 0;type7 = 0;type8 = 0;type9 = 0;
			break;
		case R.id.button2:
			ll1.setVisibility(View.INVISIBLE);
			ll2.setVisibility(View.VISIBLE);
			ll3.setVisibility(View.INVISIBLE);
			ll4.setVisibility(View.INVISIBLE);
			break;
		case R.id.button3:
			ll1.setVisibility(View.INVISIBLE);
			ll2.setVisibility(View.INVISIBLE);
			ll3.setVisibility(View.VISIBLE);
			ll4.setVisibility(View.INVISIBLE);
			break;
		case R.id.button4:
			ll1.setVisibility(View.INVISIBLE);
			ll2.setVisibility(View.INVISIBLE);
			ll3.setVisibility(View.INVISIBLE);
			ll4.setVisibility(View.VISIBLE);
			break;
		case R.id.Button_enneagram:
			ll7.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.VISIBLE);
			ll6.setVisibility(View.INVISIBLE);
			Toast.makeText(getApplicationContext(), "�˻縦 �����մϴ�.",Toast.LENGTH_LONG).show();
			String a = Qusetionlist[Qconut][1];
			tv1.setText(a);
			Qconut++;
			break;
		case R.id.Button_result: // ���â ��ư
			ll7.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.INVISIBLE);
			ll6.setVisibility(View.VISIBLE);
		case R.id.buttoninsert1: // ���� ���� ��ư
			// ���� ���� ������
			if (Qconut < 180) {
				String qqq = Qusetionlist[Qconut][1];
				tv1.setText(qqq);}
				Qconut++;
			// ���� üũ �Ϸ��� ȭ�� �Ϸ��� ����
			if (Qconut > 180) {
				ll7.setVisibility(View.INVISIBLE);
				ll5.setVisibility(View.INVISIBLE);
				ll6.setVisibility(View.VISIBLE);
				Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
				vibrator.vibrate(4000);
				Toast.makeText(getApplicationContext(), "�˻����� ���ϴ�.",Toast.LENGTH_LONG).show();}
			// ���� ��ư�� �Էµ� ���� üũ��
			rg = (RadioGroup) findViewById(R.id.radioGroup1);
			int id = rg.getCheckedRadioButtonId();
			CheckSocore(id);

			// �˻簡 ������ Ÿ�Ժ��� ������ ī��Ʈ���ش�.
			if (Sconut == 180) {
				countTypeSocore();
			}
		case R.id.buttoninsert2:

			break;

		} // end switch

	} // end layoutVisibleContol()
    
    
    /**
     * ���� ��ư�� �Էµ� �� ���׺��� ����ġ�� ����ϴ� �޼ҵ��̴� .
     * @param id : ���� �׷� ��ư�鿡 ���� id
     */
	private void CheckSocore(int id) {
		switch (id) {
		case R.id.radio_ennergram1:
			score[Sconut] = 0;
			Sconut++;
			break;
		case R.id.radio_ennergram2:
			score[Sconut] = 1;
			Sconut++;
			break;
		case R.id.radio_ennergram3:
			score[Sconut] = 2;
			Sconut++;
			break;
		case R.id.radio_ennergram4:
			score[Sconut] = 3;
			Sconut++;
			break;
		}// end switch(id)
	} // end CheckSocore()
    
	
	/**
	 * �˻簡 ������ Ÿ�Ժ��� ������ �ջ��Ų��.
	 */
	private void countTypeSocore(){
		 for (int i = 0; i <180 ; i++) {
             String type =Qusetionlist[i][0];
             switch (type){
                 case "1":
                     type1+=score[i];
                     break;
                 case "2":
                     type2+=score[i];
                     break;
                 case "3":
                     type3+=score[i];
                     break;
                 case "4":
                     type4+=score[i];
                     break;
                 case "5":
                     type5+=score[i];
                     break;
                 case "6":
                     type6+=score[i];
                     break;
                 case "7":
                     type7+=score[i];
                     break;
                 case "8":
                     type8+=score[i];
                     break;
                 case "9":
                     type9+=score[i];
                     break;
             }
         } 
	} // end countTypeSocore()
    
    

    } // end class MainActivity
