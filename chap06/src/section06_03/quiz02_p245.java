package section06_03;

public class quiz02_p245 {
	//필드
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	//생성자 - 중복은 this로
	quiz02_p245(String title, String content){
		this(title, content, "로그인한 회원 아이디", "현재 컴퓨터 날짜", 0);
		
	}
	
	quiz02_p245(String title, String content, String writer){
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	quiz02_p245(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
		
	}
	
	//마지막 생성자, 다른 생성자의 호출용 
	quiz02_p245(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
	}

}
