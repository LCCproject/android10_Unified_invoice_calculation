package com.example.a10_unified_invoice_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class testH10_3 extends AppCompatActivity {

    private TextView result2;
    String Num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h103);
        result2 = (TextView)findViewById(R.id.result2);
        Intent intent =this.getIntent();
        String Money = intent.getStringExtra("Money");
        Num = intent.getStringExtra("Num");
        result2.setText("中獎金額："+Money);
    }

    public void back(View view) {
        Intent intent = new Intent();
        intent.setClass(testH10_3.this, testH10.class);
        startActivity(intent);
        testH10_3.this.finish();
    }

    public void backnum(View view) {
        Intent intent = new Intent();
        intent.setClass(testH10_3.this, testH10_2.class);
        intent.putExtra("Num",Num);
        startActivity(intent);
        testH10_3.this.finish();
    }
}