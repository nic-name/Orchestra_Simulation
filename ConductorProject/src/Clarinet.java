//Define a subclass Clarinet that extends the superclass instrument
public class Clarinet extends Instrument{

	//This calls the blank constructor from the instrument method which sets default values
	public Clarinet() {
		super();
	}
	
	//calls the constructor in the super class and passes the following 
	public Clarinet(String name, String sectionName, float weight){
		super(name, sectionName, weight);			
	}
	
	//return plays piece for this instrument
	public String play(String piece) {
		return("Clarinet playing " + piece + ".");
	}

	
	

}
