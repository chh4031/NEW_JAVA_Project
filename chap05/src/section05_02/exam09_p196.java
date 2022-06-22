package section05_02;

public class exam09_p196 {
	public static void main(String[] args) {
		String[] oldarr = {"java", "array", "copy" };
		String[] newarr = new String[5];
		
		System.arraycopy(oldarr, 1, newarr, 0, 2);
		/* oldarr의 값을 모두 newarr에 복사하는 것. 
		 * 첫번째 0은 원본소스에서 어디서 부터 불러올지
		 * 두번째 0은 복사소스에서 어디서 부터 붙여넣을지
		 * 마지막은 원본에서 얼마만큼 불러올지 3이면 전부 2이면 두번재까지만
		 */
		
		for(int i = 0; i<newarr.length; i++) {
			System.out.print(newarr[i] + ",");
		}
	}
}
