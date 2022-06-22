package homework;

public class homework_03_03 {
	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 2;
		//double var3 = var1/var2;// 해당 연산은 정수연산을 한것으로 정수연산의 결과가 double타입에 저장되므로 2.0이 된다.
		double var3 = (double)var1 / var2;// 둘중 하나 또는 둘다 실수 연산으로 바꿔 주어야만 실수연산으로 인해 결과값이 2.5로 나온다.
		int var4 = (int) (var3*var2); // 2.0 * 2 = 4 이므로 결과값이 4가 나온다.
		System.out.println(var4);
	}

}
