package test_1;
public class AnimalTest {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Lion l = new Lion();
        Dog d = new Dog();
        Cat c = new Cat();
        Animal[] animals = {t, l, d, c};
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
    }
}

abstract class Animal {//추상클래스. Animal이란 클래스는 실제 사용하지 않는 클래스이다.그래서 추상클래스 선언
    String name;

    void cry() {
        System.out.println("동물이 웁니다");
    }
}

class Tiger extends Animal {
    void cry() {
        System.out.println("어흥!");
    }
}

class Lion extends Animal {
    void cry() {
        System.out.println("크아앙!");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("야옹~");
    }
}