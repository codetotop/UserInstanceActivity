package com.codetotop.useinstanceactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.btnOpenScreenThree)
    Button btnOpenScreenThree;
    static Main2Activity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        instance = this;
    }

    @OnClick(R.id.btnOpenScreenThree)
    void onClickOpenScreenThree() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        instance = null;
    }
}
