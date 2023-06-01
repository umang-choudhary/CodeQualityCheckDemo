package com.demo.codequalitycheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    // incorrect
    private final static String MY_NEW_CONSTANT = "myConstant";

    // correct
    private final static String MY_CONSTANT = "myConstant";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}