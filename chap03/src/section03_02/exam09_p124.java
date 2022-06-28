package section03_02;

public class exam09_p124 {
	public static void main(String[] args) {
		int result = 0;
		result += 10;//10
		System.out.println("result = " + result);
		result -= 5;//5
		System.out.println("result = " + result);
		result *= 3;//15
		System.out.println("result = " + result);
		result /= 5;//3
		System.out.println("result = " + result);
		result %= 3;//0
		System.out.println("result = " + result);
	}
}//대입연산, result값은 누적값으로 변경됨.
