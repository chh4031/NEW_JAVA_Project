package section05_02;

public class exam02_p182 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		
		int sum2 = add( new int[] { 83, 90, 87} );// �޼ҵ忡�� �迭�� ���������Ƿ� ȣ���Ϸ��� new�� ����� �Ѵ�.
		System.out.println("���� :"+ sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) { //�޼ҵ��� �θ��µ� �ٸ� ���� �Լ��� �θ��� ���̶�� ���� �ȴ�.
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
