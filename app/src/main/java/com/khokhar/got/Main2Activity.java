package com.khokhar.got;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
        TextView tv2;
        ImageView i1;
        TextView m_name;
        TextView r_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i1=(ImageView)findViewById(R.id.i1);
        tv2=(TextView)findViewById(R.id.tv2);
        m_name=(TextView)findViewById(R.id.m_name);
        r_name=(TextView)findViewById(R.id.r_name);


        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");
        i1.setImageResource(pic);

        Intent intent = getIntent();
        String fName = intent.getStringExtra("value");
        tv2.setText(fName);

        String m1=intent.getStringExtra("main_name");
        m_name.setText(m1);

        String r1= intent.getStringExtra("real_name");
        r_name.setText(r1);

        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

    }
}
