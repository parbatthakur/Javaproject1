package parbat;

public class Objects {
	
	public static void main(String[] args) {
		LivingThings[] creature = new LivingThings[10];
		creature[0] = new Human(1, "man","pasta", "two", 7, "male");
		creature[1] = new Birds("yes", "grains", "two", 9, "female");
		creature[2] = new Insects(1, "microbes", "no legs", 1, "hermaphrodite");
		
		for(int i = 0; i < 3; i++)
            creature[i].report();    
    }
		
	}


