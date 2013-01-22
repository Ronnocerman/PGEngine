package com.phantaware.engine.event;

public class ArbitraryCondition extends Condition 
{
	private boolean conditionMet;
	public ArbitraryCondition(boolean conditionMet)
	{
		this.conditionMet = conditionMet;
	}
	public boolean conditionMet()
	{
		return conditionMet;
	}
	public void setConditionMet(boolean met)
	{
		conditionMet = met;
	}
}
