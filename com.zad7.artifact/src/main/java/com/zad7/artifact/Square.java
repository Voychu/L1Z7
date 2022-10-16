package com.zad7.artifact;

public class Square extends Shape
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
