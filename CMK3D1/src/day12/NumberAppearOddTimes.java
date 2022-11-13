package day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberAppearOddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		findOddTimesAppearNum(arr);

	}

	public static void findOddTimesAppearNum(int[] arr) {
		Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
		// loop through arr length = N -> O (N logN)
		for (int value : arr) {
			// O(1)
			if (occurences.containsKey(value)) {
				// O(logN)
				occurences.put(value, occurences.get(value) + 1);
			} else {
				occurences.put(value, 1);
			}
		}
		// ON
		for (Entry<Integer, Integer> entry : occurences.entrySet()) {
			if (entry.getValue() % 2 != 0)
				System.out.println(entry.getKey() + " " + entry.getValue() + " times");
		}
		// -> Total Time Complexity: O (N logN) + O(N)
	}

}
