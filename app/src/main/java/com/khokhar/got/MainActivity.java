package com.khokhar.got;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

            RecyclerView recyclerView;
            List<Model> main_list;
            RecyclerView.Adapter adapter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            main_list=new ArrayList<>();
             int numberofcolumn = 3;
             recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
             recyclerView.setHasFixedSize(true);
             recyclerView.setLayoutManager(new GridLayoutManager(this, numberofcolumn));

             main_list.add(new Model(R.drawable.jonsnow,"Jon Snow"));
            main_list.add(new Model(R.drawable.daenerys,"Daenerys"));
            main_list.add(new Model(R.drawable.cersei,"Cersi Lannister"));
            main_list.add(new Model(R.drawable.nightking,"Night King"));
            main_list.add(new Model(R.drawable.tyrion,"Tyrion Lannister"));
            main_list.add(new Model(R.drawable.jamie,"Jamie Lannister"));
            main_list.add(new Model(R.drawable.sansa,"Sana Stark"));
            main_list.add(new Model(R.drawable.arya,"Arya Stark"));
            main_list.add(new Model(R.drawable.bran,"Bran Stark"));
            main_list.add(new Model(R.drawable.baelish,"Petyr Baelish"));
            main_list.add(new Model(R.drawable.jorah,"Jorah Mormont"));
            main_list.add(new Model(R.drawable.theon,"Theon Greyjoy"));

            adapter=new CustomAdapter(main_list,getApplicationContext());
            recyclerView.setAdapter(adapter);
            overridePendingTransition(R.anim.slide_in,R.anim.slide_out);




        }
    }



//    theo=(ImageView)findViewById(R.id.theo);
//        theo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
//                myIntent.putExtra("value", getString(R.string.theon_description));
//                myIntent.putExtra("main_name", getString(R.string.m_theon));
//                myIntent.putExtra("real_name", getString(R.string.r_name_theon));
//
//
//                Bundle bundle= new Bundle();
//                bundle.putInt("image",R.drawable.m_theon);
//                myIntent.putExtras(bundle);
//                startActivity(myIntent);
//
//
//            }
//        });
//
//
//        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
//
//    }
//}
