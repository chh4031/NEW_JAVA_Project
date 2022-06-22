package section05_02;

public class exam10_p198 {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {//score에 scores 배열의 첫번째부터 하나씩 넣어준다
			sum += score;
		}
		System.out.println(sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}
}
