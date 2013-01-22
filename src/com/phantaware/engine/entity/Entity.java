package com.phantaware.engine.entity;

import java.util.ArrayList;

import com.phantaware.engine.Identifiable;
import com.phantaware.engine.world.GameMap;
import com.phantaware.engine.world.Position;
import com.phantaware.engine.world.Positioned;

public abstract class Entity implements Identifiable,Positioned
{
	private final Position pos;
	private GameMap map;
	private ArrayList<Integer> types;
	public Entity(Position p)
	{
		if(p.getX()==null||p.getY()==null||p.getZ()==null)
			throw new NullPointerException();
		pos = p;
	}
	public Position getPos()
	{
		return pos;
	}
	public boolean isType(int type)
	{
		return types.contains(type);
	}
	public GameMap getMap()
	{
		return map;
	}
}