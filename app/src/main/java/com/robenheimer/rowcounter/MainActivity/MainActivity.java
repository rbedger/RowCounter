package com.robenheimer.rowcounter.MainActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.robenheimer.rowcounter.MainActivity.dummy.DummyContent;
import com.robenheimer.rowcounter.R;

public class MainActivity extends AppCompatActivity implements ProjectFragment.OnListFragmentInteractionListener {
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        loadFragment(new ProjectFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.navigation_projects:
                    toolbar.setTitle(R.string.title_fragment_projects);
                    loadFragment(new ProjectFragment());
                    return true;

                case R.id.navigation_settings:
                    toolbar.setTitle(R.string.title_fragment_settings);
                    loadFragment(new SettingsFragment());
                    return true;

                default:
                    throw new UnsupportedOperationException();
            }
        }
    };

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_container, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
