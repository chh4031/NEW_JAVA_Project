package section07_01;

public class quiz02_01_p330 {
	//�ʵ�
	public String nation;
	//������
	public quiz02_01_p330() {
		this("���ѹα�");//�������� �����ε�
		System.out.println("Parent() call");
	}
	
	public quiz02_01_p330(String nation) {
		this.nation = nation;
		System.out.println("Child("+ nation +") call");
		System.out.println("Child(String nation) call");
	}
}
