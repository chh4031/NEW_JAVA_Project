package section06_05;

class Shop{
	//접근 제한자 private를 이용한 싱글톤 생성, 필드
	private static Shop shop_1 = new Shop();
	
	//생성자
	private Shop(){
		
	}
	
	//메소드
	static Shop getInstance() {
		return shop_1;
	}
}

public class quiz01_p285 {
	public static void main(String[] args) {
		Shop obj1 = Shop.getInstance();
		Shop obj2 = Shop.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Shop 객체이다.");
		}else {
			System.out.println("다른 Shop 객체이다.");
		}
		
	}
}
