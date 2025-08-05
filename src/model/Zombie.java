package model

public class Zombie
{
	private String name;
	
	private int hp;
	private int atk;
	private int spd;
	
	private Position pos;
	
	public Zombie(String name, int hp, int atk, int spd, Position pos)
	{
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.spd = spd;
		this.pos = pos;
	}
}