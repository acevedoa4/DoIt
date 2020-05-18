package com.example.myapplicationtest;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This is the main activity where the main screen is. From here, all activites can be accessed.
        Button butt1=(Button)findViewById(R.id.button);
        Button butt2=(Button)findViewById(R.id.button2);
        Button butt3=(Button)findViewById(R.id.button3);


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this,Second.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2= new Intent(MainActivity.this,Third.class);
                startActivity(int2);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3= new Intent(MainActivity.this,Fourth.class);
                startActivity(int3);
            }
        });

    }

}
