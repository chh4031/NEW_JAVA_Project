package test_1;

public class Dog {//내부 클래스를 사용.
	//필드 -> 인스턴스 변수라고도 한다.
	String name;//이름
	String breeds;//품종
	int age;//나이
	
	//메소드
	void wag() {//return 값이 없는 void 형
		System.out.printf("[%s] 살랑살랑~\n", name);//인스턴스 변수인 name값을 불러온다. 메인메소드에서 값을 주었기에 그 값이 필드에 저장되어 들어간다.
	}
	
	void bark() {
		System.out.printf("[%s] 멍멍!\n", name);
	}
	
	void bark(int times) {//메소드의 오버로딩 , 매개변수의 값을 달리 주었다.
		String sound = "컹컹";
		System.out.printf("[%s] %s(x%d)\n", name, sound, times);//매개변수 times가 들어가고, 메소드 안의 변수 sound가 들어가고 필드값 name이 들어간다.
		for(int i = 1; i < times+1; i++) {
			System.out.printf("[%s] %s(%d회)\n", name, sound, i);
		}
	}
	
	public static void main(String[] args) {//메인 메소드, static는 정적 맴버라는 뜻, void는 리턴값이 없는 메소드.
		//객체의 생성
	Dog d1 = new Dog();//Dog클래스에서 메소드를 호출한다. 
	Dog d2 = new Dog();	
	
		//객체의 필드를 변경한다.(상태변경)
		d1.name = "망고";
		d1.breeds = "골든리트리버";
		d1.age = 2;
		//주석처리 할시 null 0 등 필드의 기본값이 출력된다. 
		
		d2.name = "까미";
		d2.breeds = "잡종";
		d2.age = 3;
		
		System.out.printf("d1 => {%s, %s, %d세}\n", d1.name, d1.breeds, d1.age);
		System.out.printf("d2 => {%s, %s, %d세}\n", d2.name, d2.breeds, d2.age);

		//d1 부분
		d1.wag();//꼬리치기
		d1.bark();//짖기
		d1.bark(3);//짖기 여러번
		
		//d1 부분
		d2.wag();//꼬리치기
		d2.bark();//짖기
		d2.bark(3);//짖기 여러번
		
	
	}
}
