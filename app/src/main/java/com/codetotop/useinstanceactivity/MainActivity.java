package com.codetotop.useinstanceactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnOpenScreenTwo)
    Button btnOpenScreenTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnOpenScreenTwo)
    void onClickBtnOpenScreenTwo(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
