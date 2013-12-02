package objectmodell;

import java.util.LinkedList;

import org.apache.log4j.Logger;



public class Hull extends equipment {
	
	static public Logger log = Logger.getLogger(Hull.class);

	private LinkedList<equipment> Container;
	
	public Hull(ConfigureObjects C, String TypeName){
		
		Container = new LinkedList<equipment>();
		
		this.setHealth(C.getHealthByName(TypeName) );
		this.setSize(C.getSizeByName(TypeName));
		this.setDamage(0);
		log.trace(" Hull Type " + TypeName + " created" );
		
	}
	
	public Hull()
	{
		Container = new LinkedList<equipment>();
		this.setHealth(1);
		this.setSize(0);
		this.setDamage(0);
		log.debug("empty Hull created");
	}
	

	
	void addEquippment(equipment e)
	{
	
		if(getAvaibleSize()>= e.getSize() )
		{
			Container.add(e);			
		}
		else
		{
			log.error("Container too small for equipment : " + e.getName());
		}
	
	
	}
	
	public int getAvaibleSize()
	{
		int slots=this.getSize();
		for(equipment e :  Container)
		{
			
			slots-=e.getSize();
			
		}
		
		
		return slots;
	}
	

}
