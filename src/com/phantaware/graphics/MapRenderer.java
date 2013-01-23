package com.phantaware.graphics;

import javax.microedition.khronos.opengles.GL10;

import android.graphics.RectF;

import com.phantaware.engine.world.GameMap;

public class MapRenderer extends GameRenderer
{
	private GameMap toRender;
	public MapRenderer(GameMap toRender,RectF viewPosition) {
		super(true,viewPosition);
		this.toRender = toRender;
	}
	@Override
	public void onDraw(GL10 gl) {
		// TODO Auto-generated method stub
		
	}

}