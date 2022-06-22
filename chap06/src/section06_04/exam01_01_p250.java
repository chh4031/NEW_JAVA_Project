package section06_04;

public class exam01_01_p250 {
	
	//메소드
	void poweron() {//리턴값이 없는 void 메소드
		System.out.println("전원 켬");
	}
	
	int plus(int x, int y) {//리턴값이 있는 메소드
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {//double형 메소드 리턴값도 있음.
		double result = (double) x / (double) y;
		return result;
	}
	
	void poweroff() {
		System.out.println("전원 끔");
	}
}
