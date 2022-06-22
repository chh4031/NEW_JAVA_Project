package test_1;

public class StudentTest {
	public static void main(String[] args) {
		Student park = new Student(2019122194, "park");//��ü ����
		Student kim = new Student(2019122193, "kim");
		Student lee = new Student(2019122192, "lee");
		System.out.printf("Student�� ��ü�� �� : %d", Student.count);
	}
}

class Student{//���α׷� ���� �� class���� ��ǻ�� �޸𸮷� �ҷ��´�.
	static int count = 0;//static���� �����ؼ� Ŭ���� ������ ��.
	int id;//�ν��Ͻ� ����
	String name;//�ν��Ͻ� ����
	
	Student(int _id, String _name){//_id, _name �Ű������� _�̶� �پ��ٰ� �ٸ��� �ƴ� .
		Student.count++;//�ʵ忡 static�� ����ؼ� Ŭ���� �ʵ�� ����Ǿ���. �� ��ü ������ ���� �ʰ� Ŭ���� �̸����� ������ �����ϴ�.
		id = _id;//�ʵ尪�� ���ǽ�Ŵ
		name = _name;//�̰ŵ� �ʵ尪�� ���ǽ�Ŵ
	}
}
/*
 *���� ������ �޸� �����̶� ����
 *���� ������ main�� park kim lee�� �ְ�, �� ������ ���� �ʵ尪 2019122194 park�� ���� ���� �ִ�.
 *�̴� ���Լ��� (LIFO)�� Ư¡�� ������.
 */