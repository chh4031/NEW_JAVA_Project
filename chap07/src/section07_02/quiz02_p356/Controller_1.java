package section07_02.quiz02_p356;

public class Controller_1 {
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService());
		controller.service.login();
		
		/*
		controller.setService(new Service());
		controller.service.login();
		
		��� �� �ȵɱ�?
		���� - Controller Ŭ������ �ʵ忡��
		��ü �ʵ尡 MemberService�� ���ǵǾ� �ִ�.
		�� Ŭ������ MemberService�̰ų� �� ��ü�� �ڽ� ��ü����
		�ش��ϴ� �ڵ�� �� �� �ִ�. �� Service�� 
		MemberService�� �θ�ü ������, ���ǵ� ��ü��
		MemberService�̹Ƿ� ����� �Ұ��ϴ�. 
		����Ҷ�� MemberService�� Service�� �ٲ����.
		�Ƹ� �ٲ㵵 Service�� �ڽ� ��ü�� �� ��� �����ҵ�.
		*/
	}

}
/* ���� �� �ڵ��� ��Ӱ���
 * 
 * Service - MemberService - AService
 * �θ� - �ڽ�(�Ǵٸ��θ�) - �ڽ�
 * �𸣰����� �ּ�, Controller�� �ּ� ����.
*/
