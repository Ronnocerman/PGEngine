package com.phantaware.testgame;

import com.phantaware.engine.EngineManagement;
import com.phantaware.engine.GameLoader;
import com.phantaware.engine.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Game extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameLoader.loadGameSettings(getResources().openRawResource(R.raw.enginesettings));
        EngineManagement.switchMap(MapLoader.loadGameMap(null));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
