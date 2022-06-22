package test_1;

public class Cat {
	//필드 -> 인스턴스 변수라고도 한다.
	String name;//이름
	String breeds;//품종
	double weight;//무게
	
	//메소드
	void claw() {//return 값이 없는 void 형
		System.out.println("할퀴기!");
	}
	
	void maow() {
		System.out.println("야옹~");
	}
	
	
	public static void main(String[] args) {//메인 메소드, static는 정적 맴버라는 뜻, void는 리턴값이 없는 메소드.
		//객체의 생성
		Cat c = new Cat();//Cat클래스에서 메소드를 호출한다. 
		
		//객체의 필드를 변경한다.(상태변경)
		c.name = "네로";
		c.breeds = "페르시안";
		c.weight = 4.37;
		//주석처리 할시 null 0 등 필드의 기본값이 출력된다. 
		
		
		//객체의 필드를 출력한다. (변경된 필드를 출력)
		System.out.printf("이름 %s\n", c.name);
		System.out.printf("품종 %s\n", c.breeds);
		System.out.printf("무게 %.2fkg\n", c.weight);
	}

}
