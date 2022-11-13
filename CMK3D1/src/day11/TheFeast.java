package day11;

public class TheFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//O(log base exchange of wrapper)
		System.out.println("The Feast 10,2,5: " + theFeast(10,2,5));
		System.out.println("The Feast 12,4,4: " + theFeast(12,4,4));
		System.out.println("The Feast 6,2,2: " + theFeast(6,2,2));
	}
	
	public static int theFeast(int money, int cost, int exchange) {
		int totalBar = money / cost;
		int currentWrappers = totalBar;
		do {
			totalBar += currentWrappers / exchange; 
			currentWrappers = currentWrappers / exchange  + currentWrappers % exchange;					
		}
		while(currentWrappers / exchange != 0);			
		//starting with wrapper = money/cost 
		//- > Time Complexity of this while loop: (log base exchange of wrapper) 
		return totalBar;
	}
}
