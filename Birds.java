package parbat;

public class Birds extends Animal{
	
	private String fly;
	
	public Birds(){
		
	}
	
	public Birds(String fly,String food, String legs, int height, String sex){
		super(food, legs, height, sex);
		this.fly = fly;
	}
	
	public String getFly(){
		return fly;
	}
	

	public void report() {
		String message = "Birds eat: " + food + ", " + legs +
                ", " + fly + " " + sex;
     System.out.println(message);
		
	}

}
