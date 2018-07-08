# Vector Analog Clock
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-Vector%20Analog%20Clock-green.svg?style=flat )]( https://android-arsenal.com/details/1/7026 )

![Tablet Screenshot](https://github.com/TurkiTAK/vector-analog-clock/blob/master/resized_tablet.png)

A Simple, Customizable VectorAnalogClock View for Android.

Resizable.
Smooth movement.
Tested on various screen sizes and densities.
Supports Custom Vector Assets.
Supports back to API 14.

[Clock Smooth Movement](https://github.com/TurkiTAK/vector-analog-clock/blob/master/phone.gif)


## Usage:

### Add the gradle dependency

``` gradle
dependencies {
    implementation 'turki.alkhateeb:vectoranalogclock:1.0.0'
}
```
### Extend the VectorAnalogClock class
``` java
package com.turki.alwaysonlibrarycontainer;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

import com.turki.vectoranalogclock.VectorAnalogClock;

public class MyVectorClock extends VectorAnalogClock{

    private void init(){
        //use this for the default Analog Clock (recommended)
        initializeSimple();
        
        //or use this if you want to use your own vector assets (not recommended)
        //initializeCustom(faceResourceId, hourResourceId, minuteResourceId, secondResourceId);
    }

    //mandatory constructor
    public MyVectorClock(Context ctx) {
        super(ctx);
        init();
    }

    // the other constructors are in case you want to add the view in XML

    public MyVectorClock(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyVectorClock(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyVectorClock(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
}
```

### Add the view to your layout
Note: XML attributes are not supported currently. Use **WRAP_CONTENT** for both width and height. Instead, use `setDiameterInDp()` and `setDiameterInPixels()` to control the size.

**Add the view to XML or Java**
``` xml
<com.turki.alwaysonlibrarycontainer.MyVectorClock
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/clock"
        android:layout_gravity="center"/>
```


**In your Activity:**
``` java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR,-2);

        MyVectorClock vectorAnalogClock = findViewById(R.id.clock);

        //customization
       vectorAnalogClock.setCalendar(calendar)
                .setDiameterInDp(400.0f)
                .setOpacity(1.0f)
                .setShowSeconds(true)
                .setColor(Color.BLACK);
    }
```

This will be the result:

![Phone Screenshot](https://github.com/TurkiTAK/vector-analog-clock/blob/master/resized_phone.png)
    
That's it!!
Have fun.
    
    
**Twitter:**
[@TurkiAlkhateeb](https://twitter.com/TurkiAlkhateeb)
