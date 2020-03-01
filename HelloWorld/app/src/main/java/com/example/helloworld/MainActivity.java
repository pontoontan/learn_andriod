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
    private Button mBtnRadioButton; // 定义名称
    private Button mBtnCheckBox; // 定义名称

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 引入布局
        setContentView(R.layout.activity_main);

        // 通过 id 找到 btn_textview
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnEditorText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        setLisenners();
    }

    private void setLisenners(){
        Onclick onClick = new Onclick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnEditorText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    // 跳转到 TextViewActivity
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_edittext:
                    // 跳转到 EditTextActivity
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    // 跳转到 RadioButtonActivity
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
            }
            startActivity(intent);
        }
    }

}

