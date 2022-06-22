package section07_02;

public class exam02_03_p336 {
	public static void main(String[] args) {
		exam02_02_p336 child = new exam02_02_p336();
		exam02_01_p336 parent = child;//자동 타입 변환이 일어남.
		//exam02_01_p336 child1 = new exam02_02_p336(); //한줄로도 가능.
		
		parent.method1();//기본 부모 클래스에 있던 메소드1은 실행된다.
		parent.method2();//부모 클래스에도 메소드2는 있지만, 자식 클래스에서 메소드2에 대해 오버라이딩을 자동타입변환이 일어나면서 자식 클래스의 메소드2를 호출한다.
		//parent.method3();//이거는 부모 클래스에는 없지만, 자식클래스에는 존재한다. 그러나 상속으로 인해 자동타입변환에서는 자식 클래스의 메소드3은 사용이 불가능하다.
	}
}
