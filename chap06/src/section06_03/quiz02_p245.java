package section06_03;

public class quiz02_p245 {
	//�ʵ�
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	//������ - �ߺ��� this��
	quiz02_p245(String title, String content){
		this(title, content, "�α����� ȸ�� ���̵�", "���� ��ǻ�� ��¥", 0);
		
	}
	
	quiz02_p245(String title, String content, String writer){
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);
	}
	
	quiz02_p245(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
		
	}
	
	//������ ������, �ٸ� �������� ȣ��� 
	quiz02_p245(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
	}

}
