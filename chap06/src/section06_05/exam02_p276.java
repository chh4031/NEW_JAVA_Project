package section06_05;

class Calculator{
	//인스턴스 필드
	int py = 1;
	//정적 필드
	//이 static의 특징중에 하나가 객체를 생성하지 않고 사용이 가능하다는 것이다.
	static double pi = 3.14159;
	
	//정적 메소드
	static int plus(int x, int y) {
		//this.py = 1; 단 정적 메소드에 인스턴스 필드를 가져오려 하면 오류가 발생한다.
		Calculator obj = new Calculator();
		obj.py = 1;// 인스턴스 멤버 사용을 위해서는 이렇게 객체 생성 이후에 참조 변수로 접근을 해야 맛이 안간다.
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}

public class exam02_p276 {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		//이 Calculator이라는 클래스의 pi라는 필드가 static 형식이어서 객체를 생성하지 않고 클래스이름.필드로 바로 접근이 가능하다고 알 수 있다.
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		//정적 멤버를 사용했음을 알 수 있다. 
		
		//py = 100; 인스턴스 맴버를 사용할 수없다. 왜냐하면 main()함수 또한 static으로 만들어진 정적 메소드 이기 때문이다.
		//인스턴스 맴버를 쓰기위해 우리가 객체를 생성해 주는 이유가 이때문임을 알 수 있다.
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}

