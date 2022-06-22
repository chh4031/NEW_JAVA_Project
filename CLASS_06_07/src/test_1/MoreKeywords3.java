package test_1;
public class MoreKeywords3 {
    public static void main(String[] args) {
        Weapon1 w1 = new Weapon1("장검", 1200, 10);
        Weapon1 w2 = new Weapon1();
        w1.printInfo();
        w2.printInfo();
    }
}

abstract class Item3 {
    private String name; // 이름
    private int price; // 가격

    public Item3(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Item3() {
        this.name = "이름 없음";
        this.price = -1;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Weapon1 extends Item3 {
    private int power; // 공격력

    Weapon1(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    Weapon1() {
        super();
        this.power = -1;
    }

    void printInfo() {
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
        super.getName(), super.getPrice(), this.power);
        //private라 새터 메소드를 씀.
    }
}