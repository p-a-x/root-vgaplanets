package objectmodell;

public interface Habitat {
	
	public void setPopulation(int pop);
	public int getPopulation();
	public void setGrowthFactor(double growth);
	public void evolve(double time);

}
