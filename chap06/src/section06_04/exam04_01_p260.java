package section06_04;

public class exam04_01_p260 {
	//메소드, 클래스 내부에서의 메소드 호출하는법
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {//avg 메소드에서 plus 메소드를 호출하여 사용
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void excute() {//excute 메소드에서 avg메소드를 호출하여 사용, 또한 println이라는 메소드도 호출하여 사용
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {//println이란 메소드를 정의
		System.out.println(message);
	}
}
