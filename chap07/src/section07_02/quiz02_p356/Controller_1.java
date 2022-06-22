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
		
		얘는 왜 안될까?
		이유 - Controller 클래스의 필드에서
		객체 필드가 MemberService로 정의되어 있다.
		즉 클래스가 MemberService이거나 이 객체의 자식 객체에만
		해당하는 코드라 볼 수 있다. 즉 Service는 
		MemberService의 부모객체 이지만, 정의된 객체는
		MemberService이므로 사용이 불가하다. 
		사용할라면 MemberService를 Service로 바꿔야함.
		아마 바꿔도 Service의 자식 객체도 다 사용 가능할듯.
		*/
	}

}
/* 현재 이 코드의 상속관계
 * 
 * Service - MemberService - AService
 * 부모 - 자식(또다른부모) - 자식
 * 모르겟으면 주석, Controller의 주석 참고.
*/
