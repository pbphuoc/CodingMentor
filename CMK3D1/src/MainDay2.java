import java.util.Scanner;

public class MainDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int h, w;
		while (true) {
			try {
				System.out.print("Please input your height in cm: ");
				h = Integer.parseInt(s.nextLine());
				if (!(h >= 50 && h <= 300)) {
					System.out.println("Invalid output. Only integer number from 50 to 300. Please try again");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Invalid output. Only integer number from 50 to 300. Please try again");
				continue;
			}
		}
		while (true) {
			try {
				System.out.print("Please input your weight in kg: ");
				w = Integer.parseInt(s.nextLine());
				if (!(w >= 10 && w <= 500)) {
					System.out.println("Invalid output. Only integer number from 10 to 500. Please try again");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Invalid output. Only integer number from 10 to 500. Please try again");
				continue;
			}
		}
		double BMI = calculateBMI(h / 100.00, w);
		System.out.println("Your BMI is: " + BMI);
		if (BMI < 18.5) {
			System.out.println("Underweight!");
		} else if (BMI <= 24.9) {
			System.out.println("Normal weight!");
		} else if (BMI <= 29.9) {
			System.out.println("Overweight!");
		} else {
			System.out.println("Obesity!");
		}
		s.close();
	}

	public static double calculateBMI(double h, int w) {
		double BMI = w / (h * h);
		return Math.round(BMI * 100.00) / 100.00;
	}

	public static double Average(double x, double y, double z) {
		return (x + y + z) / 3;
	}

	public static void Swap(Integer a, Integer b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
