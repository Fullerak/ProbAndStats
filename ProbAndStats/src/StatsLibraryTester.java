import java.util.ArrayList;
import java.util.Arrays;

public class StatsLibraryTester {

	public static void main(String[] args) {
		
		//making my array for mean, median, mode, and standard deviation
		double[] arr = {1.0, 3.6, 4.1, 9.3, 1.0, 4.1, 4.1};
		
		//making my array list
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(3);
		array.add(4);
		array.add(9);
		array.add(1);
		array.add(10);
		array.add(5);
		
		//creating an instance of StatsLibrary
		StatsLibrary test = new StatsLibrary();
		
		System.out.println("----------------------------------------------");
		System.out.println("  Mean                |  " + test.findMean(arr));
		System.out.println("----------------------------------------------");
		System.out.println("  Median              |  " + test.findMedian(arr));
		System.out.println("----------------------------------------------");
		System.out.println("  Mode                |  " + test.findMode(array));
		System.out.println("----------------------------------------------");
		System.out.println("  Standard Deviation  |  " + test.findStandardDeviation(arr));
		System.out.println("-----------------------------------------------");

		//System.out.println(test.combination(6, 3));
		System.out.println(test.geometric(.1,3));
		System.out.println(test.binomial(3,3,2));
	}

}
