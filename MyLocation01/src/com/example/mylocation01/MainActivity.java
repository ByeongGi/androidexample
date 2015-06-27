package com.example.mylocation01;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button btnShowLocation;
	private TextView txtLat;
	private TextView txtLon;
	private TextView resulttv;
	Timer timer;
	TimerTask infoUpdate;
	// GPSTracker class GPS 추적 클래스
	private GpsInfo gps;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnShowLocation = (Button) findViewById(R.id.button1);
		txtLat = (TextView) findViewById(R.id.textView2);
		txtLon = (TextView) findViewById(R.id.textView3);
		resulttv = (TextView) findViewById(R.id.textView4);

		btnShowLocation.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				gps = new GpsInfo(MainActivity.this);
				// GPS 사용유무 가져오기
				if (gps.isGetLocation()) {

					double latitude = gps.getLatitude();
					double longitude = gps.getLongitude();
					double al = gps.getAltitude();
					double sp = gps.getspeed();

					txtLat.setText(String.valueOf(latitude));
					txtLon.setText(String.valueOf(longitude));
					txtLon.setText(String.valueOf(al));
					txtLon.setText(String.valueOf(sp));
					String str = "당신의 위치 - \n위도: " + latitude + "\n경도: "
							+ longitude + "\n고도: " + al + "\n경도: " + sp;
					resulttv.setText(str);

					Toast.makeText(
							getApplicationContext(),
							"당신의 위치 - \n위도: " + latitude + "\n경도: " + longitude,
							Toast.LENGTH_LONG).show();
				} else {
					// GPS 를 사용할수 없으므로
					gps.showSettingsAlert();
				}
			}
		});

	}

} // end class MainActivity