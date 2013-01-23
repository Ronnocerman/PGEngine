package com.phantaware.testgame;

import com.phantaware.engine.EngineManagement;
import com.phantaware.engine.GameLoader;
import com.phantaware.engine.R;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.view.Menu;

public class Game extends Activity {
	private GLSurfaceView mGLSurfaceView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mGLSurfaceView = new GLSurfaceView(this);
        final ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        final ConfigurationInfo configurationInfo = activityManager.getDeviceConfigurationInfo();
        final boolean supportsES2 = configurationInfo.reqGlEsVersion >= 0x20000;
        
        if(supportsES2)
        {
        	mGLSurfaceView.setEGLContextClientVersion(2);
        	
        	mGLSurfaceView.setRenderer(renderer)
        }
        
        GameLoader.loadGameSettings(getResources().openRawResource(R.raw.enginesettings));
        EngineManagement.switchMap(MapLoader.loadGameMap(null));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
