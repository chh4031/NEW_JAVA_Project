package section06_04;

public class exam02_p253 {
	public static void main(String[] args) {
		exam02_01_p253 myCom = new exam02_01_p253();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});//위의 배열을 먼저선언하는 방식과 같은 방식이다. 배열을 메소드 매개변수값으로 선언했다.
		System.out.println("result2 " + result2);
		
		int result3 = myCom.sum2(1,2,3);//값에 따라 매개변수가 달라지므로 여기서는 3개를 주었기에 자동으로 배열이 생성되고 그에 맞게 작동한다.
		System.out.println("result3 " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);//위의 result3와 동일
		System.out.println("result4 " + result4);
		
	}
}
