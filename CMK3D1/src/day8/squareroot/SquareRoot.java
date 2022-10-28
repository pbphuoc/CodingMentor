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
			/*
			 * when N = m^2 > 1
			 * 0 1 2 .. m .. m^2
			 * if we keep calculating mid point = (upper + lower) / 2 and keep updating new upper or new lower by comparing to m, 
			 * every time we calculate mid point the size N will be reduced by 2:
			 * 1st time: N/1
			 * 2nd time: N/2
			 * 3rd time: N/4
			 * ..		 N/m
			 * 
			 * so the total step to divide the from size N to approximately 1 is log2(N) + 1
			 * after that the range is now slightly differently in lower < m < upper, so it will take some constant times to find the exact middle number
			 * => total time complexity log2(N)
			 */
			double middle = getMiddleNumber(upperLimit, lowerLimit);
			System.out.println("Lower: " + lowerLimit + " - Middle: " + middle + " - Upper: " + upperLimit);
			if ((int) middle * (int) middle == input)
				return (int) middle;

			if (isCorrectSqrtNum(middle, input) == 0)
				return middle;

			if (isCorrectSqrtNum(middle, input) == -1)
				lowerLimit = middle;
			else
				upperLimit = middle;
		}
		//O(log2(N))
	}

	public static int isCorrectSqrtNum(double sqrtNumber, double number) {
		// (a-0.01)^2 = a^2 - 0.02a + 0.0001 <= number <= a^2 + 0.02a + 0.001 = (a+0.01)^2
		if ((sqrtNumber * sqrtNumber) <= (number + 0.02 * sqrtNumber - 0.0001)
				&& (number - 0.02 * sqrtNumber - 0.0001) <= sqrtNumber * sqrtNumber) {
			return 0;
		} else if (sqrtNumber * sqrtNumber < number)
			return -1;
		else
			return 1;
	}

	public static double getMiddleNumber(double upperLimit, double lowerLimit) {
		return (upperLimit + lowerLimit) / 2;
	}
}
