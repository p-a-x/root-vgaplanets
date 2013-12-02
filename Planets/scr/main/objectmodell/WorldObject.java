package objectmodell;

import org.apache.log4j.Logger;

public abstract class WorldObject {

	private int posX;
	private int posY;
	
	private String typename;
	private String name;
	
	static public Logger log = Logger.getLogger(WorldObject.class);

	
	
	
	public void SetPos(int X,int Y)
	{
		posX=X;
		posY=Y;
		
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTypename() {
		return typename;
	}


	public void setTypename(String typename) {
		this.typename = typename;
	}
	
	
	
	
	
	
}
