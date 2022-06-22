package section02_03;

public class exam06_p91 {
	public static void main(String[] args) {
		int num1 = 123;
		System.out.printf("ARS : %dn\n", num1);
		System.out.printf("ARS : %6dn\n", num1);
		System.out.printf("ARS : %-6dn\n", num1);
		System.out.printf("ARS : %06dn\n", num1);
		
		double num2 = num1 * 0.345;
		System.out.printf("A : %d, B : %3.3f", num1, num2);
		
		String f1 = "ddddd";
		String f2 = "aaaaa";
		System.out.printf("f1 : %-10s, f2 : %10s", f1, f2);
		
		
	}
}
