package test_1;
public class MoreKeywords1 {
    public static void main(String[] args) {
        Item2 item2 = new Item2();
        System.out.printf("[%s](%d 골드) 생성 완료\n", item2.name, item2.price);
    }
}

class Item2 {
    String name;
    int price;

    Item2(String name, int price) { // 입력변수가 String, int인 생성자
        this.name = name;
        this.price = price;
    }

    Item2() { // 입력변수가 없는 생성자
        this("이름 없음", -1);
    }
}