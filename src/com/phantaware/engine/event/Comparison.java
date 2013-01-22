package com.phantaware.engine.event;

public class Comparison extends Condition 
{
	public static final int GREATER_THAN = 0;
	public static final int GREATER_THAN_OR_EQUAL = 1;
	public static final int EQUAL_TO = 2;
	public static final int LESS_THAN_OR_EQUAL = 3;
	public static final int LESS_THAN = 4;
	private GameComparable comp1;
	public final int comparison;
	private GameComparable comp2;

	public Comparison(GameComparable comparable, int comparison,GameComparable comparable2) 
	{
		this.comp1 = comparable;
		if(comparison<0||comparison>0)
			throw new IllegalArgumentException();
		this.comparison = comparison;
		this.comp2 = comparable2;
	}

	public boolean conditionMet() 
	{
		int value1 = 0,value2 = 0;
		if(comp1 instanceof GameCurComparable)
			value1 = ((GameCurComparable)comp1).getCurValue();
		if(comp1 instanceof GameMaxComparable)
			value1 = ((GameMaxComparable)comp1).getMaxValue();
		if(comp1 instanceof GameMinComparable)
			value1 = ((GameMinComparable)comp1).getMinValue();
		if(comp2 instanceof GameCurComparable)
			value2 = ((GameCurComparable)comp2).getCurValue();
		if(comp2 instanceof GameMaxComparable)
			value2 = ((GameMaxComparable)comp2).getMaxValue();
		if(comp2 instanceof GameMinComparable)
			value2 = ((GameMinComparable)comp2).getMinValue();
		switch(comparison)
		{
		case GREATER_THAN:
			return value1>value2;
		case GREATER_THAN_OR_EQUAL:
			return value1>=value2;
		case EQUAL_TO:
			return value1==value2;
		case LESS_THAN_OR_EQUAL:
			return value1<=value2;
		case LESS_THAN:
			return value1<value2;
		default:
			return false;
		}
	}
}
