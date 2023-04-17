package ch03.sec09;

public class BitShiftEx {
	public static void main(String[] args) {
		int n1 =1;
		int r1 = n1 << 3;
		int r2 = n1 * (int) Math.pow(2, 3);
		System.out.println("result1: " + r1);
		System.out.println("result2: " + r2);
		
		int n2 = -8;
		int r3 =n2 >> 3;
		int r4 =n2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + r3);
		System.out.println("result4: " + r4);
	}

}
