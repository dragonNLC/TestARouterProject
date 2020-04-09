package com.dragon.test.arouter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.dragon.test.arouter2.TestData;
import com.dragon.test.arouter4.ARouter4Activity;

public class MainActivity extends AppCompatActivity {

    private Button btnTo1;
    private Button btnTo2;
    private Button btnTo3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTo1 = (Button) findViewById(R.id.btn_to_1);
        btnTo2 = (Button) findViewById(R.id.btn_to_2);
        btnTo3 = (Button) findViewById(R.id.btn_to_3);

        btnTo1.setOnClickListener(v -> {
            ARouter.getInstance().build("/MyRouter/ARouter2Activity")
                    .withObject("data", new TestData("测试", 20)).navigation();
        });

        btnTo2.setOnClickListener(v -> {
            ARouter.getInstance().build("/MyRouter2/ARouter3Activity")
                    .withString("name", "这是第三个Activity")
                    .withInt("age", 20)
                    .navigation();
        });

        btnTo3.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ARouter4Activity.class));
        });

    }


}
