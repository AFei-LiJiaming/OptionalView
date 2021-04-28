package com.practice.optionaldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    OptionalView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (OptionalView) findViewById(R.id.optional);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!view.isDrag()){
                    Toast.makeText(MainActivity.this, "不要戳我了！！！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}