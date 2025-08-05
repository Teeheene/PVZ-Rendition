package model;

public class Peashooter extends Plant
{
	public Peashooter(Position pos)
	{
		super("Peashooter", 100,20,100,pos);
	}
	
	public int attack()
	{
		return atk;
	}
}
