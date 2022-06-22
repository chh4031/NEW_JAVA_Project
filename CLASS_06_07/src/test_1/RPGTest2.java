package test_1;
public class RPGTest2 {
    public static void main(String[] args) {
        Wizard2 wizard = new Wizard2();
        wizard.speed = 2;
        wizard.move();
        Knight2 knight = new Knight2();
        knight.speed = 3;
        knight.move();
    }
}

class Novice2 {
    String name;
    int hp;
    int speed;

    void punch() {
        System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
    }

    void move() {
        System.out.printf("%d 만큼 이동합니다.\n", speed);
    }
}

class Wizard2 extends Novice2 {
    int mp;

    void fireball() {
        System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n", name, hp, mp);
    }
}

class Knight2 extends Novice2 {
    int stamina;

    void slash() {
        System.out.printf("%s(HP: %d, ST: %d)의 슬래쉬!!\n", name, hp, stamina);
    }
}