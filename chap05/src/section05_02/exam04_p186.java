package section05_02;

public class exam04_p186 {
	public static void main(String[] args) {
		int[] arr = {83, 90, 87};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);
		
		double avg = (double) sum / arr.length;
		System.out.println("Æò±Õ : " + avg);
	}
}
