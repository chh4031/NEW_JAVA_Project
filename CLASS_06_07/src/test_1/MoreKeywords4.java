package test_1;
public class MoreKeywords4 {
    public static void main(String[] args) {
        Weapon3 w1 = new Weapon3("장검", 1200, 10);
        Weapon3 w2 = new Weapon3();
        w1.printInfo();
        w2.printInfo();
    }
}

abstract class Item5 {
    protected String name; // 이름
    protected int price; // 가격

    Item5(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Item5() {
        this("이름 없음", -1);
    }
}

class Weapon3 extends Item5 {
    protected int power; // 공격력

    Weapon3(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    Weapon3() {
        this("이름 없음", -1, -1);
    }

    void printInfo() {
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
                super.name, super.price, this.power);
        //protected로 사용해서 같음 패키지의 자식클래스로 접근은 가능함.
    }
}