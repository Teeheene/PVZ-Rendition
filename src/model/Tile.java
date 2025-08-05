package model;

public class Tile
{
	private Position pos;
	private Entity entity;
	
	public Tile(Position pos, Entity entity)
	{
		this.pos = pos;
		this.entity = entity;
	}
	
	public Position getPos() { return pos; }
	public Entity getEntity() { return entity; }
	public void setPos(Position pos) { this.pos = pos; }
	public void setEntity(Entity entity) { this.entity = entity; }
	
	//debugging
	public void printDebug() 
	{
		System.out.print("Tile at " + pos.toString() + " with entity ");
		
		if(entity != null)
			entity.printDebug();
	}
}