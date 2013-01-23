package com.phantaware.graphics;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

import android.graphics.RectF;
import android.opengl.GLSurfaceView.Renderer;

public abstract class GameRenderer implements Renderer
{
	private boolean isDrawn;
	private RectF viewPosition;
	public GameRenderer(boolean initiallyDrawn,RectF viewPosition)
	{
		isDrawn = initiallyDrawn;
		this.viewPosition = viewPosition;
	}
	public abstract void onDraw(GL11 gl);
	public final void onDrawFrame(GL10 gl) {
		//Add scissoring.
		if(isDrawn)
			onDraw((GL11)gl);
	}
	public final void onSurfaceChanged(GL10 gl, int width, int height) {}

	public final void onSurfaceCreated(GL10 gl, EGLConfig config) {}
	
}