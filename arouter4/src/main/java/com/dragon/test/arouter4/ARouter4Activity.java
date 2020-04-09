package com.dragon.test.arouter4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

public class ARouter4Activity extends AppCompatActivity {

    private Button btnTo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arouter4_main);

        btnTo2 = (Button) findViewById(R.id.btn_to_2);
        btnTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/MyRouter2/ARouter3Activity")
                        .withString("name", "这是第三个Activity")
                        .navigation();
            }
        });
    }
}
