package model;

//Entity class is just an abstracted version of ANY entity
//that holds its ID to identify
public class Entity
{
	protected final int entityID; 
	protected final int typeID;
	protected String name;
	
	/*
	* NOTE (IDs)
	* Take note that the entity ID holds the ID of whatever
	* entity is to be abstracted from its ACTUAL class.
	*  
	* The purpose of type ID is to determine WHICH type of
	* entity is being stored (e.g. plants, zombies, etc.)
	*
	* type ID codes 
	* 1 - plants
	* 2 - zombies
	*
	* I'm not sure if ill try to implement ENUMS, but I'll 
	* think about it!
	*
	*/
	
	public Entity(int entityID, int typeID, String name)
	{
		this.entityID = entityID;
		this.typeID = typeID;
		this.name = name;
	}
	
	public int getEntityID() { return entityID; }
	public int getTypeID() { return typeID; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	//debug
	public void printDebug() 
	{
		System.out.print(name + " (ID" + entityID + ") of TYPE ");
		switch(typeID)
		{
			case 1: System.out.print("PLANT");
					  break;
			case 2: System.out.println("ZOMBIE");
					  break;
			default: System.out.println("NONE");
		}
	}
	
	public String toString()
	{
		String info = name + " eID: " + entityID + ", tID: " + typeID;
		return info;
	}
}