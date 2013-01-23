package com.phantaware.graphics;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;

public class GameView extends GLSurfaceView implements Renderer
{

	public GameView(Context context) {
		super(context);
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
