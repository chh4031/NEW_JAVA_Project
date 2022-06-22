package section07_02;

class A{
}

class B extends A{
}
class C extends A{
}

class D extends B{
}
class E extends C{
}


public class exam01_p335 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		B bb = new D();
		C cc = new E();
		//위 둘은 상속 관계 이므로 가능하고, B D, C E 같은 객체를 참조한다.
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e;
		//C c2 = d;
		//위 둘은 상속 관계에 있지 않음을 의미한다.
		//이 코드의 상속 관계는 A - B, C 이고, B - D, C - E이다. (앞이 부모 뒤가 자식)
		//자동 타입 변환이 일어났음을 알 수 있고, 이럴때 부모 클래스의 필드와 메소드만 접근 가능하지만, 예외로 자식 클래스의 메소드가 오버라이딩 된 경우는 자식 메소드를 호출한다.
	}
}
