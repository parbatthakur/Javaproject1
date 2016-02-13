package parbat;

public class Human extends Mammal{

	private int voice;
	
	public Human(){
		
	}
	
	public Human(int voice, String birth,String food, String legs, int height, String sex){
		super(birth, food, legs, height, sex);
		this.voice = voice;
	}
	
	public int getVoice(){
		return voice;
	}

	public void report() {
		String message = "Human qualities are : " + birth + ", " + food +
                ", with legs " + legs +  sex  + voice ;
     System.out.println(message);
	}

}
