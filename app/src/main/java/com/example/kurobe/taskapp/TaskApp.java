package com.example.kurobe.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by kurobe on 2017/07/07.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
