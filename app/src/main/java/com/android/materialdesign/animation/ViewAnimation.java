package com.android.materialdesign.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;

import com.android.materialdesign.R;

public class ViewAnimation extends AppCompatActivity {

    AlphaAnimation alphaAnimation;
    ScaleAnimation scaleAnimation;
    TranslateAnimation translateAnimation;
    RotateAnimation rotateAnimation;
    AnimationSet animationSet;
    CheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        mCheckBox = findViewById(R.id.checkBox);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.set:{
                if(!mCheckBox.isChecked()) {
                    animationSet = new AnimationSet(true);
                    animationSet.addAnimation(rotateAnimation);
                    animationSet.addAnimation(scaleAnimation);
                    animationSet.addAnimation(translateAnimation);
                    animationSet.addAnimation(alphaAnimation);
                    view.startAnimation(animationSet);
                }else{
                    view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.set_anim));
                }
                break;
            }
            case R.id.translate:{
                if(!mCheckBox.isChecked()) {
                    translateAnimation = new TranslateAnimation(Animation.ABSOLUTE, 0, Animation.RELATIVE_TO_PARENT, 1,
                            Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 100);
                    translateAnimation.setDuration(1000);
                    view.startAnimation(translateAnimation);
                }else{
                    view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.translate_anim));
                }
                break;
            }
            case R.id.rotate:{
                if(!mCheckBox.isChecked()) {
                    rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, .5f,
                            Animation.RELATIVE_TO_SELF, .5f);
                    rotateAnimation.setDuration(1000);
                    view.startAnimation(rotateAnimation);
                }else{
                    view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate_anim));
                }
                break;
            }
            case R.id.alpha:{
                if(!mCheckBox.isChecked()) {
                    alphaAnimation = new AlphaAnimation(1, 0);
                    alphaAnimation.setDuration(1000);
                    view.startAnimation(alphaAnimation);
                }else{
                    view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.alpha_anim));
                }
                break;
            }
            case R.id.scale:{
                if(!mCheckBox.isChecked()) {
                    scaleAnimation = new ScaleAnimation(1, 2, 1, 2);
                    scaleAnimation.setDuration(1000);
                    view.startAnimation(scaleAnimation);
                }else{
                    view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_anim));
                }
                break;
            }

        }
    }
}
