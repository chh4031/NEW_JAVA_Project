package section07_01;

public class quiz02_01_p330 {
	//필드
	public String nation;
	//생성자
	public quiz02_01_p330() {
		this("대한민국");//생성자의 오버로딩
		System.out.println("Parent() call");
	}
	
	public quiz02_01_p330(String nation) {
		this.nation = nation;
		System.out.println("Child("+ nation +") call");
		System.out.println("Child(String nation) call");
	}
}
