package com.tops.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.btnPage1) {

            getSupportFragmentManager().beginTransaction().replace(R.id.myFrame, new Blank1Fragment()).commit();
        } else if (view.getId() == R.id.btnPage2) {

            getSupportFragmentManager().beginTransaction().replace(R.id.myFrame, new Blank2Fragment()).commit();
        } else {

            getSupportFragmentManager().beginTransaction().replace(R.id.myFrame, new Blank3Fragment()).commit();
        }
    }
}
