package com.example.dimon_000.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);

        Log.i("MainActivity", "onCreate()");
    }

    @Override
    public void onClick(View v) {
        Button btn = (Button) findViewById(v.getId());
        /*if(tv.getText().toString() == "0")
        {
            tv.setText(btn.getText());
        } else {*/
            tv.setText(tv.getText().toString() + btn.getText());
        //}
        Log.i("MainActivity", tv.getText().toString());
        Toast.makeText(this, btn.getText(), Toast.LENGTH_SHORT).show();
    }
}
