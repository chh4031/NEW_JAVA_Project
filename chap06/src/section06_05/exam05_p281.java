package section06_05;

class Person{
	//�ʵ弱�� , final�� ����Ѵ�. �̴� �ʵ��� �ʱⰪ�� ����Ǹ� �������� �Ǿ� ���α׷� �߰��� ������ �Ұ��ϴ�.
	final String nation = "Korea";//nation�� �ʵ忡�� ���ʿ� final�� ������ ���� �־��־���., 1�� ����̴�.
	final String ssn;//ssn�� ���� �ʱ�ȭ�� ���� �ʾ� ������ �߻��� �� �ִ�. �׷��� �����ڸ� �̿��ϴ� ������� ���� ������ �־���. 2�� ����̴�.
	String name;
	
	//���� �ΰ��� ������� final�� ���� �ʱ�ȭ ������ �� �ִ�.

	//�������� ����
	Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
}

public class exam05_p281 {
	public static void main(String[] args) {
		Person p1 = new Person("132456-123456", "ȫ�浿");//��ü ����. �� final�� ssn�� �̷��� ������ ��ü�� �Ű����� ���� ���� �ʱⰪ�� �޶��� �� �ִ�. �׷��� ����� �θ��� �ʴ´��� ���.
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; final �ʵ带 �߰��� �ٲ� �� ���⿡ �� �� �ڵ�� ������ �߻��Ѵ�.
		//p1.ssn="456789-4567899";
		p1.name = "ȫ���";//�� �ڵ�� ���� name�� �ν��Ͻ� �ʵ�� �ٲ�����.
		
		System.out.println(p1.name);
	}

}
