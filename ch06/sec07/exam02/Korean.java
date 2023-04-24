package ch06.sec07.exam02;

public class Korean {
	//필드선언
	String nation="대한민국";
	String name;
	String ssn;
	
	//생성자 선언: source -> generate constructor using field
	public Korean(String n, String s) {
		name = n; 
		ssn = s;
	}
}

//자바는 기본적으로 private를 붙여 외부에서 건들지 못하게 함.