//equals 사용 이유

package ch03.sec11;

public class Test01 {
	public static void main(String[] args) {
		String a = "abc";
		//String b = "abc";
		String b = "aabc";
		String c = new String("abc");		//new -> 별도의 메모리 공간을 만들어라
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));	
		System.out.println(System.identityHashCode(c));	
			//출력 >1023487453		1651191114		1586600255
		
		//컴퓨터가 저장할 때는 배열로 저장
	}
}
