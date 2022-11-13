package day12;

public class SquareInteger {

//	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Square Integer from 17 to 24: " + squareInteger(17,24));
		System.out.println("Square Integer from 3 to 9: " + squareInteger(3,9));
		System.out.println("Square Integer from 2 to 8: " + squareInteger(2,8));
		System.out.println("Square Integer from 0 to 100: " + squareInteger(0,100));
		System.out.println("Square Integer from 81 to 100: " + squareInteger(81,100));
//		System.out.println("count: " + count);
	}
	
	public static int sqrtIntNum(int num) {
		int l = 0;
		int r = num;
		int m = 0;
		//O logN
		while(l <= r) {
//			count++;
			m = (l + r) / 2;
			if(m*m < num)
				l = m + 1;
			else if(m*m > num)
				r = m - 1;
			else
				return m;
		}
			
		return m;
	}
	
	public static int squareInteger(int start, int end) {
		int sqrt = sqrtIntNum(start);
		int countSquareInteger = 0;
		//worst case: sqrt run from 0 to sqrt(end) -> O sqrt(end)
		while(sqrt*sqrt <= end) {
//			++count;
			if(sqrt*sqrt == start) {
				++countSquareInteger;				
				++sqrt;
				start = sqrt*sqrt;
			}else if(sqrt*sqrt > start) {
				++countSquareInteger;
				++sqrt;
				start = sqrt*sqrt;
			}else {
				++sqrt;
			}
		}	
		return countSquareInteger;
		//->total:  O sqrt(end)
	}

}
