package com.madhram.currencyconverter;

import android.app.Application;

import com.madhram.currencyconverter.currency.CourseLoader;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CourseLoader courseLoader = new CourseLoader(getResources().getString(R.string.cbr_json));

        courseLoader.start();
        try {
            courseLoader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}