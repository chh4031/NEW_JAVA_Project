package section07_02.quiz02_p356;

public class Controller {//�������� 4������ ����
	public MemberService service;//��ü �ʵ��� ����
	/*��ü �ʵ带 ������ ���� �� �տ� ��ü�̸��� ����Ѵ�. 
	 * �� MemberService��� Ŭ������ �������� ������ ������ �߻��Ѵ�. 
	 * �׷��� �����Լ����� ���� setService(new AService());�ص� �۵��� �ϴµ�
	 * �̴� AService�� ����ϴ� �θ� ��ü�� MemberService�̱⿡ �����ϴ�.
	 * �� erService service = new AService();�� ���� ��ü�� �����ϰ�,
	 * �ش� ��ü�� ���������� �ʵ��̸�����
	 * controller.service.login();���� �޼ҵ带 ����� �� ������ �� �� �ִ�.
	 */
	public void setService(MemberService service) {
		this.service = service;
	}
}


