package com.turki.alwaysonlibrarycontainer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR,-2);

        MyAnalogClock analogClockView = findViewById(R.id.clock);

        analogClockView.setCalendar(calendar);
        analogClockView.setDiameterInDp(400.0f);
        analogClockView.setOpacity(1.0f);
        analogClockView.setShowSeconds(true);
        analogClockView.setColor(Color.BLACK);


    }
}
