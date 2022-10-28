package day8.sort;

public class Sort {
	public static void demo() {
		int[] numArr = {1,2,2,0,0,1,2,2,1};
		System.out.print("Original array: ");
		for(int num: numArr) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.print("Sorted array: ");
		for(int num: sortArray(numArr)) {
			System.out.print(num + " ");
		}	
	}
	
	//same as Longest Same String, it takes 2^0 + 2^1 + ... 2^(log2(N) - 1) step to call Sort Array
	public static int[] sortArray(int[] numbers){
		if(numbers.length == 1)
			return numbers;
		else if(numbers.length == 2)
			return sortSubArrays(new int[]{numbers[0]}, new int[]{numbers[1]});
		
		int firstHalfSize = numbers.length / 2;
		int secondHalfSize = numbers.length / 2;
		if(numbers.length % 2 != 0)
			secondHalfSize += 1;
		int[] firstHalfNumbers = new int[firstHalfSize];
		int[] secondHalfNumbers = new int[secondHalfSize];
		for(int i = 0; i < firstHalfSize; i++){
			firstHalfNumbers[i] = numbers[i];
		}

		for(int i = 0; i < secondHalfSize; i++){
			secondHalfNumbers[i] = numbers[i + firstHalfSize];
		}
		return sortSubArrays(sortArray(firstHalfNumbers),sortArray(secondHalfNumbers));
		//O(2^0 + 2^1 + ... 2^(log2(N) - 1))
	}

	public static int[] sortSubArrays(int[] first, int[] second){
		int[] sortedNumbers = new int[first.length + second.length];
		int currentFirstIndex = 0;
		int currentSecondIndex = 0;
		int currentSortedIndex = 0;
		while(currentFirstIndex < first.length && currentSecondIndex < second.length)
		{
			if(first[currentFirstIndex] <= second[currentSecondIndex]){
				sortedNumbers[currentSortedIndex++] = first[currentFirstIndex++];
			}else{
				sortedNumbers[currentSortedIndex++] = second[currentSecondIndex++];		
			}
		}
	    
	    while(currentFirstIndex < first.length){
	        sortedNumbers[currentSortedIndex++] = first[currentFirstIndex++];
	    }
	    while(currentSecondIndex < second.length){
	        sortedNumbers[currentSortedIndex++] = second[currentSecondIndex++];	
	    }
	    
		return sortedNumbers;
	}    	
}
