package section07_01;

public class exam02_03_p315 {
	public static void main(String[] args) {
		exam02_02_p315 student = new exam02_02_p315("ȫ�浿", "1234", 1);
		
		//�θ𿡰� ��ӹ��� �ʵ带 ����Ѵ�. �����ڰ� �θ�κ��� ��ӹ޾Ƽ� ������� �� �� ����.
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		//�ڽ�Ŭ������ �⺻���� ������ �ִ� �ʵ��̰�, �̴� �����ڿ����� ���ǵǾ� ����.
		System.out.println("studentNO: " + student.studentNo);
	}

}
