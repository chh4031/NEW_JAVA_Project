package Design_sing04;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("이장훈", "스팀밀크");
		user1.start();
		User user2 = new User("이여진", "바닐라라떼");
		user2.start();
		User user3 = new User("김치수", "아메리카노");
		user3.start();
	}
}
