package section05_02;

public class quiz01_p200 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for(int i=0;i<array.length;i++) {
			if(array[i] <= max) {
				max = max;
			}
			else {
				max = array[i];
			}
		}
		System.out.println("max = " + max);
	}

}
