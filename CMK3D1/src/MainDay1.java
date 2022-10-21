import java.util.Scanner;

public class MainDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("Input x: ");
			double x = s.nextDouble();
			if (x==-1)
				break;
			System.out.print("Input y: ");
			double y = s.nextDouble();			
			double q1 = Math.sqrt(x*x + y*y);		
			double q2 = (x>=y) ? x : y;
			double multiplier = 1;
			while(true) {
				double oldQ2 = q2;
				if(q2*q2 < x*x + y*y) {
					q2 = q2 + q2 * multiplier;
					if(q2*q2 > x*x + y*y) {
						multiplier = multiplier/2;
					}
				}else if(q2*q2 > x*x + y*y){
					q2 = q2 - q2 * multiplier;
					if(q2*q2 < x*x + y*y) {
						multiplier = multiplier/2;
					}
				}else {
					break;
				}
				if(RoundUp2Dec(oldQ2) == RoundUp2Dec(q2)) {
					break;
				}
			}		
			System.out.println("So q1 is: " + RoundUp2Dec(q1));
			System.out.println("So q2 is: " + RoundUp2Dec(q2));
		}
	}
	
	public static double RoundUp2Dec(double a) {
		return Math.round(a*100.0)/100.0;
	}

}
