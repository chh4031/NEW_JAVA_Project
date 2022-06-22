package section06_05;

class Person{
	//필드선언 , final를 사용한다. 이는 필드의 초기값이 저장되면 최종값이 되어 프로그램 중간에 수정이 불가하다.
	final String nation = "Korea";//nation은 필드에서 애초에 final를 지정해 값을 넣어주었다., 1번 방법이다.
	final String ssn;//ssn은 아직 초기화를 하지 않아 오류가 발생할 수 있다. 그러나 생성자를 이용하는 방법으로 값을 지정해 주었다. 2번 방법이다.
	String name;
	
	//위의 두가지 방법으로 final의 값을 초기화 시켜줄 수 있다.

	//생성자의 선언
	Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
}

public class exam05_p281 {
	public static void main(String[] args) {
		Person p1 = new Person("132456-123456", "홍길동");//객체 생성. 단 final의 ssn은 이렇게 생성된 객체의 매개변수 값에 따라 초기값이 달라질 수 있다. 그래서 상수라 부르지 않는다점 기억.
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; final 필드를 중간에 바꿀 수 없기에 이 두 코드는 오류가 발생한다.
		//p1.ssn="456789-4567899";
		p1.name = "홍삼원";//이 코드는 애초 name이 인스턴스 필드라 바꿔진다.
		
		System.out.println(p1.name);
	}

}
