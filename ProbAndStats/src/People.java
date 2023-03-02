import java.util.ArrayList;
import java.util.Random;
/**
 * class to demonstrate the birthday problem where what are the chances
 * someone in your class has the same birthday as you
 * 
 * @author Kaden
 *
 */
public class People {
	
	/**
	 * Using this as the default constructor
	 */
	public People() {
		
		
	}
	/**
	 * A rand method that generates a random number between 1-365
	 * @return returns the random number between 1-365
	 */
	public int rand() {
		//calling the random class
		Random rand = new Random();
		//setting low and high for the random num generator
		int low = 1;
		int high = 366;
		//doing the random number logic using high/low
		int result = rand.nextInt(high-low) + low;
		//returning the result
		return result;
		
	}
	
	/**
	 * this method calls the birthdayTest method (which creates a random
	 * list of birthdays and compares if any of them are the same) and 
	 * repeats it for the specified amount of trials. Then takes the count
	 * of trials which did return the same birthday and divides it by the trials
	 * to get the percentage of times it occurs over the specified trials. 
	 * 
	 * @param countPeople the number of people per class size or sample size
	 * @param trials the number of trials wished to be performed
	 * @return percentage of times a like birthday occurs in a set amount of trials and size of class
	 */
	public double birthday(int countPeople, double trials) {
		
		//creating stats lib
		People test = new People();
		
		//creating a count
		int count = 0;
		
		//looping through the amount of trials
		for(int i = 0;i<trials;i++) {
			//assigning the b day to true/false if theres a match
			boolean val = test.birthdayTest(countPeople);
			//trying to add trues to the count to get the percentage later on
			if (val == true) {
				count++;
			}
			
		}

		//getting the percentage
		double ans = count/trials * 100;	
		
		return ans;
		
	}
	
	/**
	 * the method creates a list of size people and inserts random birthdays,
	 * then it compares each birthday with every other one (with no repeats), 
	 * and returns true if there is a match and false otherwise
	 * 
	 * @param people the amount of people you want per class
	 * @return returns true or false based on if there is a like birthday in the list
	 */
	public boolean birthdayTest(int people) {

			//we also have to create an arraylist to store all the b days
			ArrayList<Integer> list = new ArrayList<Integer>();
		
			//creates as many random b days as specified in the parameters in a forloop
			for(int i =0;i<people;i++) {
				//adding it to the list
				list.add((Integer) rand());
			}
			//now we have to compare each birthday to see if a single one matches
			for (int i = 0; i < list.size();i++) {
				for (int j = i+1; j < list.size();j++) {
					if (list.get(i).equals(list.get(j))) {
						return true;
					}
				}
			}
			
		

		return false;
	}
	
	/**
	 * this method prints my trials instead of me doing it in the main method I call this to get the %
	 */
	public void returnResult() {
		//creating a people to call the birthday method
		People test = new People();
		//setting the class size
		int classSize = 23;
		//returning the result nicely
		System.out.println("The percentage of someone having the same birthday in a class size of " + classSize + " is: "+ test.birthday(classSize,10000)+"%");
	}
	
}
