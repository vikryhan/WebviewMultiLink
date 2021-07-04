package com.webviewmulti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 3 = jumlah dari urls
    String[] urls = new String[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        urls[0] = "https://www.facebook.com/";
        urls[1] = "https://www.instagram.com/";
        urls[2] = "https://www.google.com/";

    }
    public void Facebook(View view) {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("links", urls[0]);
        startActivity(intent);
    }
    public void Instagram(View view) {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("links", urls[1]);
        startActivity(intent);
    }
    public void Google(View view) {
        Intent intent = new Intent(getApplicationContext(), WebviewActivity.class);
        intent.putExtra("links", urls[2]);
        startActivity(intent);
    }

}