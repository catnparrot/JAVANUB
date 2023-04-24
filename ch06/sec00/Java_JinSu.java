package ch06.sec00;

import java.util.Scanner;

public class Java_JinSu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ken = Integer.parseInt(sc.next());
		
		sc.close();
		
		System.out.println(ken);
		System.out.println(Integer.toBinaryString(ken));
		System.out.println(Integer.toOctalString(ken));
		System.out.println(Integer.toHexString(ken));
	}
}