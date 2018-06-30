package com.ansem.sqlitelogin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.ansem.sqlitelogin.R;

/**
 * Created by delaroy on 3/27/17.
 */
public class UsersActivity extends AppCompatActivity {
    private final AppCompatActivity activity = UsersActivity.this;
    private ImageButton btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

       // textViewName = (TextView) findViewById(R.id.text1);
        ImageButton btnContact = (ImageButton) findViewById(R.id.btn4);
        //ImageView imageView = (ImageView) findViewById(R.id.imageView);

        //String nameFromIntent = getIntent().getStringExtra("EMAIL");
        //textViewName.setText("Welcome " + nameFromIntent);

        btnContact.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent intent = new Intent(activity,ChatActivity.class);
               startActivityForResult(intent,0);
           }
        });
    }
}