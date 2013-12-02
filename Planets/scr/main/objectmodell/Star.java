package objectmodell;

public class Star extends WorldObject {
	
	public Star(int X,int Y, String Name)
	{
		this.SetPos(X, Y);
		this.setName(Name);
		this.setTypename("Star");

	}

	
	
	
}
