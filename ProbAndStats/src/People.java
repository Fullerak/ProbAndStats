import java.util.ArrayList;
import java.util.Random;

public class People {
	
	
	public People() {
		
		
	}
	
	public int rand() {
		
		Random rand = new Random();
		int randomDay = rand.nextInt(366);
		return randomDay;
		
	}
	
	
	public double birthday(int countPeople, double trials) {
		
		//creating stats lib
		People test = new People();
		
		//creating a count
		int count = 0;
		
		//looping through the amount of trials
		for(int i = 0;i<trials;i++) {
			//assigning the b day to true/false if theres a match
			boolean val = test.birthdayTest(countPeople);
			//test
			//System.out.println(val);
			//trying to add trues to the count to get the percentage later on
			if (val == true) {
				count++;
			}
			
		}
		//getting the percentage
		double ans = count/trials * 100;
		
		return ans;
		
	}
	
	public boolean birthdayTest(int people) {

			//we also have to create an arraylist to store all the b days
			ArrayList<Integer> list = new ArrayList<Integer>();
		

			//first we have to make a random b day generator
		
			//creates as many random b days as specified in the parameters in a forloop
			for(int i =0;i<people;i++) {
				//creating a random date
				int randBirthday = rand();
				//adding it to the list
				list.add(randBirthday);
			}
		
			//now we have to compare each birthday to see if a single one matches
			for (int i = 0; i < list.size()-1;i++) {
				for (int j = i+1; j < list.size();j++) {
					//System.out.println(list.get(i)+","+list.get(j));
					if (list.get(i) == list.get(j)) {
						return true;
					}
				}
			}
			
		

		return false;
	}
	
}
