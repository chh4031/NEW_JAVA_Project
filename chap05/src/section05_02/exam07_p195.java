package section05_02;

public class exam07_p195 {
	public static void main(String[] args) {
		String [] stry = new String[3];
		stry[0] = "java";
		stry[1] = "java";
		stry[2] = new String("java");
		
		System.out.println(stry[0] == stry[1]);// ����Ÿ�� String�� ���� ���� �����Ѵ�.
		System.out.println(stry[0] == stry[2]);// ����Ÿ�� String���� new�� ���� ������ ���̹Ƿ� �ٸ� ��ü�� �����Ѵ�. �׷��� false
		System.out.println(stry[0].equals(stry[1]));//���ڿ� �� �ȿ� �ִ� ���� ����
	}
}
