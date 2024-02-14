package com.example.android.miwok;

import android.app.Application;

public class MiwokApplication extends Application {

    private final AppContainer appContainer = new AppContainer();

    public AppContainer getAppContainer() {
        return appContainer;
    }
}
