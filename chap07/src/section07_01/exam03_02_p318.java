package section07_01;
//�ڽ� Ŭ����
public class exam03_02_p318 extends exam03_01_p318 {
	@Override
	//@Override�� �����ص� �ǳ� �������̵��� �޼ҵ��� ���� �����Ϸ��� Ȯ�ν�Ŵ. ���°� ����
	double areaCircle(double r) {
		System.out.println("exam03_02 ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
//�ڽ� Ŭ�������� �޼ҵ� areaCircle() �޼ҵ带 return�κп��� �θ� Ŭ������ ���ڰ� �ƴ� Math.PI��� �ڹ� �⺻ API�� �ٲپ���.
/*
 * �������̵� ���� �θ� �޼ҵ�� ����Ÿ��, �޼ҵ��̸�, �Ű� ������ ����� �����ؾ��ϰ�, 
 * ���� ������ �� ���ϰ� �� �� ������, 
 * ���ο� ���ܿ� ���� throws�� �Ұ����ϴ�.
 */
