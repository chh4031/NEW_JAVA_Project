package section06_06.exam04_01_p300;

public class exam04_01 {
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public exam04_01() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	//클래스 안에서는 private이든 default이든 사용 가능
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}

}
