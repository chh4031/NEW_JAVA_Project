package test_1;
public class RPGTest1 {
    public static void main(String[] args) {
        Knight1 knight = new Knight1();
        knight.name = "킹아서";
        knight.hp = 150;
        knight.stamina = 70;
        knight.punch();
        knight.slash();
    }
}

class Novice1 {
    String name;
    int hp;

    void punch() {
        System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
    }
}

class Wizard1 extends Novice1 {
    int mp;

    void fireball() {
        System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n", name, hp, mp);
    }
}

class Knight1 extends Novice1 {
    int stamina;

    void slash() {
        System.out.printf("%s(HP: %d, ST: %d)의 슬래쉬!!\n", name, hp, stamina);
    }
}