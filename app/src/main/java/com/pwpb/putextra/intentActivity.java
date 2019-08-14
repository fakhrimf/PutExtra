package com.pwpb.putextra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

//        String text = getIntent().getStringExtra("text");
//        tv.setText(text);
        TextView tv = findViewById(R.id.text);

        Bundle bandel = getIntent().getExtras();
        String s = bandel.getString("text");
        tv.setText(s);
    }
}
