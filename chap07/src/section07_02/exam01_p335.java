package section07_02;

class A{
}

class B extends A{
}
class C extends A{
}

class D extends B{
}
class E extends C{
}


public class exam01_p335 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		B bb = new D();
		C cc = new E();
		//�� ���� ��� ���� �̹Ƿ� �����ϰ�, B D, C E ���� ��ü�� �����Ѵ�.
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e;
		//C c2 = d;
		//�� ���� ��� ���迡 ���� ������ �ǹ��Ѵ�.
		//�� �ڵ��� ��� ����� A - B, C �̰�, B - D, C - E�̴�. (���� �θ� �ڰ� �ڽ�)
		//�ڵ� Ÿ�� ��ȯ�� �Ͼ���� �� �� �ְ�, �̷��� �θ� Ŭ������ �ʵ�� �޼ҵ常 ���� ����������, ���ܷ� �ڽ� Ŭ������ �޼ҵ尡 �������̵� �� ���� �ڽ� �޼ҵ带 ȣ���Ѵ�.
	}
}
