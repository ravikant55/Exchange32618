package com.affwl.exchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {

    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        android.support.v7.widget.Toolbar toolbar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
    }
}
