package section05_02;

public class exam10_p198 {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {//score�� scores �迭�� ù��°���� �ϳ��� �־��ش�
			sum += score;
		}
		System.out.println(sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}
}
