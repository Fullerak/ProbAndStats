import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DoorProblem {

	//write a program to emulate the 3 door game
	//write a version to emulate the game when one wrong door is taken away
	
	public DoorProblem() {
		
	}
	
	//have an array of 0s int[] arr = {0, 0, 0};
	
	//insert a 1 into a random index of the array
	//
	
	public int rand(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}
	
	public double montyProblem() {
		double count = 0;
		double maximum = 10000;
		
		for(int y = 0; y < maximum; ++y) {
			
		
		//System.out.println();
		
		DoorProblem test = new DoorProblem();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
		
		
		arr.add(0);
		arr.add(0);
		arr.add(0);
		

		arrAnswer.add(0);
		arrAnswer.add(0);
		arrAnswer.add(0);
		
		int random = test.rand(0, 2);
		int one = 1;
		
		arr.remove(random);
		arr.add(random, one);
		
		for (int x: arr) {
			//System.out.print(x);
		}
		//System.out.println();
		int answer = test.rand(0, 2);
		
		arrAnswer.remove(answer);
		arrAnswer.add(answer, one);
		
		for (int c: arrAnswer) {
			//System.out.print(c);
		}
		
		//System.out.println();
		
		boolean res = arr.equals(arrAnswer);
		
		if (res == true) {
			//System.out.print("True");
			++count;
		}
		else {
			//System.out.print("False");
		}
		
		}
		//System.out.println();
		double done = count/maximum * 100;
		//System.out.println(count);
		return done;
			
	}
	
	public double montyProblemSwitch() {
		double count = 0;
		double maximum = 10000;
		
		for(int y = 0; y < maximum; ++y) {
		
		DoorProblem testing = new DoorProblem();
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		ArrayList<Integer> testTwo = new ArrayList<Integer>();
		
		test.add(0);
		test.add(0);
		test.add(0);
		
		testTwo.add(0);
		testTwo.add(0);
		testTwo.add(0);
		
		/*for (int x : test) {
			System.out.print(x);
		}
		
		System.out.println();
			
		for (int c : testTwo) {
			System.out.print(c);
		}
		
		System.out.println();*/
		
		int random = testing.rand(0, 2);
		int one = 1;
		
		test.remove(random);
		test.add(random, one);
		
		/*for (int l : test) {
			System.out.print(l);
		}*/
		
		int randomTwo = testing.rand(0, 2);
		
		testTwo.remove(randomTwo);
		testTwo.add(randomTwo, one);
		
		//System.out.println();
		
		/*for (int z : testTwo) {
			System.out.print(z);
		}*/
		
		//if one of the indexes on both of the arrays is = 0 then take the door away from each
		//System.out.println();
		
		//System.out.println(test.get(0));
		//System.out.println(testTwo.get(0));
		
		
		if (test.get(0) == 0 & testTwo.get(0) == 0) {
			test.remove(0);
			testTwo.remove(0);
			Collections.swap(testTwo, 0, 1);
			boolean res = test.equals(testTwo);
			if (res == true) {
				//System.out.println("True");
				++count;
			}
			else {
				//System.out.println("False");
			}
			//System.out.println("Slot 1");
		}
		else if (test.get(1) == 0 & testTwo.get(1) == 0) {
			test.remove(1);
			testTwo.remove(1);
			Collections.swap(testTwo, 0, 1);
			boolean res = test.equals(testTwo);
			if (res == true) {
				//System.out.println("True");
				++count;
			}
			else {
				//System.out.println("False");
			}
			//System.out.println("Slot 2");
		}
		else if (test.get(2) == 0 & testTwo.get(2) == 0) {
			test.remove(2);
			testTwo.remove(2);
			Collections.swap(testTwo, 0, 1);
			boolean res = test.equals(testTwo);
			if (res == true) {
				//System.out.println("True");
				++count;
			}
			else {
				//System.out.println("False");
			}
			//System.out.println("Slot 3");
		}
		else {
			//System.out.println("Something is wrong");
		}
		
		/*for (int u : test) {
			System.out.print(u);
		}
		
		System.out.println();
		
		for (int v : testTwo) {
			System.out.print(v);
		}
		
		System.out.println();*/
		
		}
		double done = count/maximum * 100;
		return done;

	}
	
	
}
