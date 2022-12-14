package day8.longestsamestring;

public class LongestSameString {
	public static void demo() {
		String[] strs1 = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "racecar", "car"};
		
		System.out.print("String 1: ");
		for(String str: strs1) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("longest matched string: " + getCommonPreFix(strs1));
		System.out.print("String 2: ");
		for(String str: strs2) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("longest matched string: " + getCommonPreFix(strs2));	
	}
	
	//simpler one
	public static String getCommonPreFix(String[] strings) {
		String commonPrefix = "";
		if(strings.length > 1) {
			commonPrefix = compare2String(strings[0],strings[1]);
			for(int i = 2; i < strings.length; i++) {
				if(commonPrefix.equalsIgnoreCase(""))
					return commonPrefix;
				else
					commonPrefix = compare2String(commonPrefix, strings[i]);
			}
		}
		return commonPrefix;
	}
	/*
	 * words.length = N
	 * the idea is to keep dividing N element until we have either 1 pair of strings left (compare those 2 strings) or 1 single string left (return that whole string)
	 * if some of the prefix letters in those 2 match, we return the prefix letters; 
	 * we return immediately as soon as a non-matched character is found; if 0 character matched, return ""
	 * so after log2(N) division times, N becomes N/N
	 * N 1step
	 * N/2 N/2 2steps
	 * N/4 N/4 N/4 N/4 4steps
	 * N/8 N/8 N/8 N/8 N/8 N/8 N/8 N/8
	 * and it takes 2^0 + 2^1 + ... N/2 steps to call getMatchedString
	*/	
	public static String getMatchedString(String[] words){
		if(words.length == 1)
			return words[0];
		else if(words.length == 2){
			return compare2String(words[0],words[1]);
		}
		
		int firstHalfSize = words.length/2;
		int secondHalfSize = words.length/2;
		if(words.length % 2 != 0)
			secondHalfSize += 1;
		String[] firstHalfWords = new String[firstHalfSize];
		String[] secondHalfWords = new String[secondHalfSize];
		for(int i = 0; i < firstHalfSize; i++){
			firstHalfWords[i] = words[i];
		}
		for(int i = 0; i < secondHalfSize; i++){
			secondHalfWords[i] = words[i + firstHalfSize];
		}	
		return compare2String(getMatchedString(firstHalfWords),getMatchedString(secondHalfWords));
		//O(2^0 + 2^1 + ... N/2)
	}

	public static String compare2String(String a, String b){
		if(a.equals("") || b.equals(""))
			return "";
		String matchedStr = "";
		int i = 0;
		while(i < a.length() && i < b.length()){
			if(a.charAt(i) == b.charAt(i))
				matchedStr += a.charAt(i);
			else
				break;
			++i;
		}
		return matchedStr;
	}
}
