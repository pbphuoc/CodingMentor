import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SINGLE NUMBER
//		int[] nums1 = { 2, 2, 1 };
//		int[] nums2 = { 4, 1, 2, 1, 2 };
//		int[] nums3 = { 1 };
//		int[] nums4 = { 6, 3, 1, 7, 2, 5, 8, 4 };
//		int[] nums5 = { 1, 0, 2, 3, 4, 0, 5, 6, 5, 6, 4, 3, 2, 1, 7 };

//		System.out.println("Single Number: " + findSingle(nums5));
//		mergeSort(nums5);
//		System.out.println("Sorted array: " + Arrays.toString(nums5));
//		System.out.println("Single number: " + findSingleNumber(nums5));
//		 PRIME NUMBER
//		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		for (int i = 0; i <= 100; i++) {
			System.out.println("Is " + i + " a Prime number? " + isPrimeNumber(i));
		}
		// PALINDROME
//		int[] intArr = { 1, 1, 1, 1 };
//		System.out.println("Is Palindrome: " + isPalindrome(intArr));
		// MIN MAX AVERAGE
//		int[] intArr = { 4, 6, 2, 1, 7, 9, 10, 15, 0 };
//		int min = intArr[0];
//		int max = intArr[0];
//		double average = 0;
//		for (int i = 0; i < intArr.length; i++) {
//			if (intArr[i] > max)
//				max = intArr[i];
//			if (intArr[i] < min)
//				min = intArr[i];
//			average += intArr[i];
//		}
//		System.out.println("Min is: " + min);
//		System.out.println("Max is: " + max);
//		System.out.println("Average is: " + Math.ceil(average * 100.00 / intArr.length) / 100.00);

		// GRADE
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter your average point of Maths: ");
//		Double mathsPoint = scanner.nextDouble();
//		System.out.println("Your Maths Grade is: " + getGrade(mathsPoint));
//		System.out.println("Please enter your average point of English: ");
//		Double englishPoint = scanner.nextDouble();
//		System.out.println("Your English Grade is: " + getGrade(englishPoint));
//		System.out.println("Please enter your average point of Literature: ");
//		Double literaturePoint = scanner.nextDouble();
//		System.out.println("Your Literature Grade is: " + getGrade(literaturePoint));
//
//		Double averagePoint = Math.ceil((mathsPoint + englishPoint + literaturePoint) * 100.00 / 3) / 100.00;
//		System.out.println("Your Average Point is: " + averagePoint);
//
//		Double minPoint = (mathsPoint > englishPoint) ? englishPoint : mathsPoint;
//		minPoint = (minPoint > literaturePoint) ? literaturePoint : minPoint;
//		char grade;
//		if (minPoint < 5) {
//			grade = 'F';
//		} else if (averagePoint - minPoint > 1) {
//			grade = getGrade(minPoint + 1);
//			System.out.println("Your Grade is: " + grade);
//		} else {
//			grade = getGrade(averagePoint);
//			System.out.println("Your Grade is: " + grade);
//		}
//		switch (grade) {
//		case 'S':
//			System.out.println("Excellent Student");
//			break;
//		case 'A':
//			System.out.println("Good Student");
//			break;
//		case 'B':
//			System.out.println("Normal Student");
//			break;
//		case 'C':
//			System.out.println("Average Student");
//			break;
//		case 'D':
//			System.out.println("Not Bad Student");
//			break;
//		case 'F':
//			System.out.println("Fail Student");
//			break;
//		}
//		scanner.close();
	}

	public static char getGrade(double point) {
		if (point >= 9)
			return 'S';
		else if (point >= 8)
			return 'A';
		else if (point >= 7)
			return 'B';
		else if (point >= 6)
			return 'C';
		else if (point >= 5)
			return 'D';
		else
			return 'F';
	}

	public static boolean isPalindrome(int[] numbers) {
		if (numbers.length == 0)
			return false;
		else if (numbers.length == 1)
			return true;
		else {
			for (int i = 0; i < numbers.length / 2; i++) {
				if (numbers[i] != numbers[numbers.length - 1 - i])
					return false;
			}
			return true;
		}
	}

	// final version. else cuối chỉ check mỗi số lẻ và chỉ chạy tới 1+num/3
	public static boolean isPrimeNumber(int number) {
		if (number <= 0)
			return false;
		else if (number <= 2)
			return true;
		else if (number % 2 == 0)
			return false;
		else {
			for (int i = 3; i < 1 + number / 3; i = i + 2) {
				if (number % i == 0)
					return false;
			}
			return true;
		}
	}

	public static void mergeSort(int[] nums) {
		// chia doi nums thanh nums1 va nums2
		int endIndex = nums.length - 1;
		int middleIndex = nums.length / 2;
		int firstHalfArrSize = middleIndex;
		int secondHalArrSize = endIndex - middleIndex + 1;
		int[] firstHalfArr = new int[firstHalfArrSize];
		int[] secondHalfArr = new int[secondHalArrSize];
		// copy qua 2 sub array
		for (int i = 0; i < firstHalfArrSize; i++) {
			firstHalfArr[i] = nums[i];
		}
		for (int i = 0; i < secondHalArrSize; i++) {
			secondHalfArr[i] = nums[i + firstHalfArrSize];
		}
		// tiep tuc goi recursive cho toi khi nums.length = 1 moi bat dau swap
		// vay tu nums.length de chia xuong con 1 thi se co' log2(nums.length) lan chia
		// lan chia dau tien ton 1 effort
		// lan chia thu 2 ton 2 effort
		// lan chia thu 3 ton 4 effort
		// lan chia thu log2(nums.length) ton 2^(log2(nums.length) - 1) effort
		// vay tong cong ton 2^0 + 2^1 + 2^2 +..+ 2^(log2(nums.length)-1) effort de goi
		// recursive
		if (firstHalfArrSize > 1)
			mergeSort(firstHalfArr);
		if (secondHalArrSize > 1)
			mergeSort(secondHalfArr);
		// merge 2 sorted subarray
		int firstArrCurrentIndex = 0;
		int secondArrCurrentIndex = 0;
		int currentNumsArrIndex = 0;
		// loop qua 2 sub array de compare va copy qua nums cho toi khi finish 1 trong 2
		// cai array
		// moi recursive se loop qua firstHalf va secondHalf, tuc la nums.length effort
		// co log2(nums.length) level, vay tong cong ton log2(nums.length) * nums.length
		// effort
		while ((firstArrCurrentIndex < firstHalfArrSize) && (secondArrCurrentIndex < secondHalArrSize)) {
			if (firstHalfArr[firstArrCurrentIndex] <= secondHalfArr[secondArrCurrentIndex]) {
				nums[currentNumsArrIndex++] = firstHalfArr[firstArrCurrentIndex++];
			} else {
				nums[currentNumsArrIndex++] = secondHalfArr[secondArrCurrentIndex++];
			}
		}
		// copy phan con lai cua 1 trong 2 cai array qua nums
		if (firstArrCurrentIndex < firstHalfArrSize) {
			nums[currentNumsArrIndex++] = firstHalfArr[firstArrCurrentIndex++];
		} else if (secondArrCurrentIndex < secondHalArrSize) {
			nums[currentNumsArrIndex++] = secondHalfArr[secondArrCurrentIndex++];
		}
		// vay tong cong se ton 2^0 + 2^1 + ... + 2^(log2(nums.length)-1) +
		// log2(nums.length) * nums.length effort
	}

	public static int findSingleNumber(int[] nums) {
		// vi array da sort nen worst cua findSingleNumber la 1 + nums.length / 2
		// vay tong cong effot de tim so single la 2^0 + 2^1 + ... +
		// 2^(log2(nums.length)-1) + log2(nums.length) * nums.length + 1 + nums.length /
		// 2
		int singleNumber = nums[0];
		if (nums.length == 1)
			return singleNumber;
		for (int i = 1; i < nums.length; i++) {
			if (singleNumber == nums[i])
				singleNumber = nums[++i];
			else
				return singleNumber;
		}
		return singleNumber;
	}

	public static int singleNumber(int[] nums) {
		int singleNumber = nums[0];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == nums.length)
				continue;
			boolean pairFound = false;
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println(Arrays.toString(nums));
				count++;
				if (nums[i] == nums[j]) {
					pairFound = true;
					nums[j] = nums.length;
					break;
				}
			}
			if (!pairFound) {
				singleNumber = nums[i];
				break;
			}
		}
		System.out.println("N: " + nums.length + " - loop: " + count);
		return singleNumber;
	}

	public static int findSingle(int[] nums) {
		int[] newNums = new int[nums.length];
		int singleNumber = 0;
		for (int num : nums) {
			if (newNums[num] == 0)
				newNums[num] = num;
			else if (newNums[num] == num)
				newNums[num] = nums.length;
		}

		for (int newNum : newNums) {
			if (newNum != nums.length && newNum != 0) {
				singleNumber = newNum;
				break;
			}
		}
		return singleNumber;
	}

}
