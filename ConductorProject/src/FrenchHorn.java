//Define a subclass French Horn that extends the superclass instrument
public class FrenchHorn extends Instrument{

	//This calls the blank constructor from the instrument class which sets default values
	public FrenchHorn() {
		super();
	}
	
	//calls the constructor in the super class and passes the following 
	public FrenchHorn(String name, String sectionName, float weight){
		super("Unknown Instrument Name","Unknown Section Name",0);			
	}
	
	//return plays piece for this instrument
	public String play(String piece) {
		return("French Horn playing " + piece + ".");
	}

	
	

}
