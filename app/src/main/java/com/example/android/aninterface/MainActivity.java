package com.example.android.aninterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);



          tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             tv.animate().rotation(60).setDuration(0);

            }
        });




}
}
