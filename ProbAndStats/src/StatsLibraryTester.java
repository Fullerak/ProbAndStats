import java.util.Arrays;

public class StatsLibraryTester {

	public static void main(String[] args) {
		
		//making my array for mean, median, mode, and standard deviation
		double[] arr = {1.0, 3.6, 4.1, 9.3, 2.4, 1.1, 1.1, 1.0, 6.8, 3.3, 3.3, 7.9, 1.1, 7.8};
		
		//creating an instance of StatsLibrary
		StatsLibrary test = new StatsLibrary();
		
		System.out.println("The mean of this array is equal to: " + test.findMean(arr));
		System.out.println("The median of this array is equal to: " + test.findMedian(arr));
		System.out.println("The mode of this array is equal to: " + test.findMode(arr));
		System.out.println("The standard deviation of this array is equal to: " + test.findStandardDeviation(arr));

		
		
	}

}
