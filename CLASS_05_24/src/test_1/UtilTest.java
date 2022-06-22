package test_1;

public class UtilTest {
	public static void main(String[] args) {
		Util.m1();
		Util.m2();//인스턴스 메서드라 객체를 생성하고 호출해야 한다. 바로 아래처럼밀이다.
		Util util = new Util();
		util.m2();
	}
}

class Util{
	static void m1() {//얘는 static이라 객체 생성 없이 사용 가능함.
		System.out.println("클래스 메서드 m1()이가 호출됨.");
	}
	static void m2() {//얘는 인스턴스 메서드 이기 때문에 객체 생성이 필요하다. 그래서 위에서 객체를 생성했다. 아니면 이와 같이 static을 넣는다.
		System.out.println("클래스 메서드 m2()이가 호출됨.");
	}
}
/*
 * 여기서의 포인트는 static 을 선언하고도 객체를 생성해서 호출이 가능은 하다.
 * 근데 구지 객체를 생성해서 사용할 필요는 없다는 것이다.
 */