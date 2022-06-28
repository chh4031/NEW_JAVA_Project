package section03_02;

public class exam07_p121 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);//두 타입이 같아야함. double형으로 변환됨.
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);//부동소수점 방식이 0.1을 제대로 표현못해서 값이 false임
		System.out.println((float)v4 == v5);//형을 맞추면 제대로 값이 나옴.
	}
}
