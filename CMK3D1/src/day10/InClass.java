package day10;

public class InClass {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,7,6,15,17,5,10,11};
		
		insertionSort(arr);
//		bubbleSort(arr);
		for(int i : arr)
			System.out.println(i);
		System.out.println("Count: " + count);
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int correctPosition = i;
			int currentValue = arr[i];
			for(int j = i - 1; j >= 0; j--) {
				++count;
				if(currentValue < arr[j]) {
					arr[j+1] = arr[j];
					correctPosition = j;
				}else {
					break;
				}
			}
			arr[correctPosition] = currentValue;
		}
	}
	
	public static int findPosition(int value, int[] arr, int upperIndex, int lowerIndex) {
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
	
	public static void selectionSort(int[] arr) {		
		for(int i = 0; i < arr.length - 1; i++) {
			int smallestNumIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				++count;
				if(arr[j] < arr[smallestNumIndex]) {
					smallestNumIndex = j;
				}
			}

			int tempValue = arr[i];
			arr[i] = arr[smallestNumIndex];
			arr[smallestNumIndex] = tempValue;
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			boolean nothingToSwap = true;
			for(int j = 0; j < arr.length - i - 1; j++) {
				++count;
				if(arr[j+1] < arr[j]) {
					int tempValue = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tempValue;
					nothingToSwap = false;
				}
			}
			if (nothingToSwap)
				break;
		}
	}
}
