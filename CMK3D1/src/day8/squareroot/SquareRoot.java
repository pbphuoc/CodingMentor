package day8.squareroot;

public class SquareRoot {
	public static void demo() {
		double input = 999999999;
		double myResult = getSquareRoot(input);
		double exactResult = Math.sqrt(input);
		System.out.println("My SquareRoot result is: " + myResult);
		System.out.println("Exact result is: " + exactResult);
		// myResult - 0.01 <= Math.sqrt <= myResult + 0.01
		System.out.println("Is my result correct: " + (myResult - exactResult <= 0.01 && exactResult - myResult <= 0.01));		
	}
	
	public static double getSquareRoot(double input) {	
		double upperLimit = input;
		double lowerLimit = 0;
		if(input < 1) {
			upperLimit = 1;
			lowerLimit = input;
		}
		else if (input == 0 || input == 1)
			return input;
		while (true) {
			double middle = (upperLimit + lowerLimit) / 2;			
			if (isCorrectSqrtNum(middle, input) == 0)
				return middle;
			if (isCorrectSqrtNum(middle, input) == -1)
				lowerLimit = middle;
			else
				upperLimit = middle;
		}
	}

	public static int isCorrectSqrtNum(double sqrtNumber, double number) {
		// (a-0.01)^2 = a^2 - 0.02a + 0.0001 <= number <= a^2 + 0.02a + 0.001 = (a+0.01)^2
		if ((int) sqrtNumber * (int) sqrtNumber == number)
			return (int) sqrtNumber;
		else if ((sqrtNumber * sqrtNumber) <= (number + 0.02 * sqrtNumber - 0.0001)
				&& (number - 0.02 * sqrtNumber - 0.0001) <= sqrtNumber * sqrtNumber) {
			return 0;
		} else if (sqrtNumber * sqrtNumber < number)
			return -1;
		else
			return 1;
	}
//	public static double getMiddleNumber(double upperLimit, double lowerLimit) {
//		return (upperLimit + lowerLimit) / 2;
//	}
}
