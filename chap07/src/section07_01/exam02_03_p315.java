package section07_01;

public class exam02_03_p315 {
	public static void main(String[] args) {
		exam02_02_p315 student = new exam02_02_p315("홍길동", "1234", 1);
		
		//부모에게 상속받은 필드를 출력한다. 생성자가 부모로부터 상속받아서 출력함을 알 수 있음.
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		//자식클래스가 기본으로 가지고 있던 필드이고, 이는 생성자에서도 정의되어 있음.
		System.out.println("studentNO: " + student.studentNo);
	}

}
