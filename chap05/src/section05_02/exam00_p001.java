package section05_02;

public class exam00_p001 {
	public static void main(String[] args) {
		int[] arr = new int[3];//�̷������ε� �����ϴ�. �迭 ũ�⸦ ���� �������ְ�
		arr = new int[] {1 ,2 ,3, 4};// ���� �־���.
		System.out.println(arr[3]);
		System.out.println(arr.length);// new�� ���� ���� �־ ���̵� ����.

		int[] arr1 = {5, 6, 7, 8};
		arr1 = new int[] {11, 12, 13};
		System.out.println(arr1.length);
		for(int i = 0; i < arr1.length;i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}
}
