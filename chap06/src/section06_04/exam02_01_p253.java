package section06_04;

public class exam02_01_p253 {
	int sum1(int[] values) {//�Ű������� ������ �𸦶� �迭�� �̿�
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
		//System.out.println("���"); return�� ���Ŀ��� ��µ����ʴ´�. ������ �߻� ��. return ���� if�� ���� ������ ���� ���� �׷��� �ƴ��ϴ�. ���ܵ� �����Ѵٴ���.
		
	}
	
	
	int sum2(int ... values) {//���� ���� �ڵ����� �迭�� �����ǰ�, �Ű������� ���ȴ�.
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
