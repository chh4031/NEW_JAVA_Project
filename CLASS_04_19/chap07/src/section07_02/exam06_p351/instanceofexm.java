package section07_02.exam06_p351;

public class instanceofexm {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {//instanceof로 객체를 확인함.
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공.");
		}else {
			System.out.println("method1 - Child로 변환 안됨.");
		}
	}
	
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();//Child객체의 자동 타입 변환 발생.
		method1(parentA);
		//if(parent instanceof Child) 부모클래스로 변환된 Child객체가 Child 안에 있는지 확인함. 맞으므로 true반환
		method2(parentA);
		//method2는 확인없이 바로 강제타입 변환을 실시해서 만약 Child가 자동타입변환 상태가 아닐 경우 오류가 발생할 수 있음.
		
		Parent parentB = new Parent();//Parent객체의 생성
		method1(parentB);
		//if(parent instanceof Child) 의 Parent객체는 Child 안에 없으므로 false 작동함. 그래서 else문이 작동함.
		method2(parentB);
		//확인하지 않고, 바로 강제타입변환을 실시하려 했으므로 강제타입 변환이 가능한 (부모 - 부모) 즉 부모 클래스이므로 강제 타입 변환이 불가능함.
	}
}
