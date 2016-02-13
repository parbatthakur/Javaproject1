package parbat;

public abstract class Animal implements LivingThings{

	protected String food;
	protected String legs;
	protected int height;
	protected String sex;
	
	protected Animal(){
		
	}
	
	protected Animal(String food, String legs, int height, String sex){
		this.food = food;
		this.legs = legs;
		this.height = height;
		this.sex = sex;
	}
	
	public String getFood() {
        return food;
    }

    public String getLegs() {
        return legs;
    }

    public int getHeight() {
        return height;
    }

    public String getSex() {
        return sex;
    }
}
