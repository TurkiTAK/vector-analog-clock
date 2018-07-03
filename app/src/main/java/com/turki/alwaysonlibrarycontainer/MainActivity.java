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
        calendar.add(Calendar.HOUR, -2);

        MyAnalogClock vectorAnalogClock = findViewById(R.id.clock);

        vectorAnalogClock.setCalendar(calendar)
                .setDiameterInDp(400.0f)
                .setOpacity(1.0f)
                .setShowSeconds(true)
                .setColor(Color.BLACK);

    }
}
