package section03_02;

public class exam04_p116 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int re1 = v1 + v2;
		System.out.println(re1);
		
		int re2 = v1 - v2;
		System.out.println(re2);
		
		int re3 = v1 * v2;
		System.out.println(re3);
		
		int re4 = v1 / v2;
		System.out.println(re4);
		
		int re5 = v1 % v2;
		System.out.println(re5);
		
		double re6 = (double)v1 / v2;
		System.out.println(re6);
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		
		char c3 = (char)(c1 - c2);//연산은 int로 되므로 char형으로 다시 변환하려면 써줘야함.
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
