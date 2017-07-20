package com.example.alex.prviandroid;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton dugme1;
    boolean kliknuto = false;
    RelativeLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dugme1 = (ImageButton) findViewById(R.id.prvoDugme);
        layout = (RelativeLayout)findViewById(R.id.relativniLayout);
        dugme1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                if(kliknuto == false) {


                    Toast.makeText(getApplicationContext(), "Ovo je poruka", Toast.LENGTH_SHORT).show();
                    layout.setBackgroundResource(R.drawable.background_hitman);
                    kliknuto = true;
                }

                else {
                    Toast.makeText(getApplicationContext(), "Ovo je drugi deo if-a!", Toast.LENGTH_SHORT).show();
                    layout.setBackgroundResource(R.drawable.background);
                    kliknuto = false;
                }

                }





        });

    }
}
