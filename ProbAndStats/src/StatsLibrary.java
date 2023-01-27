import java.util.ArrayList;
import java.util.Arrays;

//software design pattern (iterator is one of them)
public class StatsLibrary {
	//idk why i made this i hope i use it later	
	
	
	//Default constructor
	public StatsLibrary() {
		
		
	}
	
	//Method to get the mean
	public double findMean(double[] array) {
		double sum = 0;
		//for each loop iterating over all the elements (list iterator)
		for(double singleElement : array) {
			//adding each element to the sum
			sum = sum + singleElement;
		}
		//storing the result inside a double 
		double result = sum / array.length;
		//returning the result
		return result;
		
	}
	
	//method to get the median
	public double findMedian(double[] array) {
		//to find the median first we need to sort the array
		Arrays.sort(array);
		//after we sort it then we can add an if else statement to check if its even or odd
		
		//middle of the array {1, 2, 3, 4, 5}
		double middle = (array.length / 2);
		//the other middle {1, 2, 3, 4}
		double otherMiddle = (array.length / 2) - 1;
		
		//checking if it is even
		if(array.length % 2 == 0){
			double evenMedian = (middle + otherMiddle) / 2;
			return evenMedian;
		}
		//checking if it is odd
		else {
			return middle;
		}
		
	}
	
	//method to get the mode
	public double findMode(double[] array) {
		//to find the mode we just need to find the number or item that occurs the most
		//what im thinking is having two variables, one that is essentially the # itself
		//and the other one is the amount of times it occurs, and im going to compare it
		//to the next item # and if the count is less ill keep it if its more ill swap it
		//https://www.tutorialspoint.com/Java-program-to-calculate-mode-in-Java
	      int maxValue = 0, maxCount = 0, i, j;
	      int n = array.length;
	      
	      for (i = 0; i < n; ++i) {
	         int count = 0;
	         for (j = 0; j < n; ++j) {
	            if (array[j] == array[i])
	            ++count;
	         }

	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = (int) array[i];
	         }
	      }
	      return maxValue;
		
	}
	
	//method to find the standard deviation
	public double findStandardDeviation(double[] array) {
		//creating an instance of the class so i can use mean instead of doing a new one in here
		StatsLibrary test = new StatsLibrary();
		//getting the mean
		double mean = test.findMean(array);
		
		double sum = 0;
		//subtracting the mean from each number, squaring it, then adding it to sum
		for (double i : array) {
			double x = i - mean;
			double y = x*x;
			sum += y;
		}
		//dividing sum by the count -1
		double z = sum/(array.length);
		//sqrt it to get the standard deviation
		double standardDeviation = Math.sqrt(z);
		
		return standardDeviation;
	}
	
	//method to find the union of two arraylists
	//essentially combines both sets and eliminates duplicates
	public ArrayList<Integer> findUnion(ArrayList<Integer> arrayOne, ArrayList<Integer> arrayTwo) {
		
		ArrayList<Integer> unionOne = new ArrayList<Integer>();
		ArrayList<Integer> unionFinal = new ArrayList<Integer>();
		
		
		
		for (int i=0;i<arrayOne.size();++i) {
			unionOne.add(arrayOne.get(i));
		}
		for (int j=0;j<arrayTwo.size();++j) {
			unionOne.add(arrayTwo.get(j));
		}
		
		//https://www.geeksforgeeks.org/how-to-remove-duplicates-from-arraylist-in-java/
		//going through the list and checking if it is not present, if not then add it
		for(int x : unionOne) {
			if(!unionFinal.contains(x)) {
				unionFinal.add(x);
			}
		}
		
		return unionFinal;
		
	}
	
	//method to find the intersection of two sets
	//essentially only if the item appears in both sets we can add it to the final set
	public ArrayList<Integer> findIntersection(ArrayList<Integer> arrayOne, ArrayList<Integer> arrayTwo){
		//have to either do a double for loop
		//maybe check an element in one and compare it to all the other ones
		ArrayList<Integer> intersectionFinal = new ArrayList<Integer>();
		
		//going through the list and checking if it is present, if so then add it
		for(int x : arrayOne) {
			if(arrayTwo.contains(x)) {
				intersectionFinal.add(x);
			}
		}
		
		return intersectionFinal;
		
	}
		
	
	public ArrayList<Integer> findComplement(ArrayList<Integer> arrayOne, int min, int max){
		
		//complement is a new arraylist of numbers that are present in the universal set but not in A
		ArrayList<Integer> complementArr = new ArrayList<Integer>();
		ArrayList<Integer> complementFinal = new ArrayList<Integer>();
		
		//creating the entire set that were comparing A to
		for (int i = min; i < max+1; ++i) {
			complementArr.add(i);
		}
		
		//iterating through given array if it is in the universal set it removes it
		for(int x : arrayOne) {
			if(complementArr.contains(x)) {
				complementArr.remove(Integer.valueOf(x));
			}
		}
		//returning the new array
		return complementArr;
	}
	
	
	

}