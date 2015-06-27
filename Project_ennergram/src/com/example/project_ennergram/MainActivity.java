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
	// 레이아웃 자원들 
	private LinearLayout ll1; private LinearLayout ll2; private LinearLayout ll3; 
    private LinearLayout ll4; private LinearLayout ll5; private LinearLayout ll6; 
    private LinearLayout ll7; 
    private TextView tv1;private TextView tv2;
    private RadioGroup rg;
    // 자료 자원들
    private QuetionModel list= new QuetionModel(); 
    private String[][] Qusetionlist=list.getList();
    private int Qconut=0;private int Sconut=0;
   
    //  라디오 버튼 체크 배열 저장
    private int score[]=new int[180];
    // 유형별 누적 점수 저장
    private int type1=0; private int type2=0; private int type3=0;
    private int type4=0; private int type5=0; private int type6=0; 
    private int type7=0; private int type8=0; private int type9=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1); // 처음
        Button b2 = (Button) findViewById(R.id.button2); // 목록
        Button b3 = (Button) findViewById(R.id.button3); // 이전
        Button b4 = (Button) findViewById(R.id.button4); // 다음
        Button b5 = (Button) findViewById(R.id.Button_enneagram); // 애니어그램 검사 선택
        Button b6 = (Button) findViewById(R.id.Button_result); // 검사결과 선택
        Button b7 = (Button) findViewById(R.id.buttoninsert1); // 다음 문항 버튼
        Button b8 = (Button) findViewById(R.id.buttoninsert2); // 결과 문제


        ll1 = (LinearLayout) findViewById(R.id.mainLayout); // 실제 xml 에서 만들어진// 객체를 저장
        ll2 = (LinearLayout) findViewById(R.id.subLayout1);
        ll3 = (LinearLayout) findViewById(R.id.subLayout2);
        ll4 = (LinearLayout) findViewById(R.id.subLayout3);
        ll5 = (LinearLayout) findViewById(R.id.studySelect1); // 검사 선택
        ll6 = (LinearLayout) findViewById(R.id.studySelect2); // 검사 결과
        ll7 = (LinearLayout) findViewById(R.id.studySelect0); // 선택화면

        tv1= (TextView) findViewById(R.id.TextView_ennergram); // 문항 출력 하는 텍스트 뷰
        tv2= (TextView) findViewById(R.id.textView_result); // 문항 출력 하는 텍스트 뷰
        	
        // 버튼에 대한 이벤트 리스너  
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
        layoutVisibleContol(index); // 레이아웃 컨트롤러 
        
    }// end onClick
    
    
    
    
    //==================================================================================================//
    /**
     * 레이아웃들의 대한 보임/안보임들을 제어한다.
     * @param index - 각 버튼에 대한 구분자
     */
	private void layoutVisibleContol(int index) {
		switch (index) {
		case R.id.button1: // 처음 
			ll1.setVisibility(View.VISIBLE);
			ll7.setVisibility(View.VISIBLE);
			ll2.setVisibility(View.INVISIBLE);
			ll3.setVisibility(View.INVISIBLE);
			ll4.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.INVISIBLE);
			ll6.setVisibility(View.INVISIBLE);
			Qconut = 0;Sconut = 0; // 처음으로 돌아가면 문항에 대한 카운트된 값을 초기화 시킨다.
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
			Toast.makeText(getApplicationContext(), "검사를 시작합니다.",Toast.LENGTH_LONG).show();
			String a = Qusetionlist[Qconut][1];
			tv1.setText(a);
			Qconut++;
			break;
		case R.id.Button_result: // 결과창 버튼
			ll7.setVisibility(View.INVISIBLE);
			ll5.setVisibility(View.INVISIBLE);
			ll6.setVisibility(View.VISIBLE);
		case R.id.buttoninsert1: // 문항 다음 버튼
			// 문항 통제 구문들
			if (Qconut < 180) {
				String qqq = Qusetionlist[Qconut][1];
				tv1.setText(qqq);}
				Qconut++;
			// 문항 체크 완료후 화면 완료후 동작
			if (Qconut > 180) {
				ll7.setVisibility(View.INVISIBLE);
				ll5.setVisibility(View.INVISIBLE);
				ll6.setVisibility(View.VISIBLE);
				Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
				vibrator.vibrate(4000);
				Toast.makeText(getApplicationContext(), "검사결과를 봅니다.",Toast.LENGTH_LONG).show();}
			// 라디오 버튼에 입력된 수를 체크함
			rg = (RadioGroup) findViewById(R.id.radioGroup1);
			int id = rg.getCheckedRadioButtonId();
			CheckSocore(id);

			// 검사가 끝나고 타입별로 점수를 카운트해준다.
			if (Sconut == 180) {
				countTypeSocore();
			}
		case R.id.buttoninsert2:

			break;

		} // end switch

	} // end layoutVisibleContol()
    
    
    /**
     * 라디오 버튼에 입력된 각 문항별의 가중치를 기록하는 메소드이다 .
     * @param id : 라디오 그룹 버튼들에 대한 id
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
	 * 검사가 끝난후 타입별로 점수를 합산시킨다.
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
