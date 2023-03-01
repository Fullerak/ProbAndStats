import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class DoorProblemTester {

	public static void main(String[] args) {
		
		DoorProblem test = new DoorProblem();
		System.out.println("The probability of you winning if you don't change your door is:     " + test.montyProblem() + "%");
		System.out.println("The probability of you winning if you cahnge your door is:           " + test.montyProblemSwitch() + "%");
	}
		
}


