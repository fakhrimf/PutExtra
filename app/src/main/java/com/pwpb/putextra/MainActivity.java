package com.pwpb.putextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPindah = findViewById(R.id.btnPindah);


        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentClick();
            }
        });
    }

    public void intentClick(){
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this, intentActivity.class);
        intent.putExtra("text", text);
        startActivity(intent);
    }
}
