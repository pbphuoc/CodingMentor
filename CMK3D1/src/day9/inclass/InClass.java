package day9.inclass;

public class InClass {
	public static int findIndexOf(int value, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(value == arr[i])
				return i;
			else if(value <  arr[i])
				return -1;
		}
		return -1;
	}
	
	//binary search
	public static int findIndex(int value, int[] arr) {
		int upperIndex = arr.length - 1;
		int lowerIndex = 0;
		while(upperIndex >= lowerIndex) {
			if(arr[lowerIndex] > value || arr[upperIndex] < value)
				return -1;
			int middleIndex = (upperIndex + lowerIndex)/2;
			if(value < arr[middleIndex]) {
				upperIndex = middleIndex - 1;
			}else if(value > arr[middleIndex]) {
				lowerIndex = middleIndex + 1;
			}else {
				return middleIndex;
			}
		}
		return -1;
	}
}
