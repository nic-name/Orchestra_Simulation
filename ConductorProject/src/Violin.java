//Define a subclass violin that extends the superclass instrument
public class Violin extends Instrument{

	//This calls the blank constructor from the instrument method which sets default values
	public Violin() {
		super();
	}
	
	//calls the constructor in the super class and passes the following 
	public Violin(String name, String sectionName, float weight){
		super(name, sectionName, weight);			
	}
	
	//return plays piece for this instrument
	public String play(String piece) {
		return("Violin playing " + piece + ".");
	}

	
	

}
