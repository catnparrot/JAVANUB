package ch03.sec08;

public class BitLogicEx {

	public static void main(String[] args) {
		int a = 5;
		int b = 15;
		
		/*
		a=0b101, b=0b1111
		a=>0000000000000101, b=>0000000000001111
				*/
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		
		System.out.println("");
		
		
		int x = 25;			//11001
		int y = 13;			//01101
		
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		
	}
}
