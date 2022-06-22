package section07_01;

public class exam01_03_p311 {
	public static void main(String[] args) {
		//자식 클래스의 객체 생성.
		exam01_02_p311 dmb = new exam01_02_p311("자바폰", "검정", 10);//exam01_02라는 자식 클래스의 객체를 생성함.
		exam01_01_p311 dmb1 = new exam01_01_p311();//부모 클래스의 객체도 생성해봄.
		
		//exam01_01인 부모 클래스로 부터 상속받은 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		//exam01_02가 원래 가진 필드
		System.out.println("채널 : " + dmb.channel);
		
		//exam01_01인 부모 클래스로 부터 상속받은 메소드의 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보쇼");
		dmb.receiveVoice("당신 누구야");
		dmb.sendVoice("반갑소");
		dmb.hangUp();
		
		//exam01_02 클래스가 원래 가진 메소드의 호출
		dmb.turnOnDmb();
		dmb.changechannelDmb(12);
		dmb.turnOffDmb();
		//exam01_01인 부모 클래스로 부터 exam01_02의 자식 클래스가 상속을 받아 실행하는 것이다.
		
		if(dmb == dmb1) {
			System.out.println("객체가 같다.");
		}else {
			System.out.println("객체가 다르다.");
		}
	}//만들어진 객체는 서로 다름.

}
