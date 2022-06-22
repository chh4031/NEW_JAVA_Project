package test_1;
public class UpCastingTest {
    public static void main(String[] args) {
        Square1 s = new Square1();
        s.name = "정사각형";
        Triangle1 t = new Triangle1();
        t.name = "삼각형";
        Circle1 c = new Circle1();
        c.name = "원";
        Shape1[] shapes = {(Shape1) s,(Shape1) t,(Shape1) c};//업 캐스팅 (Shape1)은 생략가능
        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("%d번 인덱스의 도형: %s\n", i, shapes[i].name);
        }
    }
}

// 부모 클래스
class Shape1 { // 도형
    String name;
}

// 자식 클래스
class Square1 extends Shape1 {} // 정사각형

class Triangle1 extends Shape1 {} // 삼각형

class Circle1 extends Shape1 {} // 원