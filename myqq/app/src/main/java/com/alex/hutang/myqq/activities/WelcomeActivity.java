package com.alex.hutang.myqq.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.alex.hutang.myqq.R;
import com.alex.hutang.myqq.service.GetMsgService;


public class WelcomeActivity extends AppCompatActivity {
    private Context mContext;
    private ImageView mImageView;
    private Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mContext = this;
        mImageView = (ImageView) findViewById(R.id.welcome_img);
        init();
    }


    private void init(){
        final SharedPreferences share = getSharedPreferences("data", MODE_PRIVATE);
        edit=share.edit();
        Intent service = new Intent(this, GetMsgService.class);
    }
}
