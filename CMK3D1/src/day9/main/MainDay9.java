package day9.main;

import day9.fibonacci.FibonacciDay9;
import day9.longestsamestring.LongestSameStringDay9;

public class MainDay9 {

	public static void main(String[] args) {
		// Time complexity: O(N)
		FibonacciDay9.runFibonacci();
		// Time complexity: N(logN - 1/2) + m (m is max length of strings[0] or
		// strings[last])
		// --> O(logN)
		LongestSameStringDay9.runLongestSameString();
	}

}
