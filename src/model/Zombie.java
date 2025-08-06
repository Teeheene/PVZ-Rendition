package model;

public class Zombie
{
	protected String name;
	protected int hp;
	protected int atk;
	protected int spd;
	
	private Position pos;
	
	public Zombie(String name, int hp, int atk, int spd, Position pos)
	{
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.spd = spd;
		this.pos = pos;
	}
	
	public String getName() { return name; }
	
	public void move()
	{
		pos.moveLeft(spd);
	}
	
	public void takeDamage(int damage)
	{
		hp -= damage;
	}
	
	public boolean isDead()
	{
		return hp <= 0;
	}
}