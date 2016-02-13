package parbat;

public class Insects extends Animal{
	
	private int nocturnal;
	
	public Insects(){
		
	}
	
	public Insects(int nocturnal, String food, String legs, int height, String sex){
		super(food, legs, height, sex);
		this.nocturnal= nocturnal;
	}
	
	public int getNocturnal(){
		return nocturnal;
	}

	public void report() {
		String message = "Insect which are: " + nocturnal + ", " + food +
                ", with height " + height + " " + legs;
     System.out.println(message);
		
	}
	
	

}
