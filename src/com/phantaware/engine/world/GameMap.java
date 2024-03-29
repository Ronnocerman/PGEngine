package com.phantaware.engine.world;

import java.util.ArrayList;
import java.util.TreeMap;

import com.phantaware.engine.entity.Entity;

public class GameMap 
{
	private TreeMap<Position,ArrayList<Entity>> map = new TreeMap<Position,ArrayList<Entity>>();
	private ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public void addEntity(Entity e)
	{
		ArrayList<Entity> spot;
		if(!entities.contains(e))
		{
			if((spot=map.get(e.getPos()))!=null)
				spot.add(e);
			else
			{
				spot = new ArrayList<Entity>();
				spot.add(e);
				map.put(e.getPos(),spot);
			}
			entities.add(e);
		}
	}
	public ArrayList<Entity> getEntities(Position p)
	{
		return new ArrayList<Entity>(map.get(p));
	}
	public ArrayList<Entity> getEntities()
	{
		return new ArrayList<Entity>(entities);
	}
	public boolean contains(Entity e)
	{
		if(map.containsKey(e.getPos()))
		{
			return map.get(e.getPos()).contains(e);
		}
		return false;
	}
	
}