package section06_04;

public class exam02_p253 {
	public static void main(String[] args) {
		exam02_01_p253 myCom = new exam02_01_p253();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});//���� �迭�� ���������ϴ� ��İ� ���� ����̴�. �迭�� �޼ҵ� �Ű����������� �����ߴ�.
		System.out.println("result2 " + result2);
		
		int result3 = myCom.sum2(1,2,3);//���� ���� �Ű������� �޶����Ƿ� ���⼭�� 3���� �־��⿡ �ڵ����� �迭�� �����ǰ� �׿� �°� �۵��Ѵ�.
		System.out.println("result3 " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);//���� result3�� ����
		System.out.println("result4 " + result4);
		
	}
}
