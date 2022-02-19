package com.khokhar.got;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fscreen extends AppCompatActivity {
    Button cd1;
    Button ab1;
    Button rev1;
    Button spoil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fscreen);

        cd1=(Button)findViewById(R.id.cd1);
        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Fscreen.this, MainActivity.class);
                startActivity(i);
            }
        });

        ab1=(Button)findViewById(R.id.ab1);
        ab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Fscreen.this, about.class);
                startActivity(i);
            }
        });

        rev1=(Button)findViewById(R.id.rev1);
        rev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Fscreen.this, Review.class);
                startActivity(i);

                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
                }
        });

        spoil1=(Button)findViewById(R.id.spoil1);
        spoil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Fscreen.this, Review.class);
                startActivity(i);

                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });

    }
}
