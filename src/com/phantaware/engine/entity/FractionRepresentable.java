package com.phantaware.engine.entity;

import com.phantaware.engine.event.GameMaxComparable;

public interface FractionRepresentable extends ValueRepresentable,GameMaxComparable
{
	public int getMaxValue();
	public int getCurValue();
}
