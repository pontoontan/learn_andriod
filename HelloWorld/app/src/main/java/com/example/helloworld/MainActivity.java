package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 申明 Button 组件
    private Button mBtnTextView; // 定义名称
    private Button mBtnEditorText; // 定义名称

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 引入布局
        setContentView(R.layout.activity_main);
        // 通过 id 找到 btn_textview
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        // 设置一个点击事件
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 TextView 演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnEditorText = (Button) findViewById(R.id.btn_edittext);
        mBtnEditorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 TextView 演示界面
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });




    }
}
