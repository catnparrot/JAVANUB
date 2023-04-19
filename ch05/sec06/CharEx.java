package ch05.sec06;

public class CharEx {
	public static void main(String[] args) {
		//문자열 추출
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
		}
	}

}
