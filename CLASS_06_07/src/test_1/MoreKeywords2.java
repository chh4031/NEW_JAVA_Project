package test_1;
public class MoreKeywords2 {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
}

abstract class Item4 {//객체 생성 안하는 추상클래스
    String name; // 이름
    int price; // 가격

    Item4(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Item4() {
        this.name = "이름 없음";
        this.price = -1;
    }
}

class Weapon extends Item4 {
    int power; // 공격력

    Weapon(String name, int price, int power) {
        super(name, price);//부모 생성자를 호출하는 역할을 한다.
        this.power = power;
    }

    Weapon() {//객체 생성에 인자를 넣지 않을 경우 이 생성자가 호출됨 즉 w2임
        super();//부모 클래스의 생성자중 인자가 없는 것을 호출 item4()를 호출한다.
        this.power = -1;
    }

    void printInfo() {
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
                super.name, super.price, this.power);
    }
}