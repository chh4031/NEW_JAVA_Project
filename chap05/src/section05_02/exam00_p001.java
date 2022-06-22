package section05_02;

public class exam00_p001 {
	public static void main(String[] args) {
		int[] arr = new int[3];//이런식으로도 가능하다. 배열 크기를 먼저 지정해주고
		arr = new int[] {1 ,2 ,3, 4};// 값을 넣어줌.
		System.out.println(arr[3]);
		System.out.println(arr.length);// new로 값을 새로 넣어서 길이도 변함.

		int[] arr1 = {5, 6, 7, 8};
		arr1 = new int[] {11, 12, 13};
		System.out.println(arr1.length);
		for(int i = 0; i < arr1.length;i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}
}
