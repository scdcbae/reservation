package com.hanbit2007.reservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RadioButton rdCalendar, rdClock;
    CalendarView cvSet;
    TimePicker tpSet;
    Button btSet;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdCalendar = (RadioButton) findViewById(R.id.rdCalendar);
        rdClock = (RadioButton) findViewById(R.id.rdClock);
        cvSet = (CalendarView) findViewById(R.id.cvSet);
        tpSet = (TimePicker) findViewById(R.id.tpSet);
        btSet= (Button) findViewById(R.id.btSet);
        tvYear = (TextView) findViewById(R.id.tvYear);
        tvMonth = (TextView) findViewById(R.id.tvMonth);
        tvDay = (TextView) findViewById(R.id.tvDay);
        tvHour = (TextView) findViewById(R.id.tvHour);
        tvMin = (TextView) findViewById(R.id.tvMin);

        cvSet.setVisibility(View.INVISIBLE);
        tpSet.setVisibility(View.INVISIBLE);
        rdCalendar.setOnClickListener(this);
        rdClock.setOnClickListener(this);
        btSet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.rdCalendar:
                tpSet.setVisibility(View.INVISIBLE);
                cvSet.setVisibility(View.VISIBLE);
                break;
            case R.id.rdClock:
                tpSet.setVisibility(View.VISIBLE);
                cvSet.setVisibility(View.INVISIBLE);
                break;
            case R.id.btSet:
                break;
        }
    }
}
