package Design_sing02;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("이장훈", "스팀밀크");
		User user2 = new User("이여진", "바닐라라떼");
		User user3 = new User("김치수", "아메리카노");
		user1.make();
		user2.make();
		user3.make();
	}
}
