package section07_02;
//메인코드
public class exam05_03_p349 {
	public static void main(String[] args) {
		exam05_01_p349 parent = new exam05_02_p349();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "data2";
		parent.method3();
		오버라이딩 되지 않은 자식 클래스의 메소드는 사용을 못한다. 부모 클래스로부터 상속 받은 거만 사용가능하다. 특히나 자동타입 변환이 일어나서 그렇다.
		자동타입 변환이 일어나서 자식 클래스가 부모 클래스가 되어 부모 클래스의 필드와 메소드 밖에 못쓴다. 예외로 오버라이딩된 메소드만 사용 가능하다.
		*/
		
		exam05_02_p349 child = (exam05_02_p349) parent;//부모 클래스로 자동타입변환이 일어난 자식 클래스를 다시 자식 클래스로 바꾸는 과정이다.
		child.field2 = "yyy";
		child.method3();
		//자동타입변환된 자식 클래스를 강제 타입 변환을 이용해 다시 자식 클래스로 가져왔다.
		//즉 자식클래스 -> 부모 클래스 -> 자식클래스 로 자식 클래스는 변화 했다. 그 과정에서 자식 클래스는 자동타입변환 1번, 강제타입변환 1번 일어났음을 알 수있다.
		//단 강제타입 변환은 부모 타입으로 처음부터 명시된 클래스는 타입 변환이 불가하다.
	}
}
