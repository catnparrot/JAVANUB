package ch06.sec07.exam02;

public class Korean_1 {
	//필드선언
	private String nation="대한민국";
	String name;
	String ssn;
	
	//생성자 선언: source -> generate constructor using field
	public Korean_1(String name, String ssn) {
		super();
		this.name = name;			//외부 name을 내부name(this.name)에 대입
		this.ssn = ssn;
	}
	

}

//자바는 기본적으로 private를 붙여 외부에서 건들지 못하게 함.