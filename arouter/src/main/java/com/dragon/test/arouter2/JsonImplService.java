package com.dragon.test.arouter2;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.google.gson.Gson;

import java.lang.reflect.Type;

@Route(path = "/json/myParse")
public class JsonImplService implements SerializationService {

    private Gson mGSon;

    @Override
    public <T> T json2Object(String input, Class<T> clazz) {
        return mGSon.fromJson(input, clazz);
    }

    @Override
    public String object2Json(Object instance) {
        return mGSon.toJson(instance);
    }

    @Override
    public <T> T parseObject(String input, Type clazz) {
        return mGSon.fromJson(input, clazz);
    }

    @Override
    public void init(Context context) {
        mGSon = new Gson();
    }

}
