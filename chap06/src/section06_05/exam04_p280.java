package section06_05;

class Sing{
	//�̱��� ����� ���� ���� �ʵ带 �����Ѵ�. private�� ���� ������ �̴�.
	private static Sing singt = new Sing();
	
	//������
	private Sing(){
		
	}
	//���� �޼ҵ� ����
	static Sing getInstance() {
		return singt;
	}
}

//private�� ������ �ܺο��� �ʵ尪�� ������ �� ����. �׷��� getInstance()�� ����Ѵ�.
public class exam04_p280 {
	public static void main(String[] args) {
		/* ���� ������ private�� ���� ȣ���� �ȵȴ�.
		 * Sing obj1 = new Sing();
		 * Sing obj2 = new Sing();
		 */
		
		Sing obj1 = Sing.getInstance();
		Sing obj2 = Sing.getInstance();
		
		//System.out.println(obj1);
		
		if(obj1 == obj2) {
			System.out.println("���� Sing ��ü�̴�.");
		}else {
			System.out.println("�ٸ� Sing ��ü�̴�.");
		}
		//�̱����� ���α׷���ü���� �ϳ��� ��ü�� �����ϴ� ���̱⿡ obj1�� obj2�� �� ��ü�� ������ �� �� �ִ�.
		
		
	}

}
