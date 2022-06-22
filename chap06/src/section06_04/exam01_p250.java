package section06_04;

public class exam01_p250 {
	public static void main(String[] args) {
		exam01_01_p250 myCalc = new exam01_01_p250();// 메소드 호출을 위한 객체 생성
		
		myCalc.poweron();//void 메소드 사용
		
		int result1 = myCalc.plus(5,6);//리턴값이 있는 메소드 사용
		System.out.println("result1" + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2" + result2);
		
		myCalc.poweroff();
	}
}
