package section02_02;

public class exam04_p68 {
	public static void main(String[] args) {
		float f1 = 0.12f; //float f1 = 0.12;는 에러
		double f2 = 0.12;
		
		float a1 = 0.123456789123456789f;
		double a2 = 0.123456789123456789;
		
		double c1 = 3e6;
		float c2 = 3e6f;
		double c3 = 2e-6;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(a1);
		System.out.println(a2);//double가 float보다 2배 정밀
		
		System.out.println(c1);//e사용
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
