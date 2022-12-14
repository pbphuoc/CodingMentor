package day9.longestsamestring;

public class LongestSameStringDay9 {

	public static void runLongestSameString() {
		String[] strings = { "flower", "flow", "flight", "flew", "flop", "fluffy", "flopper", "flute", "fun", "film" };
		System.out.println("LONGEST SAME STRING: ");
		System.out.println("Before sort: ");
		for (String string : strings) {
			System.out.println(string + " ");
		}
		sortStringArr(strings, 0, strings.length - 1);
		System.out.println("After sort: ");
		for (String string : strings) {
			System.out.println(string + " ");
		}
		System.out.println("Longest Same String: " + getLongestSameString(strings));
	}

	// time complexity to compare: m (max length of string[0] or string[last])
	public static String getLongestSameString(String[] strings) {
		String result = "";
		int i = 0;
		while (i < strings[0].length() && i < strings[strings.length - 1].length()) {
			if (strings[0].charAt(i) == strings[strings.length - 1].charAt(i))
				result += strings[0].charAt(i);
			else
				break;
			++i;
		}
		return result;
	}

	public static void compareAndSwap(String[] strings, int firstWordIndex, int secondWordIndex) {
		if (strings[firstWordIndex].compareTo(strings[secondWordIndex]) > 0) {
			String temp = strings[firstWordIndex];
			strings[firstWordIndex] = strings[secondWordIndex];
			strings[secondWordIndex] = temp;
		}
	}

	public static void mergeStringArr(String[] strings, int first, int middle, int last) {
		String[] sortedArr = new String[last - first + 1];
		int currentFirstHalfIndex = first;
		int currentSecondHalfIndex = middle + 1;
		int currentSortArrIndex = 0;
		while (currentFirstHalfIndex <= middle && currentSecondHalfIndex <= last) {
			if (strings[currentFirstHalfIndex].compareTo(strings[currentSecondHalfIndex]) < 0) {
				sortedArr[currentSortArrIndex++] = strings[currentFirstHalfIndex++];
			} else {
				sortedArr[currentSortArrIndex++] = strings[currentSecondHalfIndex++];
			}
		}
		while (currentFirstHalfIndex <= middle) {
			sortedArr[currentSortArrIndex++] = strings[currentFirstHalfIndex++];
		}
		while (currentSecondHalfIndex <= last) {
			sortedArr[currentSortArrIndex++] = strings[currentSecondHalfIndex++];
		}
		for (int i = 0; i < sortedArr.length; i++) {
			strings[i + first] = sortedArr[i];
		}
	}

	// logN level to divide N until 2 elements.
	// it takes N/2 steps to compareAndSwap N/2 pairs of elements in the last stage
	// it takes maximum N steps to merge 2 sub arrays in each stage
	// --> with logN stages, total time complexity to compare and merge all sub
	// elements:
	// N/2 + N(logN-1) = N(logN - 1/2)
	public static void sortStringArr(String[] strings, int first, int last) {
		if (first == last - 1) {
			compareAndSwap(strings, first, last);
		} else if (first < last) {
			sortStringArr(strings, first, (first + last) / 2);
			sortStringArr(strings, 1 + (first + last) / 2, last);
			mergeStringArr(strings, first, (first + last) / 2, last); // 1 step each time sortStringArry is called
		}
	}
}
