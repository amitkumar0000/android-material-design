package com.android.materialdesign;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.materialdesign.animation.PropertyAnimation;
import com.android.materialdesign.animation.ViewAnimation;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    TextView textView;
    ImageView appleView, tajView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordinatorLayout = findViewById(R.id.coordinator);
        FABAction();
        textView =  findViewById(R.id.helloWorldText);
        appleView = findViewById(R.id.apple);
        tajView = findViewById(R.id.taj);
    }


    void FABAction(){
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinatorLayout, "Here's a Snackbar", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

                int colorFrom = getResources().getColor(R.color.colorPrimary);
                int colorTo = getResources().getColor(R.color.colorAccent);
                ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
                colorAnimation.setDuration(1000); // milliseconds
                colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        textView.setBackgroundColor((int) animator.getAnimatedValue());
                        textView.setTextColor(getResources().getColor(R.color.colorPrimary));
                    }

                });
                colorAnimation.start();
            }
        });
    }

    boolean isClick = false;
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
            case R.id.crossFade:{
                if(isClick) {
                    appleView.animate().alpha(0f).setDuration(2000);
                    tajView.animate().alpha(1f).setDuration(2000);
                    isClick = false;
                }else{
                    tajView.animate().alpha(0f).setDuration(2000);
                    appleView.animate().alpha(1f).setDuration(2000);
                    isClick = true;
                }
                break;
            }
        }
    }
}
