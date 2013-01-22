package com.phantaware.engine;

import java.util.ArrayList;

import com.phantaware.engine.event.Effect;
import com.phantaware.engine.world.GameMap;

public class EngineManagement 
{
	static GameSettings settings;	//Intentionally default scope for loading in GameLoader
	private static GameMap currentMap;
	ArrayList<Effect> onMapExit;
	ArrayList<Effect> onMapStart;
	ArrayList<Effect> onTurnEnd;
	ArrayList<Effect> onTurnStart;
	public static boolean isTurnBased()
	{
		return settings.turnBased;
	}
	public static void switchMap(GameMap nextMap)
	{
		//Do End Effects on last map
		currentMap = nextMap;
	}
	public static void endTurn()
	{
		
	}
}
