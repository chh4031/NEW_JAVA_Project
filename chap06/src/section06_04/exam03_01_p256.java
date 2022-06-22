package section06_04;

public class exam03_01_p256 {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setgas(int gas) {//리턴값이 없는 void
		this.gas = gas;
	}
	
	boolean isleftgas() {
		if(gas == 0) {
			System.out.println("gas가 없다.");
			return false;//false 리턴
		}
		System.out.println("gas가 있다.");
		return true;//true 리턴
	}//boolean 값을 리턴하는 것을 알 수 있다.
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas 잔여량 " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다. (gas 잔여량 " + gas + ")");
				return;//리턴값이 없음을 의미한다.
			}
		}
	}
}
