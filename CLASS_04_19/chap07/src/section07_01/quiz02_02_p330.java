package section07_01;

public class quiz02_02_p330 extends quiz02_01_p330 {
	//�ʵ�
	public String name;
	//������
	public quiz02_02_p330() {
		this("ȫ�浿");//�������� �����ε�
		System.out.println("Parent() call");
	}
	
	public quiz02_02_p330(String name) {
		this.name = name;
		System.out.println("Child("+ name +") call");
		System.out.println("Child(String name) call");
	}
}
