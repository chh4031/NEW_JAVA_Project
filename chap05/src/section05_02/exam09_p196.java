package section05_02;

public class exam09_p196 {
	public static void main(String[] args) {
		String[] oldarr = {"java", "array", "copy" };
		String[] newarr = new String[5];
		
		System.arraycopy(oldarr, 1, newarr, 0, 2);
		/* oldarr�� ���� ��� newarr�� �����ϴ� ��. 
		 * ù��° 0�� �����ҽ����� ��� ���� �ҷ�����
		 * �ι�° 0�� ����ҽ����� ��� ���� �ٿ�������
		 * �������� �������� �󸶸�ŭ �ҷ����� 3�̸� ���� 2�̸� �ι��������
		 */
		
		for(int i = 0; i<newarr.length; i++) {
			System.out.print(newarr[i] + ",");
		}
	}
}
