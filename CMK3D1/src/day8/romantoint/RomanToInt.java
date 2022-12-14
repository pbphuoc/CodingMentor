package day8.romantoint;

public class RomanToInt {
	public static void demo() {
		String roman1 = "III";
		String roman2 = "IV";
		String roman3 = "IX";
		String roman4 = "LVIII";
		String roman5 = "MCMXCIV";
		
		System.out.println(roman1 + " = " + romanToInt(roman1));
		System.out.println(roman2 + " = " + romanToInt(roman2));
		System.out.println(roman3 + " = " + romanToInt(roman3));
		System.out.println(roman4 + " = " + romanToInt(roman4));
		System.out.println(roman5 + " = " + romanToInt(roman5));	
	}
	
	public static int romanToInt(String romanString) {
		int number = 0;
		//always need to access all characters in string s so time complexity is O(n)
		for(int i = 0; i < romanString.length(); i++) {
			if(i == romanString.length() - 1) {
				number += getRomanValue(romanString.charAt(i));
			}else if(getRomanValue(romanString.charAt(i)) < getRomanValue(romanString.charAt(i+1))) 				
				number -= getRomanValue(romanString.charAt(i));
			else
				number += getRomanValue(romanString.charAt(i));	
		}
		return number;
		//O(n)
	}
	
	public static int getRomanValue(char romanSymbol) {
		switch(romanSymbol) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;				
		}
	}
}
