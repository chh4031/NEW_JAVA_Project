package section07_02.quiz02_p356;

public class Controller {//연습문제 4번과도 연관
	public MemberService service;//객체 필드의 생성
	/*객체 필드를 생성할 때는 맨 앞에 객체이름을 써야한다. 
	 * 즉 MemberService라는 클래스가 존재하지 않으면 오류가 발생한다. 
	 * 그런데 메인함수에서 보면 setService(new AService());해도 작동을 하는데
	 * 이는 AService가 상속하는 부모 객체가 MemberService이기에 가능하다.
	 * 즉 erService service = new AService();가 들어가서 객체를 생성하고,
	 * 해당 객체를 생성했으니 필드이름으로
	 * controller.service.login();으로 메소드를 사용할 수 있음을 알 수 있다.
	 */
	public void setService(MemberService service) {
		this.service = service;
	}
}


