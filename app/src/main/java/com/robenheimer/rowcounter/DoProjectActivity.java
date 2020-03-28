package com.robenheimer.rowcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.robenheimer.rowcounter.ui.doproject.DoProjectFragment;

public class DoProjectActivity extends AppCompatActivity {
    public static final String EXTRA_PROJECT_ID = "com.robenheimer.rowcounter.DoProject.ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.do_project_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, DoProjectFragment.newInstance())
                    .commitNow();
        }
    }
}
