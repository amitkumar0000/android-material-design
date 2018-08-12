package com.android.materialdesign.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.CheckBox;

import com.android.materialdesign.R;

public class PropertyAnimation extends AppCompatActivity {

    CheckBox mCheckBox;
    ObjectAnimator alphaAnimation;
    ObjectAnimator translateAnimation;
    AnimatorSet setAnimation;
    ObjectAnimator scaleAnimation;
    ObjectAnimator rotateAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        mCheckBox = findViewById(R.id.checkBox);
    }

    public void onClick(View view){
            switch (view.getId()){
                case R.id.set:{
                    if(mCheckBox.isChecked()){
                        Animator animator = AnimatorInflater.loadAnimator(PropertyAnimation.this,R.animator.combo);
                        animator.setTarget(view);
                        animator.start();
                    }else {
                       setAnimation = new AnimatorSet();
                       setAnimation.play(translateAnimation).after(alphaAnimation).before(rotateAnimation).with(scaleAnimation);
                       setAnimation.start();
                    }
                    break;
                }
                case R.id.translate:{
                    if(mCheckBox.isChecked()){
                        Animator animator = AnimatorInflater.loadAnimator(PropertyAnimation.this,R.animator.move);
                        animator.setTarget(view);
                        animator.start();
                    }else {
                        translateAnimation = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 800);
                        translateAnimation.setDuration(1000);
                        translateAnimation.setRepeatCount(1);
                        translateAnimation.setRepeatMode(ValueAnimator.REVERSE);
                        translateAnimation.start();
                    }
                    break;
                }
                case R.id.rotate:{
                    if(mCheckBox.isChecked()){
                        Animator animator = AnimatorInflater.loadAnimator(PropertyAnimation.this,R.animator.spin);
                        animator.setTarget(view);
                        animator.start();
                    }else {
                        rotateAnimation = ObjectAnimator.ofFloat(view, View.ROTATION, 180);
                        rotateAnimation.setDuration(1000);
                        rotateAnimation.setRepeatCount(1);
                        rotateAnimation.setRepeatMode(ValueAnimator.REVERSE);
                        rotateAnimation.start();
                    }
                    break;
                }
                case R.id.alpha:{
                    if(mCheckBox.isChecked()){
                        Animator animator = AnimatorInflater.loadAnimator(PropertyAnimation.this,R.animator.fade);
                        animator.setTarget(view);
                        animator.start();
                    }else{
                        alphaAnimation = ObjectAnimator.ofFloat(view,View.ALPHA,0);
                        alphaAnimation.setRepeatCount(1);
                        alphaAnimation.setDuration(1000);
                        alphaAnimation.setRepeatMode(ValueAnimator.REVERSE);
                        alphaAnimation.start();
                    }
                    break;
                }
                case R.id.scale:{
                    if(mCheckBox.isChecked()){
                        Animator animator = AnimatorInflater.loadAnimator(PropertyAnimation.this,R.animator.scale);
                        animator.setTarget(view);
                        animator.start();
                    }else{
                        PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat(View.SCALE_X,1);
                        PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat(View.SCALE_Y,2);
                        scaleAnimation = ObjectAnimator.ofPropertyValuesHolder(view,pvhX,pvhY);
                        scaleAnimation.setRepeatCount(1);
                        scaleAnimation.setDuration(1000);
                        scaleAnimation.setRepeatMode(ValueAnimator.REVERSE);
                        scaleAnimation.start();
                    }
                    break;
                }

            }
    }

}
