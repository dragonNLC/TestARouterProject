package com.dragon.test.arouter3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/MyRouter2/ARouter3Activity")
public class ARouter3Activity extends AppCompatActivity {

    private TextView tvContent;
    private TextView tvContent2;

    @Autowired
    String name;
    @Autowired(name = "age")
    int ages;
    //不支持private类型
    //ARouter::Compiler An exception is encountered, [The inject fields CAN NOT BE 'private'!!! please check field [content] in class [com.dragon.test.arouter3.ARouter3Activity]]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_arouter3_main);
        tvContent = (TextView) findViewById(R.id.tv_content);
        tvContent2 = (TextView) findViewById(R.id.tv_content2);

        tvContent.setText(name);
        tvContent2.setText(String.valueOf(ages));
    }
}
