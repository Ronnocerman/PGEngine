package com.phantaware.graphics;

import javax.microedition.khronos.opengles.GL10;

import android.graphics.RectF;

import com.phantaware.engine.inventory.Inventory;

public class InventoryRenderer extends GameRenderer
{
	private Inventory toDraw;
	public InventoryRenderer(Inventory toDraw, RectF viewPosition) {
		super(true,viewPosition);
		this.toDraw = toDraw;
	}

	@Override
	public void onDraw(GL11 gl) {
		// TODO Auto-generated method stub
		
	}

}
