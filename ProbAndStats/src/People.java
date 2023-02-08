import java.util.Random;

public class People {
	
	
	public People() {
		
		
	}
	
	public int rand(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}
	
	
	public int birthday(int countPeople) {
		
		//random birthday generator
		int randBirthDate = rand(1,365);
		
		//creating the list of people need to set the amount of people in a list
		int[] people;
		
		
		
		return 0;
	}
	
}
