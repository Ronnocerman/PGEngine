package com.phantaware.engine.event;

import com.phantaware.engine.world.Position;

public class PositionComparison extends Condition
{
	Position a;
	Position b;
	public PositionComparison(Position a, Position b)
	{
		this.a = a;
		this.b = b;
	}
	
	public boolean conditionMet() {
		return a.equals(b);
	}

}
