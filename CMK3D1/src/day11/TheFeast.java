package day11;

public class TheFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//O(log base exchange of m) 
		System.out.println("The Feast: " + theFeast(12,4,4));
	}
	
	public static int theFeast(int money, int cost, int exchange) {
		int totalBar = money / cost;
		int currentWrappers = totalBar;
		do {
			currentWrappers = currentWrappers - exchange + currentWrappers % exchange;
			totalBar += currentWrappers / exchange;;		
		}
		while(currentWrappers / exchange != 0);			
		//b = money/cost 
		//- > Time Complexity of this while loop: (log base exchange of m) 
		return totalBar;
	}
}
