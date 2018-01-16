package com.example.usuario.menupreferencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class SettingsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        loadSettings();
    }

    private void loadSettings() {
        getFragmentManager().beginTransaction()
                .replace(R.id.flSettings, new SettingsFragment())
                .commit();
    }


}
