package com.dragon.test.arouter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/MyRouter/ARouter2Activity")
public class ARouter2Activity extends AppCompatActivity {

    @Autowired
    TestData data;

    TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arouter_main);
        ARouter.getInstance().inject(this);
        tvContent = findViewById(R.id.tv_content);
        if (data != null) {
            tvContent.setText(data.getData() + "_" + data.getNum());
        }
    }

}
