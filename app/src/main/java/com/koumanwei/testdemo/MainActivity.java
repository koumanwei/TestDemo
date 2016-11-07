package com.koumanwei.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.koumanwei.testdemo.activity.FloatActivity;
import com.koumanwei.testdemo.activity.SimpleFloatActivity;
import com.koumanwei.testdemo.activity.SlideActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * 悬浮停靠
     */
    private Button btnFloat;
    /**
     * 滑动切换
     */
    private Button btnSlide;
    /**
     * 简单悬浮停靠
     */
    private Button btnSimpleSlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListener();
    }

    /**
     * 初始化组件
     */
    private void initViews() {
        btnFloat = (Button) findViewById(R.id.btn_float);
        btnSlide = (Button) findViewById(R.id.btn_slide);
        btnSimpleSlide = (Button) findViewById(R.id.btn_simple_float);

    }

    /**
     * 初始化监听
     */
    private void initListener() {
        btnFloat.setOnClickListener(this);
        btnSlide.setOnClickListener(this);
        btnSimpleSlide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_float:
                startActivity(new Intent(MainActivity.this, FloatActivity.class));
                break;
            case R.id.btn_slide:
                startActivity(new Intent(MainActivity.this, SlideActivity.class));
                break;
            case R.id.btn_simple_float:
                startActivity(new Intent(MainActivity.this, SimpleFloatActivity.class));
                break;
        }
    }
}
