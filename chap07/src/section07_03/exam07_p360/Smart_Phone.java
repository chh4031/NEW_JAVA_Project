package section07_03.exam07_p360;

public class Smart_Phone extends Phone{//Phone 객체 상속
	
	//생성자
	public Smart_Phone(String owner) {
		super(owner);//super 키워드로 부모 클래스의 필드값에 접근
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("InternetON");
	}

}
