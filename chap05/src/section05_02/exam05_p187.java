package section05_02;

public class exam05_p187 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족");
			System.exit(0);// 매개변수 지정이 되지 않았을때 실행. run configurations에서 arguments에서 매개변수 값을 주고 실행 단 적은 값은 문자열로 인식함.
		}
		
		String strNum1 = args[0];
		String strNum2= args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int re = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + re);
		
	}
}
