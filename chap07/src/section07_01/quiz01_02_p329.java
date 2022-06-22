package section07_01;
//자식 클래스
public class quiz01_02_p329 extends quiz01_01_p329 {
	//필드
	private int no;
	
	//생성자
	public quiz01_02_p329(String name, int no) {
		super(name);
		this.no = no;
	}
}
/*
super(name);인 이유는 부모 클래스의 생성자가 있고, 자식 생성자에서 그것에 대해 호출시켜 줘야하므로
자식 클래스에서 super을 이용해 부모 클래스로부터 생성자를 호출해서 사용했다.abstract
*/