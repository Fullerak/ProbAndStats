import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

//software design pattern (iterator is one of them)
public class StatsLibrary {
	

	//Default constructor
	public StatsLibrary() {
		
		
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
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
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	//method to get the median
	public double findMedian(double[] array) {
		//to find the median first we need to sort the array
		Arrays.sort(array);
		//after we sort it then we can add an if else statement to check if its even or odd
		
		//middle of the array {1, 2, 3, 4, 5}
		double middle = array[(array.length / 2)];
		//the other middle {1, 2, 3, 4}
		double otherMiddle = array[(array.length / 2) - 1];
		
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

	/**
	 * 
	 * @param array
	 * @return
	 */
	//method to get the mode
	public Integer findMode(ArrayList<Integer> array) {
		//https://www.tutorialspoint.com/Java-program-to-calculate-mode-in-Java
	    Integer res = 0;
	    int maxCount = 0,i,j;
	    double n = array.size();
	      
	    	for (i = 0; i < n; ++i) {
	    		int count = 0;
	    		for (j = 0; j < n; ++j) {
	    			if (array.get(i) == array.get(j))
	    				++count;
	    		}

	    		if (count > maxCount) {
	    			maxCount = count;
	    			res = array.get(i);
	    		}
	    		else if (count == maxCount & array.get(i) != res) {
	    			res = null;
	    		}
	    	}
	      return res;
		
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
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
	
	/**
	 * 
	 * @param arrayOne
	 * @param arrayTwo
	 * @return
	 */
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
	/**
	 * 
	 * @param arrayOne
	 * @param arrayTwo
	 * @return
	 */
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
		
	/**
	 * 
	 * @param arrayOne
	 * @param min
	 * @param max
	 * @return
	 */
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
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	public BigInteger factorial(int num) {
		
		BigInteger init = new BigInteger("1");
		
		for (int i = 2; i <= num;++i) {
			
			init = init.multiply(BigInteger.valueOf(i));
			
		}
				
		return init;
	}
	/**
	 * 
	 * @param n
	 * @param r
	 * @return
	 */
	//permutation method
	public BigInteger permutation(int n, int r) {
		//creating statsLib so I can call the fact method
		StatsLibrary test = new StatsLibrary();
		
		//assigning the numerator to n!
		BigInteger numerator = test.factorial(n);
		
		//subtracting n - r first to get var x
		int x = n - r;
		
		//assigning the denom to (n-r)!
		BigInteger denominator = test.factorial(x);
		
		//dividing the two to get the ans
		BigInteger ans = numerator.divide(denominator);
		
		//returning the answer
		return ans;
		
	}
	/**
	 * 
	 * @param n
	 * @param r
	 * @return
	 */
	public BigInteger combination(int n, int r) {
		//creating statsLib so I can call the fact method
		StatsLibrary test = new StatsLibrary();
		
		//assigning the numerator to n!
		BigInteger numerator = test.factorial(n);
		
		//subtracting n - r first to get x
		int x = n - r;
		
		//getting the fact of x
		BigInteger xFact = test.factorial(x);
		
		//assigning r factorial in the denom
		BigInteger rFact = test.factorial(r);
		
		//multiply rFact * xFact to get the denom
		BigInteger denominator = rFact.multiply(xFact);
		
		//dividing the numerator and denominator for ans
		BigInteger ans = numerator.divide(denominator);
		
		//returning the answer
		return ans;
	}
	
	/**
	 * 
	 * @param p
	 * @param y
	 * @return
	 */
	public double geometric(double p, double y) {
		
		double power = y - 1;
		
		double ins = 1 - p;
		
		double mult = Math.pow(ins,power);
		
		double res = mult * p;
		
		return res;
	}
	
	public BigInteger binomial(int n, int p, int y) {
		
		StatsLibrary test = new StatsLibrary();
		
		//combinations
		BigInteger comb = test.combination(n, y);
		
		//p^y math
		double py = Math.pow(p,y);
		BigInteger pyBig = BigDecimal.valueOf(py).toBigInteger();
		
		//(1-p)^n-y
		double ins = Math.pow(1-p, n-y);
		BigInteger insBig = BigDecimal.valueOf(ins).toBigInteger();
		
		BigInteger inner = pyBig.multiply(insBig);
		
		BigInteger outter = inner.multiply(comb);
		
		return outter;
	}
}