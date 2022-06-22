package section07_01;
//자식 클래스
public class exam02_02_p315 extends exam02_01_p315 {
	//필드
	public int studentNo;
	
	//생성자
	public exam02_02_p315(String name, String ssn, int studentNo) {
		super(name, ssn);//부모 클래스의 생성자를 호출하여 사용한다, 부모 생성자가 있을시.
		//this.name = name;
		//this.ssn = ssn;
		this.studentNo = studentNo;
	}//super()는 부모 생성자에서 ()안의 매개변수가 있을 경우 매개변수에 맞는 부모 생성자를 찾아 호출함.
	//super()는 자식 클래스의 생성자 첫줄에 위치해야하고, super()가 명시되지 않으면 컴파일러가 자동적으로 명시함.
	//다른 생성자가 명시적으로 호출되어 있지 않으면 기본적으로 super()로 사용됨.
}
