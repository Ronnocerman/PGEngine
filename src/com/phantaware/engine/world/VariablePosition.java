package com.phantaware.engine.world;

public class VariablePosition extends Position
{
	private Positioned p;
	public VariablePosition(Positioned p)
	{
		super(p.getPos().getX(),p.getPos().getY(),p.getPos().getZ());
		this.p = p;
	}
	public Integer getX()
	{
		return p.getPos().getX();
	}
	public Integer getY()
	{
		return p.getPos().getY();
	}
	public Integer getZ()
	{
		return p.getPos().getZ();
	}
}
