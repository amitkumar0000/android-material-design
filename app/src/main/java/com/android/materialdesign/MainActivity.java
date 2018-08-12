package com.android.materialdesign;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.materialdesign.animation.PropertyAnimation;
import com.android.materialdesign.animation.ViewAnimation;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordinatorLayout = findViewById(R.id.coordinator);
        FABAction();
    }


    void FABAction(){
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinatorLayout, "Here's a Snackbar", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.viewanimation:{
                startActivity(new Intent(this, ViewAnimation.class));
                break;
            }
            case R.id.propertyanimation:{
                startActivity(new Intent(this, PropertyAnimation.class));
                break;
            }
        }
    }
}
