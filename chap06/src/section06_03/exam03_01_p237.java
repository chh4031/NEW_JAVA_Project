package section06_03;

public class exam03_01_p237 {
	//필드
	String nation = "대한민국";//필드에서 값을 지정해 초기화 했다.
	String name;
	String ssn;
	//그러나 name과 ssn은 따로 값을 지정해주지 않았다.
	
	//생성자
	public exam03_01_p237(String name, String ssn) {//생성자를 이용해서 필드 값을 초기화 시킨다.
		/*
		name = name; 이렇게 필드와 매개변수를 동일하게 쓸 수 없다. 그러나 this를 사용하면 가능하다.
		ssn = ssn;
		*/
		
		this.name = name;
		this.ssn = ssn;
	}
}
