public class Plant
{
	private String name; 
	
	//stats
	private int hp;
	private int atk;
	private int sunCost;
	
	//board pos
	private Position pos;
	
	public Plant(String name, int hp, int atk, int sunCost, Position pos)
	{
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.sunCost = sunCost;
		this.pos = pos;
	}
	
	//setters
	public void setName(String name) { this.name = name; }
	public void setHp(int hp) { this.hp = hp; }
	public void setAtk(int atk) { this.atk = atk; }
	public void setPrice(int sunCost) { this.sunCost = sunCost; }
	public void setPos(Position pos) { this.pos = pos}
	
	//getters
	public String getName() { return name; }
	public int getHp() { return hp; }
	public int getAtk() { return atk; }
	public int getSunCost() { return sunCost; }
	public Position getPos() { return pos; }
}