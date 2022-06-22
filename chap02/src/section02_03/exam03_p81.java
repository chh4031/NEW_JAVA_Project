package section02_03;

public class exam03_p81 {
	public static void main(String[] args) {
		byte b1 = 10 + 20;
		System.out.println(b1);//피연산자가 변수가 아니므로 byte 가능
		
		byte x = 10;
		byte y = 20;
		int r = x + y;
		//byte r1 = x + y; 컴파일 에러 int형으로 바꿔서 연산 되므로 에러뜸.
		System.out.println(r);//피연산자가 byte이므로 int로 바꿔서 연산.
		
		byte bb1 = 10;
		int ii1 = 100;
		long ll1 = 1000L;
		long r1 = bb1 + ii1 + ll1;
		System.out.println(r1);//long형으로 계산되므로 long형으로 바꿈.
		
		float f1 = 1.02f;
		double d1 = 1.05;
		double dd1 = f1 + d1;
		System.out.println(dd1);//float형을 double로 바꿔서 계산
		
		int ii2 = 10;
		double dd2 = ii2 / 2.5;
		System.out.println(dd2);//int형으로 하면 2.5가 실수형이므로 오류가 떠서 double로 계산
		/* int a = 1
		 * int b = 2
		 * double c = (double)a / b;
		 * double c = a / (double)b;
		 * double c = (double)a / (double)b;
		 이렇게 하지 않으면 계산결과가 실수형으로 안나옴.*/
	}
}
