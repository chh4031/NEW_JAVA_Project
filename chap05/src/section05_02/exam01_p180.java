package section05_02;

public class exam01_p180 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87}; //배열 생성
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum+=scores[i];
		}
		System.out.println(sum);
		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}
}
