package objectmodell;

public interface Storage {
	

	public void addRessource(int amount);
	public void removeRessource(int amount);
	public void transferRessource(Storage transTo);
	
	
}
