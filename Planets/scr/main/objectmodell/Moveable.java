package objectmodell;

public interface Moveable {

	
	
	public void SetSpeed(double speed);
	public void SetDest(WorldObject W);
	public void SetDest(int X, int Y);
	public void Move(double timestep);
	
	
}
