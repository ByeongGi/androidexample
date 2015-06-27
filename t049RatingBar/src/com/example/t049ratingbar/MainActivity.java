package com.example.t049ratingbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = (TextView) findViewById(R.id.textView1);
        RatingBar rb = (RatingBar) findViewById(R.id.ratingBar1);
        
        rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
				tv.setText("º°ÀÇ °¹¼ö ? : "+rating);
				
			}
		});
    } // end onCreate


   
} // end of class 
