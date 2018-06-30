package com.ansem.sqlitelogin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ansem.sqlitelogin.R;

/**
 * Created by delaroy on 3/27/17.
 */
public class UsersActivity extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);
        Button btnCamera = (Button) findViewById(R.id.btnCamera);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome " + nameFromIntent);

        btnCamera.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
               startActivityForResult(intent,0);
           }
        });
    }
}