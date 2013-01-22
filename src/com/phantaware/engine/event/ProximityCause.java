package com.phantaware.engine.event;

import java.util.ArrayList;

import com.phantaware.engine.entity.Entity;
import com.phantaware.engine.world.GameMap;
import com.phantaware.engine.world.Position;

public class ProximityCause extends Cause
{
	private Entity entity;
	
	private Position p;
	private GameMap m;
	
	private int type;
	private int proximity;
	private boolean diamondCheck;
	private boolean ignoreZ;
	
	public ProximityCause(Entity entity, int type, boolean diamondCheck, boolean ignoreZ)
	{
		if(entity == null)
			throw new NullPointerException();
		this.entity = entity;
		this.type = type;
		this.diamondCheck = diamondCheck;
		this.ignoreZ = ignoreZ;
	}

	public ProximityCause(Position p, GameMap m, int type, boolean diamondCheck, boolean ignoreZ)
	{
		if(p == null || m == null)
			throw new NullPointerException();
		this.type = type;
		this.diamondCheck = diamondCheck;
		this.ignoreZ = ignoreZ;
	}
	
	public ArrayList<Entity> checkCause()
	{
		ArrayList<Entity> output = new ArrayList<Entity>();
		GameMap map = entity!=null ? entity.getMap() : m;
		Position pos = entity!=null? entity.getPos() : p;
		if(map.contains(entity))
		{
			for(int x = (pos.getX()-proximity);x<= (pos.getX()+proximity);x++)
			{
				for(int y = (pos.getY()-proximity);y<= (pos.getY()+proximity);y++)
				{
					for(int z = ignoreZ ? pos.getZ() : (pos.getZ()-proximity);z<= (ignoreZ ? pos.getZ() : (pos.getZ()+proximity));z++)
					{
						int difX = pos.getX()-x;
						int difY = pos.getY()-y;
						int difZ = pos.getZ()-z;
						if(diamondCheck)
						{
							if(Math.abs(difX)+Math.abs(difY)+Math.abs(difZ)<=proximity)
							{
								ArrayList<Entity> entities = ignoreZ ? map.getEntities(new Position(x,y,null)) : map.getEntities(new Position(x,y,z));
								for(Entity e: entities)
								{
									if(e.isType(type))
										output.add(e);
								}
							}
						}
						else
						{
							ArrayList<Entity> entities = ignoreZ ? map.getEntities(new Position(x,y,null)) : map.getEntities(new Position(x,y,z));
							for(Entity e: entities)
							{
								if(e.isType(type))
									output.add(e);
							}
						}
					}
				}
			}
			return output;
		}
		else
		{
			return null;
		}
	}
}
