package section05_02;

public class exam03_p184 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println("�迭 arr1["+ i + "] :" + arr1[i]);//�迭�� �������� �ȿ� ���� ��� �⺻�� 0�� ����.
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i<3; i++) {
			System.out.println("�迭 arr1["+ i + "] :" + arr1[i]);//�迭�� �ȿ� ���� ����������.
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.println("�迭 arr2["+ i + "] :" + arr2[i]);//�迭�� �������� �ȿ� ���� ���� �Ǽ����� ��� 0.1�� ����.
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("�迭 arr2["+ i + "] :" + arr2[i]);//�迭�� �ȿ� ���� ����������.
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println("�迭 arr3["+ i + "] :" + arr3[i]);//�迭�� �������� ���� ���������� �⺻�� null�� ����
		}
		
		arr3[0] = "��";
		arr3[1] = "��";
		arr3[2] = "��";
		for(int i = 0; i<3; i++) {
			System.out.println("�迭 arr3["+ i + "] :" + arr3[i]);//�迭 �ȿ� ���� ��������
		}
	}	
}
