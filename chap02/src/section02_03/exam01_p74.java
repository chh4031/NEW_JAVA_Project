package section02_03;

public class exam01_p74 {
	public static void main(String[] args) {
		byte bv = 10;
		int iv1 = bv;
		System.out.println(iv1);//byte를 int로 자동타입변환
		
		char cv = '가';
		int iv2 = cv;
		System.out.println(iv2);//char를 int로 자동타입변환
		
		int iv = 100;
		long lv1 = iv;
		System.out.println(lv1);//int를 long으로 자동타입변환
		
		long lv = 102;
		float fv1 = lv;
		System.out.println(fv1);//long을 float로 자동타입변환
		
		float fv = 100.6f;
		double dv1 = fv;
		System.out.println(dv1);//float를 double로 자동타입변환
	}
}
