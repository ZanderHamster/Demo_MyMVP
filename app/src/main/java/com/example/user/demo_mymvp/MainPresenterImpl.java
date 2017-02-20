package com.example.user.demo_mymvp;

import android.text.TextUtils;
import android.util.Log;

public class MainPresenterImpl implements MainPresenter{
    public MainView mainView;

    public MainPresenterImpl(MainView mainView){
        this.mainView=mainView;
    }

    @Override
    public void validate(String username, String password) {
        if(TextUtils.isEmpty(username)){
            Log.d("TestLog","all bad");
        }else Log.d("TestLog","all ok");
    }
}
