package com.zad7.artifact;

public class Square extends AbstractShape
{
	public double length;
	
	public double field(double length)
		{
		return length*length;
		}
	public double circuit(double length)
		{
		return 4*length;
		}

}
