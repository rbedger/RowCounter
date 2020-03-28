package com.robenheimer.rowcounter;

import android.app.Application;

// appComponent lives in the Application class to share its lifecycle
public class RowCounter extends Application {
    // Reference to the application graph that is used across the entire app
    ApplicationComponent appComponent = DaggerApplicationComponent.create();
}
