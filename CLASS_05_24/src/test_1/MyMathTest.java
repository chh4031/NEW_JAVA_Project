package test_1;

public class MyMathTest {
	public static void main(String[] args) {
		System.out.println(MyMath.max(1.23,3.45));
		System.out.println(MyMath.max(5.43,3.21));
		//객체를 생성하지 않고, 바로 클래스.메서드로 실행이 가능하다.
		//즉 인스턴스 메서드가 아니므로 가능하다. 클래스 메서드 이기에 가능.
		//객체를 생성하는 부분이 없어 코드를 간결히 쓸 수 있다는 장점이 있다.
		
	}
}

class MyMath{
	
	static double max(double a, double b) {
		return (a>b) ? a : b;
	}
	static double min(double a, double b) {
		return (a<b) ? a : b;
	}
	//static으로 클래스 메소드를 선언. static이므로 객체를 생성하지 않고 메서드를 선언가능하다.
	
}
/*
 * 클래스 메서드(static method)
 * - 객체생성없이 동작
 * 인스턴스 메서드(non-static method)
 * - 객체 생성이 있어야 작동
*/