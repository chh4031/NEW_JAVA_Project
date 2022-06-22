package section05_02;

public class exam08_p195 {
	public static void main(String[] args) {
		int[] oldarr = { 1, 2, 3};
		int[] newarr = new int[5];
		
		for(int i = 0; i<oldarr.length; i++) {// 배열을 복사하는 것.
			newarr[i] = oldarr[i];
		}
		
		for(int i = 0; i<newarr.length; i++) {
			System.out.println(newarr[i] + ",");
		}
	}
}
