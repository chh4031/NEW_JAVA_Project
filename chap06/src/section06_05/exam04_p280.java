package section06_05;

class Sing{
	//싱글톤 사용을 위한 정적 필드를 생성한다. private는 접근 제한자 이다.
	private static Sing singt = new Sing();
	
	//생성자
	private Sing(){
		
	}
	//정적 메소드 선언
	static Sing getInstance() {
		return singt;
	}
}

//private가 붙으면 외부에서 필드값을 변경할 수 없다. 그래서 getInstance()를 사용한다.
public class exam04_p280 {
	public static void main(String[] args) {
		/* 접근 제한자 private로 인해 호출이 안된다.
		 * Sing obj1 = new Sing();
		 * Sing obj2 = new Sing();
		 */
		
		Sing obj1 = Sing.getInstance();
		Sing obj2 = Sing.getInstance();
		
		//System.out.println(obj1);
		
		if(obj1 == obj2) {
			System.out.println("같은 Sing 객체이다.");
		}else {
			System.out.println("다른 Sing 객체이다.");
		}
		//싱글톤이 프로그램전체에서 하나의 객체만 생성하는 것이기에 obj1과 obj2의 두 객체가 같음을 알 수 있다.
		
		
	}

}
