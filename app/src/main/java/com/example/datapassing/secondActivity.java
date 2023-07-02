package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView nameTextView,mobileTextView;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        nameTextView = findViewById( R.id.nameText );
        mobileTextView = findViewById( R.id.mobileText );
        nextBtn = findViewById( R.id.nextBtn );

        String username = getIntent().getStringExtra( "nameUser" );
        String usermobile = getIntent().getStringExtra( "mobileUser" );


        nameTextView.setText(username );
        mobileTextView.setText( usermobile );

        nextBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(secondActivity.this,videoplayer3.class);
                startActivity( intent );
            }
        } );

            }
        }


