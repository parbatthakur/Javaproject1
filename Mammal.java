package parbat;

public abstract class Mammal extends Animal{
	
	protected String birth;
	
	protected Mammal(){
		
	}
	
	protected Mammal(String birth, String food, String legs, int height, String sex){
		super(food, legs, height,sex);
		this.birth = birth;
	}
	
	public String getBirth(){
		return birth;
	}

}
