//Define a class Music Conductor
public class MusicConductor {
	
	//the music conductor instructs the instrument to play a piece 
	//and returns the output
	public String conduct(String piece, Instrument instrument){
		return instrument.play(piece);
	}

}
