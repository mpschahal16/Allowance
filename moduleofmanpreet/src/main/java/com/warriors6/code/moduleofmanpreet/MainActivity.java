package com.warriors6.code.moduleofmanpreet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast,makeText(this,"Hello",Toast.LENGTH_SHORT).show();
    }
}
