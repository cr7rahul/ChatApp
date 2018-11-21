package com.app.personal.rahul.chatapp.utils;

import android.app.Application;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF",
                "fonts/ColabLig.otf.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf
    }
}
