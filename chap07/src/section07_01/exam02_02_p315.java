package section07_01;
//�ڽ� Ŭ����
public class exam02_02_p315 extends exam02_01_p315 {
	//�ʵ�
	public int studentNo;
	
	//������
	public exam02_02_p315(String name, String ssn, int studentNo) {
		super(name, ssn);//�θ� Ŭ������ �����ڸ� ȣ���Ͽ� ����Ѵ�, �θ� �����ڰ� ������.
		//this.name = name;
		//this.ssn = ssn;
		this.studentNo = studentNo;
	}//super()�� �θ� �����ڿ��� ()���� �Ű������� ���� ��� �Ű������� �´� �θ� �����ڸ� ã�� ȣ����.
	//super()�� �ڽ� Ŭ������ ������ ù�ٿ� ��ġ�ؾ��ϰ�, super()�� ��õ��� ������ �����Ϸ��� �ڵ������� �����.
	//�ٸ� �����ڰ� ��������� ȣ��Ǿ� ���� ������ �⺻������ super()�� ����.
}
