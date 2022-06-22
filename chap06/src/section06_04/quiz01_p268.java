package section06_04;

public class quiz01_p268 {
	public static void main(String[] args) {
		quiz01_01_p268 memberService = new quiz01_01_p268();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		}
		else {
			System.out.println("id 또는 passward가 올바르지 않습니다.");
		}
	}

}
