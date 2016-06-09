//Define an abstract class instrument to implement the playable interface
public abstract class Instrument implements Playable {
		
		//fields for the instrument class
		private String name;
		private String sectionName;
		private float weight;
		
		//constructor that takes in 3 arguments
		public Instrument(String name, String sectionName, float weight) {
			
			this.name = name;
			this.sectionName = sectionName;
			//call on the data validation in the setter which makes sure a negative value isn't assigned.
			this.setWeight(weight);
		}
		
		//empty constructor to set the defaults
		public Instrument (){
			//Call the constructor above
			this("No Instrument Name","No Section Name", 0);
		}
	
		//Getters and setters
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		
		public String getSectionName() {
			return sectionName;
		}

		
		public void setSectionName(String sectionName) {
			this.sectionName = sectionName;
		}
	
		
		public float getWeight() {
			return weight;
		}
	
		//this setter uses an if statement for data validation to ensure a negative value isn't passed
		public void setWeight(float weight) {
			if(weight>=0f){
				this.weight = weight;
				}
			else{
				weight=0f;
			}
		}
		

		
		//Overriding the toString method to get proper output when the object is printed
		@Override
		public String toString() {
			return "Instrument [name=" + name + ", sectionName=" + sectionName + ", weight=" + weight + "]";
		}
}
