package ch05.sec00;

public class Test02 {
	
	public static int function(int a, int b, int c) {
		int min=0;
		if (a>b) {	if(b>c) {min=c;} else {min=b;}		}
		else {if(a>c) {min = c;} else {min=a;}		}

		for(int i = min; i>0; i--) {
			if(a%i==0 && b%i==0 && c%i==0) {return i;}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
	}
}
