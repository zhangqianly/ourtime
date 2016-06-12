package com.zq.ourtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ourtime = (TextView) findViewById(R.id.our_time);
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            Date now = new Date();
            Date ago = dateFormat.parse("20140128");

            long diff = now.getTime() - ago.getTime();
            long days = diff / (24 * 3600 * 1000);

            ourtime.setText(days + "天");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
