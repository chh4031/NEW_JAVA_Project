package section06_05;

class Earth{
	//����� ����̴�. �� static �� �������� final�� ���� �ٲܼ� ���� �� �ΰ����� �������� ������ �Ѵ�.
	//����� �Һ��� ���� �����ϴ� ������ final���� �ٸ��� ��ü�� �ʱ�ȭ�Ǵ� ������ �����Ǿ� ������.
	//�� ���� ������ exam05_p281���� ssn�̶� final�ʵ�� ���� �޼ҵ忡�� ��ü ���� ���� ���� ���� ��ü�� ���� �ٸ��� �� �� �ִ�. �׷��Ƿ� ������ ���� �ʴ´�.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	//static���� �����Ǿ� ��ü�� �������� �ʰ� final�� �̿��� ������ ���� ��밡���ϴ�.
}

public class exam06_p283 {
	public static void main(String[] args) {
		System.out.println("������ ������ : " + Earth.EARTH_RADIUS + "km");
		System.out.println("������ ǥ���� : " + Earth.EARTH_AREA + "km^2");
	}

}
