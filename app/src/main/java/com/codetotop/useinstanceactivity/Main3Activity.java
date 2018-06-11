package com.codetotop.useinstanceactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main3Activity extends AppCompatActivity {
    @BindView(R.id.btnBack)
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnBack)
    void onBack(){
        finish();
        Main2Activity.instance.finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Main2Activity.instance.finish();
    }
}
