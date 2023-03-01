import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DoorProblem {

	//default constructor
	public DoorProblem() {
	}
	
	//random number generator for the 0s and 1s
	public int rand(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}
	
	//constructor for the no switch monty problem
	public double montyProblem() {
		//making a count variable for the amount of times they win
		double count = 0;
		//making a variable for the amount of trials
		double maximum = 10000;
		
		//forloop for the amount of trials 
		for(int y = 0; y < maximum; ++y) {
		
		//creating a instance of door problem so I can use the random num generator
		DoorProblem test = new DoorProblem();
		
		//creating an array for the random door (the number 1) to be places
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//creating another array to do the same thing to act as a persons random choice
		ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
		
		//adding all 0s to an array
		arr.add(0);
		arr.add(0);
		arr.add(0);
		
		//adding all 0s to the second array
		arrAnswer.add(0);
		arrAnswer.add(0);
		arrAnswer.add(0);
		
		//this will pick a random index to place the 1 in 
		int random = test.rand(0, 2);
		//this is the num 1 which will act as the correct door
		int one = 1;
		
		//removing a random index
		arr.remove(random);
		//adding the 1 to that random empty index
		arr.add(random, one);
		
		//this picks a random index for the other second array
		int answer = test.rand(0, 2);
		
		//this removes the specific index
		arrAnswer.remove(answer);
		//this adds the 1 to that removed index 
		arrAnswer.add(answer, one);
		
		//if the two arrays match it'll res in true, if not it'll be false
		boolean res = arr.equals(arrAnswer);
		
		//if the the res is true itll add to the count , the count represents
		//the amount of right choices
		if (res == true) {
			++count;
		}
		//else nothing
		else {
		}
		
		}
		//this does the count/by trials which will get the decimal and * by 100 to get the percent
		double done = count/maximum * 100;
		//returns res
		return done;
			
	}
	
	//constructor for the monty hall problem with a door revealed and switch
	public double montyProblemSwitch() {
		
		//making a count variable for the amount of times they win
		double count = 0;
		//making a variable for the amount of trials
		double maximum = 10000;
		
		//forloop for the amount of trials
		for(int y = 0; y < maximum; ++y) {
		
		//creating an instance of the doorproblem so i can use the random num generator
		DoorProblem testing = new DoorProblem();
		
		//creating an array for a random door to be put
		ArrayList<Integer> test = new ArrayList<Integer>();
		//creating another arr for the same purpose
		ArrayList<Integer> testTwo = new ArrayList<Integer>();
		
		//adding the 0s to an array
		test.add(0);
		test.add(0);
		test.add(0);
		
		//adding the 0s to an array
		testTwo.add(0);
		testTwo.add(0);
		testTwo.add(0);
		
		//getting a random index to later insert the 1
		int random = testing.rand(0, 2);
		//variable 1
		int one = 1;
		
		//removing the random index
		test.remove(random);
		//inserting the 1 into the random index
		test.add(random, one);
		
		//getting a random index to later insert the 1 in the second arr
		int randomTwo = testing.rand(0, 2);
		
		//removing the random index
		testTwo.remove(randomTwo);
		//inserting the 1 into the random index
		testTwo.add(randomTwo, one);
		
		
		//this is an if loop to remove the same blank door from both arr at index 0
		if (test.get(0) == 0 & testTwo.get(0) == 0) {
			test.remove(0);
			testTwo.remove(0);
			//if it does it takes out that door and then swaps the door
			Collections.swap(testTwo, 0, 1);
			boolean res = test.equals(testTwo);
			//adds to the count if it is correct
			if (res == true) {
				++count;
			}
			else {
			}
		}
		//this is an if loop to remove the same blank door from both arr at index 0
		else if (test.get(1) == 0 & testTwo.get(1) == 0) {
			test.remove(1);
			testTwo.remove(1);
			//if it does it takes out that door and then swaps the door
			Collections.swap(testTwo, 0, 1);
			boolean res = test.equals(testTwo);
			//adds to the count if it is correct
			if (res == true) {

				++count;
			}
			else {

			}

		}
		//this is an if loop to remove the same blank door from both arr at index 0
		else if (test.get(2) == 0 & testTwo.get(2) == 0) {
			test.remove(2);
			testTwo.remove(2);
			//if it does it takes out that door and then swaps the door
			Collections.swap(testTwo, 0, 1);
			boolean res = test.equals(testTwo);
			//adds to the count if it is correct
			if (res == true) {

				++count;
			}
			else {

			}

		}
		else {

		}
		
		}
		//dividing the count by maximum trials and multiplying by 100 to get the percent s
		double done = count/maximum * 100;
		return done;

	}
	
	
}
