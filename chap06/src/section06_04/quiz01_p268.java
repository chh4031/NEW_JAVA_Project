package section06_04;

public class quiz01_p268 {
	public static void main(String[] args) {
		quiz01_01_p268 memberService = new quiz01_01_p268();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			memberService.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� passward�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
