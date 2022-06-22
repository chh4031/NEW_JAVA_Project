package section06_04;

public class exam03_p256 {
	public static void main(String[] args) {
		exam03_01_p256 mycar = new exam03_01_p256();
		
		mycar.setgas(0);//setgas 메소드 호출
		
		boolean gasstate = mycar.isleftgas();//isleftgas 메소드 호출
		if(gasstate) {
			System.out.println("출발합니다.");
			mycar.run();//run 메소드 호출
		}
		
		if(mycar.isleftgas()) {//gas의 필드값이 0이 된다. , isleftgas 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}//if(mycar.isleftgas())이 가능한 이유는 isleftgas의 메소드가 boolean값으로 리턴하기 때문이다.
	}
}
