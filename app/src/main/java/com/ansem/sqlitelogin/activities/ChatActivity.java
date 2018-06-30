package com.ansem.sqlitelogin.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

import com.ansem.sqlitelogin.R;

public class ChatActivity extends AppCompatActivity {

    private ImageButton btncamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        ImageButton btncamera = (ImageButton) findViewById(R.id.btn_camera);
    }
}
