package com.beziercurv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveOnBazierCurv( View view){
        BazierCurv curv = new BazierCurv( 0, 600, 0, 800);
        curv
                .setInterpolator(new LinearInterpolator());
        curv.setDuration(3000);
       // curv.setFillAfter(true);

        findViewById(R.id.move_object).startAnimation(curv);

    }



}
