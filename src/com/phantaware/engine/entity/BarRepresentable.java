package com.phantaware.engine.entity;

import com.phantaware.engine.event.GameMinComparable;

public interface BarRepresentable extends FractionRepresentable,GameMinComparable
{
	public int getMaxValue();
	public int getMinValue();
	public int getCurValue();
}
