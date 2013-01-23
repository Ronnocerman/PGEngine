package com.phantaware.graphics;

import java.util.ArrayList;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;

public class GameView extends GLSurfaceView implements Renderer
{
	private ArrayList<GameRenderer> screens = new ArrayList<GameRenderer>();
	public GameView(Context context) {
		super(context);
	}
	public void addScreen(GameRenderer r)
	{
		if(!screens.contains(r))
			screens.add(r);
	}
	
	public void removeScreen(GameRenderer r)
	{
		if(screens.contains(r))
			screens.remove(r);
	}
	
	public ArrayList<GameRenderer> getScreens()
	{
		return new ArrayList<GameRenderer>(screens);
	}

	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub
		
	}

	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		// TODO Auto-generated method stub
		
	}

}
