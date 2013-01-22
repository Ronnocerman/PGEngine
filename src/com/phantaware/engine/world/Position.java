package com.phantaware.engine.world;

import java.util.Comparator;

public class Position implements Comparator<Position>, Comparable<Position>
{
	private Integer x,y,z;
	public Position(Integer x, Integer y, Integer z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int compareTo(Position another) 
	{
		return compare(this,another);
	}
	public int compare(Position lhs, Position rhs) {
		int lhsX = lhs.x==null?Integer.MIN_VALUE:lhs.x;
		int lhsY = lhs.y==null?Integer.MIN_VALUE:lhs.y;
		int lhsZ = lhs.z==null?Integer.MIN_VALUE:lhs.z;
		int rhsX = rhs.x==null?Integer.MIN_VALUE:rhs.x;
		int rhsY = rhs.y==null?Integer.MIN_VALUE:rhs.y;
		int rhsZ = rhs.z==null?Integer.MIN_VALUE:rhs.z;
		if(lhsX<rhsX)
			return 1;
		else if(lhsX>rhsX)
			return -1;
		else
		{
			if(lhsY<rhsY)
				return 1;
			else if(lhsY>rhsY)
				return -1;
			else
			{
				if(lhsZ>rhsZ)
					return 1;
				else if(lhsZ<rhsZ)
					return -1;
				else
					return 0;
			}
		}
	}
	public boolean equals(Position p)
	{
		if(x == null || p.x == null || x.equals(p.x))
			if(y == null || p.y == null || y.equals(p.y))
				if(z == null || p.z == null || z.equals(p.z))
					return true;
		return false;
	}
	public Integer getX()
	{
		return x;
	}
	public Integer getY()
	{
		return y;
	}
	public Integer getZ()
	{
		return z;
	}
}
