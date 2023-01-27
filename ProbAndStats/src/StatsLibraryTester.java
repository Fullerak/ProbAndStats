import java.util.Arrays;

public class StatsLibraryTester {

	public static void main(String[] args) {
		
		//making my array for mean, median, mode, and standard deviation
		double[] arr = {1.0, 3.6, 4.1, 9.3, 2.4, 1.1, 1.1, 1.0, 6.8, 3.3, 3.3, 7.9, 1.1, 7.8};
		
		//creating an instance of StatsLibrary
		StatsLibrary test = new StatsLibrary();
		
		System.out.println("----------------------------------------------");
		System.out.println("|  Mean                |  " + test.findMean(arr) + " |");
		System.out.println("----------------------------------------------");
		System.out.println("|  Median              |  " + test.findMedian(arr) + "                |");
		System.out.println("----------------------------------------------");
		System.out.println("|  Mode                |  " + test.findMode(arr) + "                |");
		System.out.println("----------------------------------------------");
		System.out.println("|  Standard Deviation  |  " + test.findStandardDeviation(arr) + " |");
		System.out.println("-----------------------------------------------");

		
		
	}

}
