package com.zhhl.ducha.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zhhl.ducha.R;
import com.zhhl.ducha.xuanfu.DragFloatActionButton;

public class MainActivity extends BaseActivity implements View.OnClickListener
{
    private DragFloatActionButton floatbutton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatbutton = findViewById(R.id.floatbutton);
        floatbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
         switch (v.getId())
         {
             case R.id.floatbutton:
                     Intent intent = new Intent(MainActivity.this,HomeReportActivity.class);
                     startActivity(intent);
                 break;
         }
    }
}
