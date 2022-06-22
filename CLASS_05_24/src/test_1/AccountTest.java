package test_1;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();//객체 생성, acc 레퍼런스 변수 즉 객체를 생성하기 위한 변수. 기억안날 수 있으니 적어둠.
		//acc.balance = 1000;//private로 지정된 필드에 접근하려 해서 오류가 발생한다.
		acc.setBalance(1000);
		System.out.printf("잔액 : %d", acc.getBalance());
	}

}

class Account{
	private int balance;//잔액은 private를 사용함. 외부에서 아무데나 접근을 못하게 함.
	//또한 Account와 AccountTest의 클래스가 달라 private 필드의 값에 접근이 당연히 안된다.
	
	//get 메소드
	public int getBalance() {//메서드 안에서 필드값을 리턴해서 반환해 준다.
		return balance;//같은 클래스 안에서 사용해서 private라도 오류가 발생하지 않는다.
	}
	//set 메서드
	public void setBalance(int b) {//메서드 안에서 매개변수를 주어 필드값이 변경 가능하게 해준다.
		balance = b;//같은 클래스 안에서 사용해서 private라도 오류가 발생하지 않는다.
	}
}
//게터와 세터 메소드는 그냥 getBalance라는 메서드가 따로 있는 것이 아니라 사용자가 get과 set을 가지고 만든 것이다.
//단 관례는 get + 필드이름.
