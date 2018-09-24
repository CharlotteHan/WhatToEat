package com.example.charlotte.what_to_eat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Restaurant[] myRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Dummy generator
        myRes = new Restaurant[3];
        myRes[0] = new Restaurant("Niji","sample_image","Sushi bar");
        myRes[1] = new Restaurant("Menpuku","sample_image","Japanese Ramen");
        myRes[2] = new Restaurant("Leek", "sample_image", "ewwww");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cfm = (Button) findViewById(R.id.button);
        cfm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myClick(v); /* my method to call new intent or activity */
            }
        });

    }
    public void myClick(View v) {
        Restaurant currRes = getRes();
        TextView res = (TextView) findViewById(R.id.resName);
        res.setText(currRes.getResName());
        ImageView pic = (ImageView) findViewById(R.id.imageView);
        pic.setImageResource(R.drawable.sample_image);
        TextView dis = (TextView) findViewById(R.id.discription);
        dis.setText(currRes.getDis());
    }

    public Restaurant getRes() {
        Random rand = new Random();
        int index = rand.nextInt(3);
        return myRes[index];
    }
}
