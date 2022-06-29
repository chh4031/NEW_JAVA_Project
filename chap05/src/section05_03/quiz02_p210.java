package section05_03;

public class quiz02_p210 {
	public static void main(String[] args) {
		quiz01_p210 result = quiz01_p210.FAIL_PASSWARD;
		if(result == quiz01_p210.SUCESS) {
			System.out.println("로그인 완료");
		}else if(result == quiz01_p210.FAIL_ID) {
			System.out.println("아이디 실패");
		}else if(result == quiz01_p210.FAIL_PASSWARD) {
			System.out.println("비밀번호 실패");
		}else {
			System.out.println("값 없음");
		}
	}
}
