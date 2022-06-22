package test_01;

public class GuGudan {
	public static void main(String[] args) {
		int result = 0;
		for(int a = 1; a < 10; a++){
			for(int b = 1; b < 10; b++) {
				result = a * b;
				System.out.printf("%d X %d = %d\n", a, b, result);
			}
			System.out.println("\n");
		}
	}
}
	
