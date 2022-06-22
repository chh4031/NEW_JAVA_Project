package section05_02;

public class exam03_p184 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println("배열 arr1["+ i + "] :" + arr1[i]);//배열만 정해지고 안에 값이 없어서 기본값 0이 나옴.
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i<3; i++) {
			System.out.println("배열 arr1["+ i + "] :" + arr1[i]);//배열에 안에 값을 지정해줬음.
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.println("배열 arr2["+ i + "] :" + arr2[i]);//배열만 정해지고 안에 값이 없어 실수형일 경우 0.1이 나옴.
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("배열 arr2["+ i + "] :" + arr2[i]);//배열에 안에 값을 지정해줬음.
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println("배열 arr3["+ i + "] :" + arr3[i]);//배열만 정해지고 값은 지정안해줌 기본값 null이 나옴
		}
		
		arr3[0] = "일";
		arr3[1] = "이";
		arr3[2] = "삼";
		for(int i = 0; i<3; i++) {
			System.out.println("배열 arr3["+ i + "] :" + arr3[i]);//배열 안에 값을 지정해줌
		}
	}	
}
