package test_1;

public class StudentTest {
	public static void main(String[] args) {
		Student park = new Student(2019122194, "park");//객체 생성
		Student kim = new Student(2019122193, "kim");
		Student lee = new Student(2019122192, "lee");
		System.out.printf("Student의 객체의 수 : %d", Student.count);
	}
}

class Student{//프로그램 실행 전 class부터 컴퓨터 메모리로 불러온다.
	static int count = 0;//static으로 선언해서 클래스 변수가 됨.
	int id;//인스턴스 변수
	String name;//인스턴스 변수
	
	Student(int _id, String _name){//_id, _name 매개변수임 _이라 붙었다고 다른거 아님 .
		Student.count++;//필드에 static을 사용해서 클래스 필드로 선언되었다. 즉 객체 생성을 하지 않고 클래스 이름으로 접근이 가능하다.
		id = _id;//필드값을 정의시킴
		name = _name;//이거도 필드값을 정의시킴
	}
}
/*
 *스택 영역을 메모리 영역이라 생각
 *스택 영역의 main에 park kim lee가 있고, 힙 영역에 그의 필드값 2019122194 park과 같은 것이 있다.
 *이는 후입선출 (LIFO)의 특징을 가진다.
 */