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
	// GPSTracker class GPS ���� Ŭ����
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
				// GPS ������� ��������
				if (gps.isGetLocation()) {

					double latitude = gps.getLatitude();
					double longitude = gps.getLongitude();
					double al = gps.getAltitude();
					double sp = gps.getspeed();

					txtLat.setText(String.valueOf(latitude));
					txtLon.setText(String.valueOf(longitude));
					txtLon.setText(String.valueOf(al));
					txtLon.setText(String.valueOf(sp));
					String str = "����� ��ġ - \n����: " + latitude + "\n�浵: "
							+ longitude + "\n��: " + al + "\n�浵: " + sp;
					resulttv.setText(str);

					Toast.makeText(
							getApplicationContext(),
							"����� ��ġ - \n����: " + latitude + "\n�浵: " + longitude,
							Toast.LENGTH_LONG).show();
				} else {
					// GPS �� ����Ҽ� �����Ƿ�
					gps.showSettingsAlert();
				}
			}
		});

	}

} // end class MainActivity