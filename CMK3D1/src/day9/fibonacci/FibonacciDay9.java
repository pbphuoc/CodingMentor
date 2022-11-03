package day9.fibonacci;

public class FibonacciDay9 {
	static int count = 0;
	public static void runFibonacci() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("FIBONACCI NUMBERS: ");
//		System.out.println("Get Fibonacci Using Loop: ");
//		for (int num : arr) {
//			System.out.println("Fibo of " + num + " is: " + getFibonacciUsingLoop(num));
//		}
//		System.out.println("Get Fibonacci Using Recursion: ");
//		for (int num : arr) {
//			System.out.println("Fibo of " + num + " is: " + getFibonacciUsingRecursion(num, 1, 0));
//		}
		System.out.println("Get Fibonacci Using Memorization: ");
		for (int num : arr) {
			System.out.println("Fibo of " + num + " is: " + getFibonnaciUsingMemorization(num, new int[num]));
		}
	}

	public static int getFibonacciUsingLoop(int num) {
		int prevFibo = 0;
		int curFibo = 1;
		int currentLevel = 1;
		if (num == 0)
			return 0;
		else if (num == 1)
			return 1;
		else
			++currentLevel;
		// --> O(num-1) = O(num)
		while (currentLevel <= num) {
			int newPrevFibo = curFibo;
			curFibo += prevFibo;
			prevFibo = newPrevFibo;
			++currentLevel;
		}
		return curFibo;
	}
	
	//another implementation
	//memorization and recursion algorithm
	//dynamic programming
	public static int getFibonnaciUsingMemorization(int num, int[] results) {
		++count;
		if (num == 1 || num == 2)
			return 1;
		if(results[num-1] != 0)
			return results[num-1];
		else 
			results[num-1] = getFibonnaciUsingMemorization(num - 1, results) + getFibonnaciUsingMemorization(num - 2, results);
		return getFibonnaciUsingMemorization(num - 1, results) + getFibonnaciUsingMemorization(num - 2, results);
	}

	// pass curFibonacci and prevFibonacci to the next recursion
	// --> always start at steps, and update with steps-1 -> O(n)
	public static int getFibonacciUsingRecursion(int steps, int curFibonacci, int prevFibonacci) {
		if (steps == 1 || steps == 2)
			return curFibonacci;
		return getFibonacciUsingRecursion(steps - 1, curFibonacci + prevFibonacci, curFibonacci);
	}

}
