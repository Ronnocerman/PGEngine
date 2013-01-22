package com.phantaware.testgame;

import com.phantaware.engine.entity.BarRepresentable;
import com.phantaware.engine.entity.Stat;


public class Health implements Stat,BarRepresentable 
{
	private int maxHealth;
	private int curHealth;
	public Health(int curHealth,int maxHealth) 
	{
		this.curHealth = curHealth;
		this.maxHealth = maxHealth;
	}
	
	public int getQualityID()
	{
		return QualityID.HEALTH_ID;
	}

	public int getMaxValue() {
		return maxHealth;
	}

	public int getMinValue() {
		return 0;
	}

	public int getCurValue() {
		return curHealth;
	}

}
