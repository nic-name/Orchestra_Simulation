//imports the arraylist package
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	//main method
	public static void main(String[] args) {
		
		
		String piece = "The Four Seasons by Vivaldi";//creates a string piece
		MusicConductor msConductor = new MusicConductor();//creates a new music conductor object
		
		//creates three instrument subclass objects
		Instrument v = new Violin("Violin", "Strings", 2.34f); //(name, sectionName, weight)
		Instrument c = new Clarinet("Clarinet", "Strings", 1.45f);
		Instrument f = new FrenchHorn("French Horn", "Brass", 5.34f);
		
		//creates an array list which compiles a list of items that are of object type Instrument
		List <Instrument> orchestraList = new ArrayList <>();
		
		//add our three instrument objects to the list
		orchestraList.add(v);
		orchestraList.add(c);
		orchestraList.add(f);
		
		//use an enhanced for loop
		for (Instrument i : orchestraList){				
				                //calls the conduct method of the conductor
				System.out.println(msConductor.conduct(piece, i));//print out the instrument and the piece it plays
		}
		
	}//end main

}
