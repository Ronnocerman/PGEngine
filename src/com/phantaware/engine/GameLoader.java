package com.phantaware.engine;

import java.io.InputStream;
import java.util.Scanner;

public class GameLoader 
{
	public static void loadGameSettings(InputStream inStream)
	{
		boolean turnBased = false;
		Scanner in = new Scanner(inStream);
		try
		{
			while(in.hasNextLine())
			{
				String s = in.nextLine();
				if(s.startsWith("TURNBASED"))
				{
						turnBased = Boolean.valueOf(s.split(".")[1]);
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			throw ex;
			//TODO Improper Formatting Error
		}
		EngineManagement.settings = new GameSettings(turnBased);
	}
}
