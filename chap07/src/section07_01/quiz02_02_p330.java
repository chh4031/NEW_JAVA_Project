package section07_01;

public class quiz02_02_p330 extends quiz02_01_p330 {
	//필드
	public String name;
	//생성자
	public quiz02_02_p330() {
		this("홍길동");//생성자의 오버로딩
		System.out.println("Parent() call");
	}
	
	public quiz02_02_p330(String name) {
		this.name = name;
		System.out.println("Child("+ name +") call");
		System.out.println("Child(String name) call");
	}
}
